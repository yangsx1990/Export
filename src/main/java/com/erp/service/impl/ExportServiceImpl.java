package com.erp.service.impl;

import com.erp.mapper.ExpertMapper;
import com.erp.mapper.VisaMapper;
import com.erp.model.*;
import com.erp.service.*;
import com.erp.utils.ExportUtil;
import com.erp.utils.ListToMap;
import com.mysql.jdbc.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Sumif;
import org.apache.poi.ss.formula.functions.T;
import org.hibernate.validator.internal.util.Contracts;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ExportServiceImpl implements ExportService {

    @Value("${admin.sale.column}")
    private String adminColumn;

    @Autowired
    private ExpertMapper expertMapper;
    @Autowired
    private VisaService visaService;

    @Autowired
    private StudentInfoService studentInfoService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private ApplyService applyService;

    @Autowired
    private TransferCaseService transferCaseService;
    @Autowired
    private PlanService planService;
    @Autowired
    private SupplementService supplementService;

    @Autowired
    private ReplyService replyService;

    @Autowired
    private  StudentCopywritingService copywritingService;

    @Autowired
    private DegreeService degreeService;

    @Autowired
    private  ExperienceService experienceService;

    @Autowired
    private  ExamService examService;

    @Autowired
    private AfterBusinessService afterBusinessService;

    @Override
    public List<Expert> queryList() {
        List<Expert> experts=new ArrayList<>();
        Expert expert= expertMapper.selectByPrimaryKey(41);
        experts.add(expert);
        return experts;
    }

    @Override
    public List<ExportParam> export() {
        List<TransferCase> cases= getCases(1);
        List<Apply> applyList=new ArrayList<>();
       for(TransferCase transferCase1:cases){
          Apply apply= applyService.getApplyById(transferCase1.getApplyId());
           applyList.add(apply);
       }
        String [] columns= adminColumn.split(",");
        List<ExportParam> exports=new ArrayList<>();
        for(Apply apply:applyList){
            ExportParam exportParam=new ExportParam();

            Reply reply=setOfferReply(apply.getId());
            Supplement supplement=getSupplement(apply.getId());

            if(apply.getApplyType()==1){
                exportParam.setMainApply(apply);
                exportParam.setMainSupplement(supplement);
               Reply replyResult=setParamsReply(apply.getId(),reply);
                exportParam.setMainReply(replyResult);
            }else if(apply.getApplyType()==2){
                exportParam.setLangApply(apply);
                exportParam.setLangSupplement(supplement);
                Reply replyResult=setParamsReply(apply.getId(),reply);
                exportParam.setLangReply(replyResult);

            }/*else if(apply.getApplyType()==3){
                exportParam.setMainStayApply(apply);

            }else if(apply.getApplyType()==4){
                exportParam.setLangStayApply(apply);
            }*/
            if(apply.getApplyType()==1 && apply.getRelationStatus()==1){
                Apply langApply= getStayInfo(apply.getId(),2);
               if(langApply.getId()!=null){
                   Reply langReply=setOfferReply(langApply.getId());
                   Reply replyResult=setParamsReply(langApply.getId(),langReply);
                   exportParam.setLangReply(replyResult);
               }
                exportParam.setLangApply(langApply);
                exportParam.setLangSupplement(supplement);

                //主课住宿
                Apply mainStayApply=getStayInfo(apply.getId(),3);
                if(mainStayApply.getId()!=null){
                    exportParam.setMainStayApply(mainStayApply);
                    Reply mainStayReply=setOfferReply(mainStayApply.getId());
                    if(mainStayReply.getId()!=null){
                        Reply replyMainStayResult=setParamsReply(mainStayApply.getId(),mainStayReply);
                        exportParam.setMainStayReply(replyMainStayResult);
                    }

                }

                //语言住宿
                //住宿
                Apply langStayApply=getStayInfo(apply.getId(),4);
                if(langStayApply.getId()!=null){
                    exportParam.setLangStayApply(langStayApply);
                    Reply langStayReply=setOfferReply(langStayApply.getId());
                    if(langStayReply.getId()!=null){
                        Reply replyLangStayResult=setParamsReply(langStayApply.getId(),langStayReply);
                        exportParam.setLangStayReply(replyLangStayResult);
                    }

                }

            }
            StudentInfo student=studentInfoService.getStudentInfoById(apply.getStudentId());
            if(student.getId()!=null && student.getEducation()!=null){
                Degree degree=degreeService.queryById(student.getEducation());
                if(degree!=null && degree.getDegreeId()!=null && org.springframework.util.StringUtils.hasText(degree.getDegree())){
                    student.setEducationName(degree.getDegree());
                }
            }
            Experience experience=new Experience();
            experience.setStudentId(student.getId());
            List<Experience> experiences=experienceService.getList(experience);
            if(experiences.size()>0){
                String experienceName="";
                String positionName="";
                for(int i=0;i<experiences.size();i++){
                    Experience exp=experiences.get(i);
                    if(null!=exp.getWorkCompany() && null!=exp.getWorkStartDate() && null!=exp.getWorkEndDate()) {
                        String preString = "";
                        if (!"".equals(experienceName)) {
                            preString = "；";
                        }
                        experienceName = experienceName + preString + new SimpleDateFormat("yyyy-MM-dd").format(exp.getWorkStartDate())
                                + "--" + new SimpleDateFormat("yyyy-MM-dd").format(exp.getWorkEndDate()) + " " +
                                exp.getWorkCompany();
                        if (!"".equals(positionName)) {
                            preString = "；";
                        }
                        positionName = positionName + preString + exp.getWorkPosition();
                        if (exp.getWorkStatus() != null) {
                            if (exp.getWorkStatus() == 1) {
                                student.setWorkStatus("工作经验");
                            } else {
                                student.setWorkStatus("实习经历");
                            }
                        }
                    }
                }
                student.setWorkPosition(positionName);
                student.setExperiencename(experienceName);
            }
            List<Exam> exams=examService.getList(student.getId());
            if(exams.size()>0){
                String examScore="";
                String examTime="";
                for(int i=0;i<exams.size();i++){
                    Exam exam=exams.get(i);
                    if(exam.getExamScore()!=null){
                        if(exam.getExamTime()!=null){
                            examTime=new SimpleDateFormat("yyyy年MM月").format(exam.getExamTime());
                        }
                        examScore=examScore+examTime+":"+exam.getExamScore()+" ";
                    }
                    student.setGpa(exam.getGpa());
                    student.setExamType(exam.getExamType());
                }
                student.setExamScore(examScore);
            }
            Contract contract=contractService.getContractById(apply.getContractId());
            exportParam.setStudent(student);
            exportParam.setContract(contract);

            //后续服务
            AfterBusiness business=getAfterService(contract.getId());
            exportParam.setAfterBusiness(business);
            //文案信息
            exportParam.setCopywriting(setCopyWriting(apply.getStudentId()));
            exportParam.setVisa(getVisa(apply.getStudentId()));

            //转案时间和人员
            String saleName=getCaseOperator(apply.getId(),"咨询顾问");
            String copyName=getCaseOperator(apply.getId(),"文签顾问");
            String visaName=getCaseOperator(apply.getId(),"签证顾问");
            String connectName=getCaseOperator(apply.getId(),"外联顾问");
            exportParam.setSaleOperator(saleName);
            exportParam.setCopyOperator(copyName);
            exportParam.setConnectOperator(connectName);
            exportParam.setVisaOperator(visaName);


            exportParam.setSaleToCopyDate(getCaseDate(apply.getId(),1));
            exportParam.setCopyToConnectDate(getCaseDate(apply.getId(),2));
            exportParam.setConnectToCopyDate(getCaseDate(apply.getId(),3));

            List<Plan> plans=planService.getList(contract.getId());
            String planName="";
            for(int i=0;i<plans.size();i++){
                Plan plan=plans.get(i);
                planName=planName+plan.getCollegeName();
            }
            exportParam.setCollegePlan(planName);
            exports.add(exportParam);

        }
        return exports;
       // return new ExportUtil().export(exports,columns);
       // return new ExportUtil().export(new ParseEntity().parse(params),columns);
    }

    private AfterBusiness getAfterService(Integer id) {
        AfterBusiness afterBusiness=new AfterBusiness();
        afterBusiness.setContractId(id);
        List<AfterBusiness> businesses=afterBusinessService.getList(afterBusiness);
        if(businesses.size()>0){
            return businesses.get(0);
        }
        return afterBusiness;
    }

    @Override
    public List<ExportParam> queryParams() {
        return null;
    }

    private Apply getStayInfo(Integer applyId,Integer applyType) {
        Apply apply=new Apply();
        apply.setApplyType(applyType);
        apply.setMainRelation(applyId);
        List<Apply> applyList=applyService.getList(apply);
        if(applyList.size()>0){
            return applyList.get(0);
        }else{
            return apply;
        }
    }

    private Reply setParamsReply(Integer applyId,Reply reply) {
        Reply stuReply=getStuReplyOffer(reply.getId());
        if(stuReply.getId()!=null){
            reply.setStudentConfirmDate(stuReply.getReplyDate()); //学生回复offer日期
        }
        Reply schoolReply=getStuReplyOffer(stuReply.getId());
        if(schoolReply.getId()!=null){
            reply.setSchoolConfirmStuDate(schoolReply.getReplyDate()); //学校回复学生回复offer日期
        }
        Reply unReply=setStuOfferReply(applyId);
        if(unReply.getId()!=null){
            reply.setUnConditionDate(unReply.getReplyDate()); //无条件offer到达日期
        }

        Reply stuConditionReply=getStuReplyOffer(unReply.getId());
        if(stuConditionReply.getId()!=null){
            reply.setStudentConfirmUnConditionDate(stuConditionReply.getReplyDate()); //学生回复无条件offer日期
        }
        Reply schoolConditionReply=getStuReplyOffer(stuConditionReply.getId());
        if(schoolConditionReply.getId()!=null){
            reply.setSchoolConfirmStuUnConditionDate(schoolConditionReply.getReplyDate()); //学校回复学生回复offer日期
        }
        return reply;
    }

    //获得offer到达信息
    private Reply setOfferReply(Integer applyId) {
        Reply reply=new Reply();
        reply.setApplyId(applyId);
        reply.setReplyType(1); //offer到达
        return setStuOfferReply(reply);
    }
    private Reply setStuOfferReply(Reply reply) {
        List<Reply> replyList=replyService.getList(reply);
        if(replyList.size()>0){
            return replyList.get(0);
        }else{
            return reply;
        }
    }
    //获得无条件offer到达信息
    private Reply setStuOfferReply(Integer applyId) {
        Reply reply=new Reply();
        reply.setApplyId(applyId);
        reply.setReplyType(2); //offer到达
        return setStuOfferReply(reply);
    }
    private Reply getStuReplyOffer(Integer replyId){
        Reply reply=new Reply();
        reply.setReplyId(replyId);
        return setStuOfferReply(reply);
    }


    private Visa getVisa(Integer studentId) {
        Visa visa=new Visa();
        visa.setStudentId(studentId);
        List<Visa> visas=visaService.getList(visa);
        if(visas.size()>0){
            return visas.get(0);
        }else{
            return visa;
        }
    }

    private List<TransferCase> getCases(int id) {
        TransferCase transferCase=new TransferCase();
        transferCase.setLaterOperator(id);
        transferCase.setEnableStatus(1);
       return transferCaseService.getOperator(transferCase);
    }


    private String getCaseOperator(int applyId,String roleName) {
        String name="";
        TransferCase transferCase=new TransferCase();
        transferCase.setApplyId(applyId);
        transferCase.setPreOperatorRole(roleName);
        List<TransferCase> cases= transferCaseService.getOperator(transferCase);
        if(cases.size()>0){
            name=cases.get(0).getPreOperatorName();
        }
        return name;
    }
    private Date getCaseDate(int applyId,int businessCase) {
        TransferCase transferCase=new TransferCase();
        transferCase.setApplyId(applyId);
        transferCase.setBussinessCase(businessCase);
        List<TransferCase> cases= transferCaseService.getOperator(transferCase);
        if(cases.size()>0){
           return  cases.get(0).getSendDate();
        }
        return null;
    }
    private StudentCopywriting setCopyWriting(Integer studentId) {
        StudentCopywriting copywriting=new StudentCopywriting();
        copywriting.setStudentId(studentId);
        List<StudentCopywriting> copywritingList= copywritingService.getList(copywriting);
        if(copywritingList.size()>0){
            return copywritingList.get(0);
        }else{
            return copywriting;
        }
    }

    private List<Map<String,Object>> list2Map(List<StudentInfo> studentInfos) {
        List<Map<String,Object>> params=new ArrayList<>();
        for(StudentInfo student:studentInfos){
            Map<String,Object> param=new HashMap<>();
            param.put("name",student.getName());
            param.put("schoolNo",student.getSchoolNo());
            param.put("systemNo",student.getSystemNo());
            param.put("gender",student.getGender());
            param.put("birthday",student.getBirthday());
            param.put("branchId",student.getBranchId());
            param.put("vipStatus",student.getVipStatus());
            param.put("graduationStatus",student.getGraduationStatus());

            param.put("school",student.getSchool());
            param.put("education",student.getEducation());
            param.put("major",student.getMajor());
            param.put("grade",student.getGrade());
          /*  param.put("emailAccount",student.getEmailAccount());
            param.put("emailPassword",student.getEmailPassword());*/
            params.add(param);
        }
        return  params;
    }


    public Supplement getSupplement(Integer applyId) {
        Supplement supplement=new Supplement();
        supplement.setApplyId(applyId);
        supplement.setAddStatus(0);
        List<Supplement> supplementList=supplementService.getList(supplement);
        if(supplementList.size()>0){
            return supplementList.get(0);
        }else{
            return supplement;
        }
    }


}
