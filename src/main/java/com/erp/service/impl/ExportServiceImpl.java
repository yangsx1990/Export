package com.erp.service.impl;

import com.erp.mapper.ExpertMapper;
import com.erp.model.*;
import com.erp.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
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
    private  ExperienceService experienceService;

    @Autowired
    private  ExamService examService;

    @Autowired
    private AfterBusinessService afterBusinessService;


    @Autowired
    private  RefundService refundService;

    @Autowired
    private VisitService visitService;
    @Autowired
    private OfferService offerService;

    @Autowired
    private BonusService bonusService;

    @Autowired
    private MemberApplyService memberApplyService;
    @Autowired
    private TransferCaseService transferService;

    @Autowired
    private OperatorService operatorService;
    protected static Logger logger= LoggerFactory.getLogger(ExportServiceImpl.class);

    @Override
    public List<Expert> queryList() {
        List<Expert> experts=new ArrayList<>();
        Expert expert= expertMapper.selectByPrimaryKey(41);
        experts.add(expert);
        return experts;
    }

    @Override
    public List<ExportParam> export( MemberApply memberApply) {
        if(memberApply==null ){
           logger.error("转案信息中异常");
        }

        //查询申请信息
        List<Apply> applyList=getApply(memberApply);
        logger.info("开始查询-》本次查询的国家为"+memberApply.getCountryId()+"，查到的申请记录为"+applyList.size());
        List<ExportParam> exports=new ArrayList<>();
        for(Apply apply:applyList){
            System.out.println("开始查询"+apply.getId()+",当前时间"+System.currentTimeMillis());
            ExportParam exportParam=new ExportParam();

            //Reply reply=setOfferReply(apply.getId());
            Supplement supplement=getSupplement(apply.getId());
            StudentInfo student=studentInfoService.getStudentInfoById(apply.getStudentNo());

            if(apply.getApplyType()==1){
                exportParam.setMainApply(apply);
                exportParam.setMainSupplement(supplement);
                DateParam replyResult=setParamsReply(apply.getId());
                exportParam.setMainReplyDate(replyResult);
                String visitRecord= getVisit(apply.getId(),2);
                exportParam.setMainVisit(visitRecord);
                Offer offer=getOffer(apply.getId(),1);
                exportParam.setMainOffer(offer);
                //奖金
                Bonus applybonus= getBonus(apply.getId(),1);
                exportParam.setApplyBonus(applybonus);
                Bonus visabonus= getBonus(apply.getId(),2);
                exportParam.setVisaBonus(visabonus);
                //跟催
                String visitUnCondition= getVisit(apply.getId(),1);
                exportParam.setUnConditionVisit(visitUnCondition);
            }else if(apply.getApplyType()==2){
                exportParam.setLangApply(apply);
                exportParam.setLangSupplement(supplement);
                DateParam replyResult=setParamsReply(apply.getId());
                exportParam.setLangStayReplyDate(replyResult);
                String visitRecord= getVisit(apply.getId(),2);
                exportParam.setLangVisit(visitRecord);
                Offer offer=getOffer(apply.getId(),2);
                exportParam.setLangOffer(offer);
                //奖金
                Bonus applybonus= getBonus(apply.getId(),1);
                exportParam.setApplyBonus(applybonus);
                Bonus visabonus= getBonus(apply.getId(),2);
                exportParam.setVisaBonus(visabonus);
            }
            if(apply.getApplyType()==1 && apply.getRelationStatus()==1){
                Apply langApply= getStayInfo(apply.getId(),2);
               if(langApply.getId()!=null){
                   DateParam replyResult=setParamsReply(langApply.getId());
                   exportParam.setLangReplyDate(replyResult);
               }
                exportParam.setLangApply(langApply);
                exportParam.setLangSupplement(supplement);
                Offer offer=getOffer(langApply.getId(),2);
                exportParam.setLangOffer(offer);


                //主课住宿
                Apply mainStayApply=getStayInfo(apply.getId(),3);
                if(mainStayApply.getId()!=null){
                    exportParam.setMainStayApply(mainStayApply);
                    Reply mainStayReply=setOfferReply(mainStayApply.getId());
                    if(mainStayReply.getId()!=null){
                        DateParam replyResult=setParamsReply(mainStayApply.getId());
                        exportParam.setMainStayReplyDate(replyResult);
                    }
                    String visitRecord= getVisit(mainStayApply.getId(),2);
                    exportParam.setMainStayVisit(visitRecord);
                    Offer mainStayOffer=getOffer(mainStayApply.getId(),3);
                    exportParam.setMainStayOffer(mainStayOffer);


                }

                //语言住宿
                //住宿
                Apply langStayApply=getStayInfo(apply.getId(),4);
                if(langStayApply.getId()!=null){
                    exportParam.setLangStayApply(langStayApply);
                    Reply langStayReply=setOfferReply(langStayApply.getId());
                    if(langStayReply.getId()!=null){
                        DateParam replyResult=setParamsReply(langStayApply.getId());
                        exportParam.setLangStayReplyDate(replyResult);
                    }
                    String visitRecord= getVisit(mainStayApply.getId(),2);
                    exportParam.setLangStayVisit(visitRecord);
                    Offer langStayOffer=getOffer(langStayApply.getId(),4);
                    exportParam.setMainStayOffer(langStayOffer);

                }

                //监护
                Apply custodyApply=getStayInfo(apply.getId(),5);
                if(custodyApply.getId()!=null){
                    exportParam.setCustodyApply(custodyApply);
                    Reply custodyReply=setOfferReply(custodyApply.getId());
                    if(custodyReply.getId()!=null){
                        DateParam custodyStayResult=setParamsReply(custodyApply.getId());
                        exportParam.setCustodyReplyDate(custodyStayResult);
                    }
                    String visitRecord= getVisit(custodyApply.getId(),2);
                    exportParam.setCustodyVisit(visitRecord);
                    Offer custodyOffer=getOffer(custodyApply.getId(),5);
                    exportParam.setCustodyOffer(custodyOffer);

                }
                //接机
                Apply pickApply=getStayInfo(apply.getId(),6);
                if(pickApply.getId()!=null){
                    exportParam.setPickApply(pickApply);
                    String visitRecord= getVisit(apply.getId(),2);
                    exportParam.setPickVisit(visitRecord);
                    //回复
                    Reply pickReply=setOfferReply(pickApply.getId());
                    if(pickReply.getId()!=null){
                        DateParam pickResult=setParamsReply(pickApply.getId());
                        exportParam.setPickReplyDate(pickResult);
                    }
                }

                //保险
                Apply insuranceApply=getStayInfo(apply.getId(),8);
                if(insuranceApply.getId()!=null){
                    exportParam.setInsuranceApply(insuranceApply);
                    String visitRecord= getVisit(apply.getId(),2);
                    exportParam.setInsuranceVisit(visitRecord);
                    //回复
                    Reply insuranceReply=setOfferReply(insuranceApply.getId());
                    if(insuranceReply.getId()!=null){
                        DateParam insuranceResult=setParamsReply(insuranceApply.getId());
                        exportParam.setInsuranceReplyDate(insuranceResult);
                    }
                }

            }

            if(student.getId()!=null){
                //转案
               TransferCase saleOperator=getTransferInfo(student.getSystemNo(),1);
               TransferCase copyOperator=getTransferInfo(student.getSystemNo(),2);
               TransferCase connectOperator=getTransferInfo(student.getSystemNo(),3);
               TransferCase visaOperator=getTransferInfo(student.getSystemNo(),4);
               exportParam.setSaleOperator(saleOperator.getMemberName());
               exportParam.setCopyOperator(copyOperator.getMemberName());
               exportParam.setConnectOperator(connectOperator.getMemberName());
               exportParam.setVisaOperator(visaOperator.getMemberName());
               exportParam.setSaleToCopywritingDate(copyOperator.getReceive());
               exportParam.setCopyToConnectDate(connectOperator.getReceive());
            }
            Experience experience=new Experience();
            experience.setStudentNo(student.getSystemNo());
            List<Experience> experiences=experienceService.getList(experience);
            if(experiences.size()>0){
                String experienceName="";
                String positionName="";
                for(int i=0;i<experiences.size();i++){
                    Experience exp=experiences.get(i);
                    if(null!=exp.getWorkCompany()) {
                        String preString = "";
                        if (!"".equals(experienceName)) {
                            preString = "；";
                        }
                        if(null!=exp.getWorkDate() && !"".equals(exp.getWorkDate())){
                            experienceName = experienceName + preString + exp.getWorkDate() + " " +
                                    exp.getWorkCompany();
                        }
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
            List<Exam> exams=examService.getList(student.getSystemNo());
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
            Contract contract=contractService.getContractById(apply.getContractNo());
            if(apply.getStudentNo()!=null){
                Refund refund=new Refund();
                refund.setStudent_no(apply.getStudentNo());
               List<Refund> refunds= refundService.getList(refund);
               if(refunds.size()>0){
                   exportParam.setRefund(refunds.get(0));
               }
            }
            exportParam.setStudent(student);
            exportParam.setContract(contract);


            //后续服务
            AfterBusiness business=getAfterService(contract.getId());
            exportParam.setAfterBusiness(business);
            //文案信息
            exportParam.setCopywriting(setCopyWriting(apply.getStudentNo()));
            exportParam.setVisa(getVisa(apply.getStudentNo()));



            List<Plan> plans=planService.getList(contract.getId());
            String planName="";
            for(int i=0;i<plans.size();i++){
                Plan plan=plans.get(i);
                if(plan.getCollegeName()!=null){
                    planName=planName+plan.getCollegeName();
                }
            }
            exportParam.setCollegePlan(planName);
            exports.add(exportParam);
            System.out.println("结束查询"+apply.getId()+",当前时间"+System.currentTimeMillis());

        }
        return exports;
       // return new ExportUtil().export(exports,columns);
       // return new ExportUtil().export(new ParseEntity().parse(params),columns);
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

    /***
     * 查询申请记录列表
     * @param memberApply
     * @return
     */
    private List<Apply> getApply( MemberApply memberApply) {

        List<MemberApply> memberApplies=getMemberApply(memberApply);
        List<String> studentNos=new ArrayList<>();
        for(MemberApply memberApplyInfo:memberApplies){

            if(memberApplyInfo.getStudentNo()!=null ){
                if(!studentNos.contains(memberApplyInfo.getStudentNo())){
                    studentNos.add(memberApplyInfo.getStudentNo());
                }
            }
        }
        if(studentNos.size()>0 ){
            if( memberApply.getStartDate()!=null && memberApply.getEndDate()!=null){
                return applyService.getByStuNos(studentNos,memberApply.getStartDate(),memberApply.getEndDate());
            }else{
                return applyService.getByNos(studentNos);
            }

        }else{
            return new ArrayList<Apply>();
        }

    }

    /***
     * 查询员工负责的申请案子
     * @param memberApply
     * @return
     */
    private List<MemberApply> getMemberApply( MemberApply memberApply) {

        memberApply.setEnable(1);

        if(memberApply.getCountryId()==1 || memberApply.getCountryId()==2){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(2);
           return  memberApplyService.getListByCountry(list,memberApply.getMemberId()==null?0:memberApply.getMemberId());
        }
        return memberApplyService.getList(memberApply);
    }

    /***
     * 查询奖金信息
     * @param applyId
     * @param businessCase
     * @return
     */
    private Bonus getBonus(Integer applyId, int businessCase) {
        Bonus bonus=new Bonus();
        bonus.setApplyId(applyId);
        bonus.setBusinessCase(businessCase);
        List<Bonus> bonuses=bonusService.getList(bonus);
        if(bonuses.size()>0){
            return bonuses.get(0);
        }
        return bonus;
    }

    private Offer getOffer(Integer applyId,Integer type) {
        Offer offer=new Offer();
        offer.setApplyId(applyId);
        offer.setOfferType(type);
        List<Offer>offers=offerService.getList(offer);
        if(offers.size()>0){
            return offers.get(0);
        }
        return offer;
    }

    private String getVisit(Integer applyId, int visitType) {
        String content="";
        Visit visit=new Visit();
        visit.setApplyId(applyId);
        visit.setVisitType(visitType);
        List<Visit> visits=visitService.getList(visit);
        if(visits.size()>0){
            for(int i=0;i<visits.size();i++){
                Visit visitData=visits.get(i);
                if(visitData.getVisitDate()!=null &&  visitData.getContent()!=null){
                    content=new SimpleDateFormat("yyyy-MM-dd").format(visitData.getVisitDate())+":"
                    +visitData.getContent()+"；";
                }
            }
        }
        return content;
    }

    private String getOperators(String studentNo,Integer role) {
        String operatorName="";
        MemberApply apply=new MemberApply();
        apply.setStudentNo(studentNo);
        apply.setMemberRole(role);
        List<MemberApply> operators= memberApplyService.getList(apply);
        if(operators.size()>0){
            for(int i=0;i<operators.size();i++){
                MemberApply operatorIndex=operators.get(i);
                if(operatorIndex!=null && operatorIndex.getMemberName()!=null){
                    operatorName=operatorName+operators.get(i).getMemberName();
                }
            }
        }
        return operatorName;
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

    private DateParam setParamsReply(Integer applyId) {
        DateParam dateParam=new DateParam();

        Reply reply=getReply(applyId,1);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setStudentConfirmApplyDate(reply.getReplyDate()); //学生确认申请
        }
         reply=getReply(applyId,2);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setSchoolConfirmReceiveApplyDate(reply.getReplyDate()); //学校确认收到申请
        }
        reply=getReply(applyId,3);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setSchoolRequireDate(reply.getReplyDate()); //学校要求补件日期
            if(reply.getProvideDeadline()!=null){
                dateParam.setSchoolRequireAddDeadline(reply.getProvideDeadline());//要求补件截止日
            }
            Reply replyConfirm=getStuReplyOffer(reply.getId());
            if(replyConfirm.getId()!=null && replyConfirm.getReplyDate()!=null){
                dateParam.setStudentConfirmSupplementDate(replyConfirm.getReplyDate()); //学生确认补件日期
            }
        }

        reply=getReply(applyId,4);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setSchoolConfirmStudentSupplementDate(reply.getReplyDate()); //学校确认补件日期
        }
        reply=getReply(applyId,5);
        if(reply.getId()!=null && reply.getReplyDate()!=null && reply.getReplyResult()!=null){
            dateParam.setConditionOfferDate(reply.getReplyDate()); //Offer到达日期
            dateParam.setReplyResult(reply.getReplyResult()==1?"录取":"拒绝"); //录取结果
            dateParam.setReplyReason(reply.getReplyReason()==null?"":reply.getReplyReason()); //拒绝原因
            if(reply.getReplyDeadline()!=null){
                dateParam.setSchoolRequireConditionOfferDeadline(reply.getReplyDeadline()); //截止日期
            }
            Reply replyConfirm=getStuReplyOffer(reply.getId());
            if(replyConfirm.getId()!=null && replyConfirm.getReplyDate()!=null){
                dateParam.setStudentConfirmOfferDate(replyConfirm.getReplyDate());//学生回复offer日期
            }
            Reply schoolReplyConfirm=getStuReplyOffer(replyConfirm.getId());
            if(schoolReplyConfirm.getId()!=null && schoolReplyConfirm.getReplyDate()!=null){
                dateParam.setSchoolConfirmOfferDate(schoolReplyConfirm.getReplyDate());//学校回复学生offer日期
            }
        }
        reply=getReply(applyId,6);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setUnConditionDate(reply.getReplyDate()); //无条件offer到达日期
            Reply replyConfirm=getStuReplyOffer(reply.getId());
            if(replyConfirm.getId()!=null && replyConfirm.getReplyDate()!=null){
                dateParam.setStudentConfirmUnConditionDate(replyConfirm.getReplyDate());//学生回复无条件offer日期
            }
            Reply schoolReplyConfirm=getStuReplyOffer(replyConfirm.getId());
            if(schoolReplyConfirm.getId()!=null && schoolReplyConfirm.getReplyDate()!=null){
                dateParam.setSchoolConfirmStuUnConditionDate(schoolReplyConfirm.getReplyDate());//学校回复学生无条件offer日期
            }
        }
        reply=getReply(applyId,7);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setCoeDate(reply.getReplyDate());  //COE电子版到达日期
        }
        reply=getReply(applyId,8);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setOriginalCoeDate(reply.getReplyDate());  //COE原件到达日期
        }

        reply=getReply(applyId,9);
        if(reply.getId()!=null && reply.getReplyDate()!=null){
            dateParam.setDelayDate(reply.getReplyDate());  //offer延期到达日期
            if(reply.getReplyDeadline()!=null){
                dateParam.setDelayReplyDeadline(reply.getReplyDeadline()); //offfer延期回复截止日
            }
            if(reply.getProvideDeadline()!=null){
                dateParam.setDelayReplyDate(reply.getProvideDeadline());  //延期开学日
            }
        }
        return dateParam;
    }

    private Reply getReply(Integer applyId, int businessCase) {
        Reply reply=new Reply();
        reply.setApplyId(applyId);
        reply.setReplyType(businessCase);
        List<Reply> replyList=replyService.getList(reply);
        if(replyList.size()>0){
            return replyList.get(0);
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


    private Visa getVisa(String studentNo) {
        Visa visa=new Visa();
        visa.setStudentNo(studentNo);
        List<Visa> visas=visaService.getList(visa);
        if(visas.size()>0){
            return visas.get(0);
        }else{
            return visa;
        }
    }

    private List<TransferCase> getCases(List<Integer>oaIds,int id) {

       return transferCaseService.queryByOperatorId(oaIds,id);
    }


    private StudentCopywriting setCopyWriting(String studentNo) {
        StudentCopywriting copywriting=new StudentCopywriting();
        copywriting.setStudentNo(studentNo);
        List<StudentCopywriting> copywritingList= copywritingService.getList(copywriting);
        if(copywritingList.size()>0){
            return copywritingList.get(0);
        }else{
            return copywriting;
        }
    }



    public Supplement getSupplement(Integer applyId) {
        Supplement supplement=new Supplement();
        //邮寄申请材料
        List<Supplement> supplementList=getSupplementInfo(applyId,1);
        //补件信息
        List<Supplement> addSupplementList=getSupplementInfo(applyId,2);
        //邮寄最终成绩单
        List<Supplement> scoreSupplementList=getSupplementInfo(applyId,3);
        //录取包裹
        List<Supplement> admissionSupplementList=getSupplementInfo(applyId,4);
        //i20原件
        List<Supplement> i20SupplementList=getSupplementInfo(applyId,5);
        if(supplementList.size()>0){
            Supplement material =supplementList.get(0);
            if(material.getCollectMaterialDate()!=null){
                supplement.setCollectMaterialDate(material.getCollectMaterialDate());
            }
            if(material.getExpressNumber()!=null){
                supplement.setExpressNumber(material.getExpressNumber());
            }
            if(material.getExpressStatus()!=null){
                supplement.setExpressStatus(material.getExpressStatus());
            }
        }
        if(scoreSupplementList.size()>0 && scoreSupplementList.get(0).getSupplementDate()!=null){
           supplement.setSendScoreDate(scoreSupplementList.get(0).getSupplementDate());
           if(scoreSupplementList.get(0).getExpressNumber()!=null){
                supplement.setSendScoreNo(scoreSupplementList.get(0).getExpressNumber());
            }
        }
        String content="";
        if(addSupplementList.size()>0){
            for(int i=0;i<addSupplementList.size();i++){
                Supplement add=addSupplementList.get(i);
                if(add.getSupplementDate()!=null && add.getSupplementContent()!=null){
                    content=content+add.getSupplementDate()+":"+add.getSupplementContent()+"；";
                }
            }
        }
        supplement.setSupplementContent(content);

        if(admissionSupplementList.size()>0){
            if(admissionSupplementList.get(0).getExpressNumber()!=null){
                supplement.setAdmissionExpressNo(admissionSupplementList.get(0).getExpressNumber());
            }
            if(addSupplementList.get(0).getSupplementDate()!=null){
                supplement.setAdmissionDate(admissionSupplementList.get(0).getSupplementDate());
            }
        }
        if(i20SupplementList.size()>0){
            if(i20SupplementList.get(0).getExpressNumber()!=null){
                supplement.setI20ExpressNo(i20SupplementList.get(0).getExpressNumber());
            }
        }
        return supplement;
    }

    private List<Supplement> getSupplementInfo(Integer applyId,Integer businessCase){
        Supplement supplement=new Supplement();
        supplement.setApplyId(applyId);
        supplement.setBussinessCase(1);
        return supplementService.getList(supplement);
    }


}
