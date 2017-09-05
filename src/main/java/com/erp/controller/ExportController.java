package com.erp.controller;

import com.erp.config.ERPConstants;
import com.erp.model.*;
import com.erp.service.ExportService;
import com.erp.service.MemberCountryService;
import com.erp.service.MemberService;
import com.erp.service.StudentInfoService;
import com.erp.utils.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class ExportController {

    @Autowired
    private ExportService exportService;

    @Autowired
    private StudentInfoService studentInfoService;

    @Autowired
    private MemberCountryService memberCountryService;
    @Autowired
    private MemberService memberService;

    protected static Logger logger= LoggerFactory.getLogger(ExportController.class);
    @RequestMapping("index")
    public String index(HttpServletRequest request, int oaId,String startDate,HttpServletResponse response) {
        logger.info("进入ExportController——>oaId="+oaId+"startDate="+startDate);
        Map map=getPermission(oaId,startDate);
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

    private Map getPermission(Integer oaId,String startDate){
        Map map =new HashMap();
        //根据员工id查询职务和负责国家
        Member member=memberService.getByOaId(oaId);
        if(member==null || member.getId()==null){
            logger.error("员工信息不存在：OA ID为"+oaId);
        }
        List<Integer> countryIds=new ArrayList<>();
        if(member.getPosition()==3 ) {
            //暂时写死
            if (oaId == 43) { //澳新
                countryIds.add(1);
                countryIds.add(2);
            } else if (oaId == 383) {  //美加
                countryIds.add(4);
                countryIds.add(5);
            } else if (oaId == 11222) { //英国
                countryIds.add(3);
            } else {
                countryIds.add(1);
                countryIds.add(2);
                countryIds.add(3);
                countryIds.add(4);
                countryIds.add(5);
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

        //根据职务和负责国家查询转案人为该员工的申请信息。
       logger.info("本次员工关联的国家信息有"+countryIds.size()+"条");
        for(int i=0;i<countryIds.size();i++){
            MemberApply memberApply=new MemberApply();
            memberApply.setCountryId(countryIds.get(i));
            //专员经理等
            if(member.getPosition()==1 || member.getPosition()==2){
                memberApply.setMemberId(member.getOaId());
            }
            if(startDate!=null && !"".equals(startDate)){
                memberApply.setExpectStartDate(startDate);
            }
            List<ExportParam> exports=exportService.export( memberApply);
            logger.info("结束查询-》本次查询的国家为"+countryIds.get(i)+"，查到的记录为"+exports.size());
            if(exports.size()>0) {
                if (countryIds.get(i) == 1 || countryIds.get(i) == 2) {
                    map.put("exports", exports);
                } else if (countryIds.get(i) == 3) {
                    map.put("england", exports);
                } else if (countryIds.get(i) == 4) {
                    map.put("usa", exports);
                } else if (countryIds.get(i) == 5) {
                    map.put("ca", exports);
                }
            }
           if(exports!=null &&exports.size()>0){
               map.put("total",exports);
           }
        }

        return map;

    }
    @RequestMapping("/export")
    public void export(HttpServletResponse response){
       /* HSSFWorkbook wb=exportService.export();
        try{
            OutputStream output = response.getOutputStream();
            response.addHeader("Content-Disposition", "inline;filename="
                    + new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date()) + ".xls");
            response.setContentType("application/msexcel");
            wb.write(output);
            output.close();
        }catch (Exception e){

        }*/
    }

    @RequestMapping("student")
    public void student(HttpServletRequest request) {
       StudentInfo studentInfo= new StudentInfo();
       studentInfo.setSystemNo("dkjfskljsl");
        List<StudentInfo> studentInfos= studentInfoService.getList(studentInfo);
        System.out.println(studentInfos!=null);
        studentInfo = studentInfoService.getStudentInfoById("dkjfldjslkd");
        System.out.println();
    }
}
