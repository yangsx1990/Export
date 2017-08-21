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
    private Visit mainVisit;
    /**语言回访**/
    private Visit langVisit;
    /**主课回复**/
    private Reply mainReply;
    /**语言回复**/
    private Reply langReply;

    /**主课住宿回复**/
    private Reply mainStayReply;
    /**语言住宿回复**/
    private Reply langStayReply;
    /**咨询顾问**/
    private String saleOperator;
    /**文签**/
    private String copyOperator;
    /**业务员**/
    private String visaOperator;
    /**外联顾问**/
    private String connectOperator;
    /**签证信息**/
    private Visa visa;
    /**销售转文签日期**/
    private Date saleToCopyDate;
    /**文签转外联日期**/
    private Date copyToConnectDate;
    /**外联转文签日期**/
    private Date connectToCopyDate;
    /**定校方案**/
    private String collegePlan;
   /**后续服务**/
    private AfterBusiness afterBusiness;
    public Date getSaleToCopyDate() {
        return saleToCopyDate;
    }

    public void setSaleToCopyDate(Date saleToCopyDate) {
        this.saleToCopyDate = saleToCopyDate;
    }

    public Date getCopyToConnectDate() {
        return copyToConnectDate;
    }

    public void setCopyToConnectDate(Date copyToConnectDate) {
        this.copyToConnectDate = copyToConnectDate;
    }

    public Date getConnectToCopyDate() {
        return connectToCopyDate;
    }

    public void setConnectToCopyDate(Date connectToCopyDate) {
        this.connectToCopyDate = connectToCopyDate;
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

    public Reply getMainReply() {
        return mainReply;
    }

    public void setMainReply(Reply mainReply) {
        this.mainReply = mainReply;
    }

    public Reply getLangReply() {
        return langReply;
    }

    public void setLangReply(Reply langReply) {
        this.langReply = langReply;
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

    public Visit getMainVisit() {
        return mainVisit;
    }

    public void setMainVisit(Visit mainVisit) {
        this.mainVisit = mainVisit;
    }

    public Visit getLangVisit() {
        return langVisit;
    }

    public void setLangVisit(Visit langVisit) {
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

    public Reply getMainStayReply() {
        return mainStayReply;
    }

    public void setMainStayReply(Reply mainStayReply) {
        this.mainStayReply = mainStayReply;
    }

    public Reply getLangStayReply() {
        return langStayReply;
    }

    public void setLangStayReply(Reply langStayReply) {
        this.langStayReply = langStayReply;
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
}
