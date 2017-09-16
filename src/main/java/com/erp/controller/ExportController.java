package com.erp.controller;

import com.erp.config.ERPConstants;
import com.erp.config.MemberConstant;
import com.erp.model.*;
import com.erp.service.*;
import com.erp.utils.ExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;

@RestController
public class ExportController {

    @Autowired
    private ExportService exportService;

    @Autowired
    private ApplyService applyService;

    @Autowired
    private MemberCountryService memberCountryService;
    @Autowired
    private MemberService memberService;

    @Autowired
    private TransferCaseService transferService;


    protected static Logger logger= LoggerFactory.getLogger(ExportController.class);

    @RequestMapping(name="index",method= RequestMethod.GET)
    public String index(HttpServletRequest request,MemberApply memberApply, HttpServletResponse response) {
        logger.info("进入ExportController——>oaId="+memberApply.getMemberId()+"startDate="+memberApply.getStartDate()+"endDate="+memberApply.getEndDate());
        Map map=getResultData(memberApply);
        if(map.isEmpty()){
            return  ERPConstants.RESPONSECODE_NODATE;
        }
        File file = null;
        InputStream inputStream = null;
        ServletOutputStream out = null;
        try{
            request.setCharacterEncoding("UTF-8");
            file = new ExcelUtil().createExcel(request,map, "myExcel","all.ftl");//调用创建excel帮助类
            inputStream = new FileInputStream(file);
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/msexcel");
            response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode("文签大表" + ".xls", "UTF-8"));
            out = response.getOutputStream();
            byte[] buffer = new byte[512]; // 缓冲区
            int bytesToRead = -1;
            // 通过循环将读入的Excel文件的内容输出到浏览器中
            while ((bytesToRead = inputStream.read(buffer)) != -1) {
                out.write(buffer, 0, bytesToRead);
            }
            out.flush();
            if (inputStream != null) {
                inputStream.close();
            }
          file.delete();
        }catch(Exception e){

        }
        return null;
    }

    private Map getResultData(MemberApply memberApply){
        Map map =new HashMap();
        int oaId=0;
        //根据员工id查询职务和负责国家
        if(memberApply.getMemberId()!=null){
            oaId=memberApply.getMemberId();
        }
        Member member=memberService.getByOaId(oaId);
        if(member==null || member.getId()==null){
            logger.error("员工信息不存在：OA ID为"+oaId);
            throw new RuntimeException("员工信息不存在，请核实！");
        }

        List<Integer> countryIds=getCountryIds(oaId,member.getPosition());
        logger.info("本次员工关联的国家信息有"+countryIds.size()+"条");

        List<ExportParam> totalList=new ArrayList<>();
        List<ExportParam> aoList=new ArrayList<>();
        //根据职务和负责国家查询转案人为该员工的申请信息。
        for(int i=0;i<countryIds.size();i++){
            MemberApply memberApplyInfo=new MemberApply();
            memberApplyInfo.setCountryId(countryIds.get(i));
            //专员经理等
            if(member.getPosition()==1 || member.getPosition()==2){
                memberApplyInfo.setMemberId(member.getOaId());
            }
            if(memberApply.getStartDate()!=null && memberApply.getEndDate()!=null){
                memberApplyInfo.setEndDate(memberApply.getEndDate());
                memberApplyInfo.setStartDate(memberApply.getStartDate());
            }
            List<ExportParam> exports=exportService.export(memberApplyInfo);
            logger.info("结束查询-》本次查询的国家为"+countryIds.get(i)+"，查到的记录为"+exports.size());

            if(exports.size()>0) {
                if (countryIds.get(i) == 1 || countryIds.get(i) == 2) {
                    if(exports!=null &&exports.size()>0) {
                        totalList.addAll(exports);
                        aoList.addAll(exports);
                    }
                } else if (countryIds.get(i) == 3) {
                    if(exports!=null &&exports.size()>0) {
                        totalList.addAll(exports);
                    }
                    map.put("england", exports);
                } else if (countryIds.get(i) == 4) {
                    if(exports!=null &&exports.size()>0) {
                        totalList.addAll(exports);
                    }
                    map.put("usa", exports);
                } else if (countryIds.get(i) == 5) {
                    if(exports!=null &&exports.size()>0) {
                        totalList.addAll(exports);
                    }
                    map.put("ca", exports);
                }
            }

        }
        if(aoList.size()>0){
            map.put("exports", aoList);
        }
        if(totalList.size()>0){
            map.put("total",totalList);
        }
        return map;

    }

    /***
     * 查询员工所负责的国家信息
     * @param oaId
     * @param position
     * @return
     */
    private List<Integer> getCountryIds(int oaId, Integer position) {
        List<Integer> countryIds=new ArrayList<>();
        if((position == MemberConstant.POSITION_MANAGER)) {
            //暂时写死
            if (oaId == 43) { //澳新
                countryIds.add(MemberConstant.COUNTRY_AUSTRALIA);
                //countryIds.add(2);
            } else if (oaId == 383) {  //美加
                countryIds.add(MemberConstant.COUNTRY_USA);
                countryIds.add(MemberConstant.COUNTRY_CANADA);
            } else if (oaId == 11222) { //英国
                countryIds.add(MemberConstant.COUNTRY_ENGLAND);
            } else {
                countryIds.add(MemberConstant.COUNTRY_AUSTRALIA);
                //countryIds.add(2);
                countryIds.add(MemberConstant.COUNTRY_ENGLAND);
                countryIds.add(MemberConstant.COUNTRY_USA);
                countryIds.add(MemberConstant.COUNTRY_CANADA);
            }
        }else{
            List<MemberCountry> memberCountries=memberCountryService.getListByOaId(oaId);

            for(int i=0;i<memberCountries.size();i++){
                MemberCountry country=memberCountries.get(i);
                if(!countryIds.contains(country.getCountryId())){
                    countryIds.add(country.getCountryId());
                }

            }
        }
        return countryIds;
    }

    @RequestMapping("/transfer")
    public TransferCase transfer(Integer type){
       return getTransferInfo("11649",type);
    }

    @RequestMapping(value="student",method=RequestMethod.POST)
    public List<Apply> student(MemberApply memberApply) {
        List<String> stuNos=new ArrayList<>();
        stuNos.add("15201");
        stuNos.add("82432");
        return applyService.getByStuNos(stuNos,new Date(),null);
    }

    /**
     * 获取转案信息
     * @param systemNo 学号
     * @param type 角色id，1-销售顾问 2-文案 3-外联 4-业务员 5-后续员
     * @return
     */
    private TransferCase  getTransferInfo(String systemNo, int type) {
        String operator="";
        TransferCase transferCase=new TransferCase();
        transferCase.setRole(type);
        transferCase.setStudentNo(systemNo);
        List<TransferCase> caseList=transferService.getOperator(transferCase);
        if(caseList.size()>0){
            for(TransferCase result:caseList){
                if(result.getMemberName()!=null){
                    operator=operator+result.getMemberName()+";";
                }
            }
            transferCase.setMemberName(operator);
            if(caseList.get(0).getReceive()!=null){
                transferCase.setReceive(caseList.get(0).getReceive());
            }
        }
        return transferCase;
    }
}
