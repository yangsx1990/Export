package com.erp.model;

import java.math.BigDecimal;
import java.util.Date;

public class ExportParam {


    /**学生信息**/
    private StudentInfo student;

    /**主课申请**/
    private Apply mainApply;
    /**语言申请**/
    private Apply langApply;

    /**主课申请住宿**/
    private Apply mainStayApply;
    /**语言申请住宿**/
    private Apply langStayApply;
    /**监护申请**/
    private Apply custodyApply;
    /**接机申请住宿**/
    private Apply pickApply;
    /**保险申请**/
    private Apply insuranceApply;
    /**工作经验**/
    private String experiences;

    /**文案信息**/
    private StudentCopywriting copywriting;
    /**合同信息**/
    private Contract contract;
    /**主课寄件信息**/
    private Supplement mainSupplement;
    /**语言寄件信息**/
    private Supplement langSupplement;
    /**主课跟催**/
    private Urge mainUrge;
    /**语言跟催**/
    private Urge langUrge;
    /**主课回访**/
    private String mainVisit;
    /**语言回访**/
    private String langVisit;
    /**主课住宿回访**/
    private  String mainStayVisit;
    /**语言住宿回访**/
    private  String langStayVisit;
    /**监护回访**/
    private String custodyVisit;
    /**接机回访**/
    private String pickVisit;
    /**保险回访**/
    private String insuranceVisit;
    /**无条件offer回访**/
    private String unConditionVisit;
    /**主课回复**/
    private DateParam mainReplyDate;
    /**语言课回复**/
    private DateParam langReplyDate;
    /**监护回复**/
    private DateParam custodyReplyDate;
    /**主课住宿回复**/
    private DateParam mainStayReplyDate;
    /**语言课住宿回复**/
    private DateParam langStayReplyDate;
    /**接机回复**/
    private DateParam pickReplyDate;
    /**保险回复**/
    private DateParam insuranceReplyDate;
    /**主课回复**/
   /* private Reply mainReply;
    *//**语言回复**//*
    private Reply langReply;

    *//**主课住宿回复**//*
    private Reply mainStayReply;
    *//**语言住宿回复**//*
    private Reply langStayReply;
    *//**监护回复**//*
    private Reply custodyReply;*/
    /**咨询顾问**/
    private String saleOperator;
    /**申请文案**/
    private String applyCopyOperator;
    /**文签**/
    private String copyOperator;
    /**业务员**/
    private String visaOperator;
    /**外联顾问**/
    private String connectOperator;
    /**签证信息**/
    private Visa visa;
    /**主课转案**/
    private TransferCase mainCase;
    /**语言课转案**/
    private TransferCase langCase;
    /**主课住宿转案**/
    private TransferCase mainStayCase;
    /**语言课住宿转案**/
    private TransferCase langStayCase;
    /**签证转案**/
    private TransferCase visaCase;
    /**监护转案**/
    private TransferCase custodyCase;
    /**定校方案**/
    private String collegePlan;
   /**后续服务**/
    private AfterBusiness afterBusiness;
    /**正课offer信息**/
    private  Offer mainOffer;
    /**语言课offer信息**/
    private  Offer langOffer;
    /**正课住宿offer信息**/
    private  Offer mainStayOffer;
    /**语言课住宿offer信息**/
    private  Offer langStayOffer;

    /**监护offer信息**/
    private  Offer custodyOffer;
    /**接机offer信息**/
    private Offer pickOffer;
    /**保险offer信息**/
    private Offer insuranceOffer;
    /**申请奖金**/
    private Bonus applyBonus;
    /**签证奖金**/
    private Bonus visaBonus;

    /**退款信息**/
    private Refund refund;

    /**学校通知offer延期日期**/
    private Date schoolOfferDelatDate;

    public TransferCase getMainCase() {
        return mainCase;
    }

    public void setMainCase(TransferCase mainCase) {
        this.mainCase = mainCase;
    }

    public TransferCase getLangCase() {
        return langCase;
    }

    public void setLangCase(TransferCase langCase) {
        this.langCase = langCase;
    }

    public TransferCase getMainStayCase() {
        return mainStayCase;
    }

    public void setMainStayCase(TransferCase mainStayCase) {
        this.mainStayCase = mainStayCase;
    }

    public TransferCase getLangStayCase() {
        return langStayCase;
    }

    public void setLangStayCase(TransferCase langStayCase) {
        this.langStayCase = langStayCase;
    }

    public TransferCase getCustodyCase() {
        return custodyCase;
    }

    public void setCustodyCase(TransferCase custodyCase) {
        this.custodyCase = custodyCase;
    }

    public Visa getVisa() {
        return visa;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    public StudentInfo getStudent() {
        return student;
    }

    public void setStudent(StudentInfo student) {
        this.student = student;
    }

    public Apply getMainApply() {
        return mainApply;
    }

    public void setMainApply(Apply mainApply) {
        this.mainApply = mainApply;
    }

    public Apply getLangApply() {
        return langApply;
    }

    public void setLangApply(Apply langApply) {
        this.langApply = langApply;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public StudentCopywriting getCopywriting() {
        return copywriting;
    }

    public void setCopywriting(StudentCopywriting copywriting) {
        this.copywriting = copywriting;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getSaleOperator() {
        return saleOperator;
    }

    public String getCopyOperator() {
        return copyOperator;
    }

    public Supplement getMainSupplement() {
        return mainSupplement;
    }

    public void setMainSupplement(Supplement mainSupplement) {
        this.mainSupplement = mainSupplement;
    }

    public Supplement getLangSupplement() {
        return langSupplement;
    }

    public void setLangSupplement(Supplement langSupplement) {
        this.langSupplement = langSupplement;
    }


    public Urge getMainUrge() {
        return mainUrge;
    }

    public void setMainUrge(Urge mainUrge) {
        this.mainUrge = mainUrge;
    }

    public Urge getLangUrge() {
        return langUrge;
    }

    public void setLangUrge(Urge langUrge) {
        this.langUrge = langUrge;
    }

    public String getMainVisit() {
        return mainVisit;
    }

    public void setMainVisit(String mainVisit) {
        this.mainVisit = mainVisit;
    }

    public String getLangVisit() {
        return langVisit;
    }

    public void setLangVisit(String langVisit) {
        this.langVisit = langVisit;
    }

    public Apply getMainStayApply() {
        return mainStayApply;
    }

    public void setMainStayApply(Apply mainStayApply) {
        this.mainStayApply = mainStayApply;
    }

    public Apply getLangStayApply() {
        return langStayApply;
    }

    public void setLangStayApply(Apply langStayApply) {
        this.langStayApply = langStayApply;
    }


    public void setSaleOperator(String saleOperator) {
        this.saleOperator = saleOperator;
    }

    public void setCopyOperator(String copyOperator) {
        this.copyOperator = copyOperator;
    }

    public String getVisaOperator() {
        return visaOperator;
    }

    public void setVisaOperator(String visaOperator) {
        this.visaOperator = visaOperator;
    }

    public String getConnectOperator() {
        return connectOperator;
    }

    public void setConnectOperator(String connectOperator) {
        this.connectOperator = connectOperator;
    }

    public String getCollegePlan() {
        return collegePlan;
    }

    public void setCollegePlan(String collegePlan) {
        this.collegePlan = collegePlan;
    }

    public AfterBusiness getAfterBusiness() {
        return afterBusiness;
    }

    public void setAfterBusiness(AfterBusiness afterBusiness) {
        this.afterBusiness = afterBusiness;
    }

    public Date getSchoolOfferDelatDate() {
        return schoolOfferDelatDate;
    }

    public void setSchoolOfferDelatDate(Date schoolOfferDelatDate) {
        this.schoolOfferDelatDate = schoolOfferDelatDate;
    }

    public Refund getRefund() {
        return refund;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public String getMainStayVisit() {
        return mainStayVisit;
    }

    public void setMainStayVisit(String mainStayVisit) {
        this.mainStayVisit = mainStayVisit;
    }

    public String getLangStayVisit() {
        return langStayVisit;
    }

    public void setLangStayVisit(String langStayVisit) {
        this.langStayVisit = langStayVisit;
    }

    public Offer getMainOffer() {
        return mainOffer;
    }

    public void setMainOffer(Offer mainOffer) {
        this.mainOffer = mainOffer;
    }

    public Offer getLangOffer() {
        return langOffer;
    }

    public void setLangOffer(Offer langOffer) {
        this.langOffer = langOffer;
    }

    public Offer getMainStayOffer() {
        return mainStayOffer;
    }

    public void setMainStayOffer(Offer mainStayOffer) {
        this.mainStayOffer = mainStayOffer;
    }

    public Offer getLangStayOffer() {
        return langStayOffer;
    }

    public void setLangStayOffer(Offer langStayOffer) {
        this.langStayOffer = langStayOffer;
    }

    public String getApplyCopyOperator() {
        return applyCopyOperator;
    }

    public void setApplyCopyOperator(String applyCopyOperator) {
        this.applyCopyOperator = applyCopyOperator;
    }

    public Bonus getApplyBonus() {
        return applyBonus;
    }

    public void setApplyBonus(Bonus applyBonus) {
        this.applyBonus = applyBonus;
    }

    public Bonus getVisaBonus() {
        return visaBonus;
    }

    public void setVisaBonus(Bonus visaBonus) {
        this.visaBonus = visaBonus;
    }

    public Apply getCustodyApply() {
        return custodyApply;
    }

    public void setCustodyApply(Apply custodyApply) {
        this.custodyApply = custodyApply;
    }

    public String getCustodyVisit() {
        return custodyVisit;
    }

    public void setCustodyVisit(String custodyVisit) {
        this.custodyVisit = custodyVisit;
    }

    public Offer getCustodyOffer() {
        return custodyOffer;
    }

    public void setCustodyOffer(Offer custodyOffer) {
        this.custodyOffer = custodyOffer;
    }

    public String getUnConditionVisit() {
        return unConditionVisit;
    }

    public void setUnConditionVisit(String unConditionVisit) {
        this.unConditionVisit = unConditionVisit;
    }

    public DateParam getMainReplyDate() {
        return mainReplyDate;
    }

    public void setMainReplyDate(DateParam mainReplyDate) {
        this.mainReplyDate = mainReplyDate;
    }

    public DateParam getLangReplyDate() {
        return langReplyDate;
    }

    public void setLangReplyDate(DateParam langReplyDate) {
        this.langReplyDate = langReplyDate;
    }

    public DateParam getMainStayReplyDate() {
        return mainStayReplyDate;
    }

    public void setMainStayReplyDate(DateParam mainStayReplyDate) {
        this.mainStayReplyDate = mainStayReplyDate;
    }

    public DateParam getLangStayReplyDate() {
        return langStayReplyDate;
    }

    public void setLangStayReplyDate(DateParam langStayReplyDate) {
        this.langStayReplyDate = langStayReplyDate;
    }

    public DateParam getCustodyReplyDate() {
        return custodyReplyDate;
    }

    public void setCustodyReplyDate(DateParam custodyReplyDate) {
        this.custodyReplyDate = custodyReplyDate;
    }

    public TransferCase getVisaCase() {
        return visaCase;
    }

    public void setVisaCase(TransferCase visaCase) {
        this.visaCase = visaCase;
    }

    public Apply getPickApply() {
        return pickApply;
    }

    public void setPickApply(Apply pickApply) {
        this.pickApply = pickApply;
    }

    public Apply getInsuranceApply() {
        return insuranceApply;
    }

    public void setInsuranceApply(Apply insuranceApply) {
        this.insuranceApply = insuranceApply;
    }

    public String getPickVisit() {
        return pickVisit;
    }

    public void setPickVisit(String pickVisit) {
        this.pickVisit = pickVisit;
    }

    public DateParam getPickReplyDate() {
        return pickReplyDate;
    }

    public void setPickReplyDate(DateParam pickReplyDate) {
        this.pickReplyDate = pickReplyDate;
    }

    public Offer getPickOffer() {
        return pickOffer;
    }

    public void setPickOffer(Offer pickOffer) {
        this.pickOffer = pickOffer;
    }

    public String getInsuranceVisit() {
        return insuranceVisit;
    }

    public void setInsuranceVisit(String insuranceVisit) {
        this.insuranceVisit = insuranceVisit;
    }

    public DateParam getInsuranceReplyDate() {
        return insuranceReplyDate;
    }

    public void setInsuranceReplyDate(DateParam insuranceReplyDate) {
        this.insuranceReplyDate = insuranceReplyDate;
    }

    public Offer getInsuranceOffer() {
        return insuranceOffer;
    }

    public void setInsuranceOffer(Offer insuranceOffer) {
        this.insuranceOffer = insuranceOffer;
    }
}
