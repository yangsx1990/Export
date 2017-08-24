package com.erp.model;

import java.util.Date;

public class DateParam {

    /**学生确认申请日期*/
    private Date studentConfirmApplyDate;
    /**学校确认收到申请日期*/
    private Date schoolConfirmReceiveApplyDate;
    /**学校要求补件日期*/
    private Date schoolRequireDate;
    /**学校要求补件截止日*/
    private Date schoolRequireAddDeadline;
    /**学生确认补件日期*/
    private Date studentConfirmSupplementDate;
    /**学校确认学生补件日期*/
    private Date schoolConfirmStudentSupplementDate;
    /**有条件offer到达日期*/
    private Date conditionOfferDate;
    /**学校要求有条件offer回复截止日期*/
    private Date schoolRequireConditionOfferDeadline;
    /**学生确认offer日期*/
    private Date studentConfirmOfferDate;
    /**学校确认offer日期*/
    private Date schoolConfirmOfferDate;
    /**无条件offer到达日期*/
    private Date unConditionDate;
    /**学生确认无条件offer日期*/
    private Date studentConfirmUnConditionDate;
    /**学校确认无条件offer日期*/
    private Date schoolConfirmStuUnConditionDate;
    /**coe电子版日期**/
    private Date coeDate;
    /**coe原件到达日期**/
    private Date originalCoeDate;
    /**拒绝原因**/
    private String replyReason;
    /**offer结果**/
    private String replyResult;
    /**offer延期提出日期**/
    private Date delayDate;
    /**offer延期回复截止日**/
    private Date delayReplyDeadline;
    /**offer延期开学日**/
    private Date delayReplyDate;

    public Date getStudentConfirmApplyDate() {
        return studentConfirmApplyDate;
    }

    public void setStudentConfirmApplyDate(Date studentConfirmApplyDate) {
        this.studentConfirmApplyDate = studentConfirmApplyDate;
    }

    public Date getSchoolConfirmReceiveApplyDate() {
        return schoolConfirmReceiveApplyDate;
    }

    public void setSchoolConfirmReceiveApplyDate(Date schoolConfirmReceiveApplyDate) {
        this.schoolConfirmReceiveApplyDate = schoolConfirmReceiveApplyDate;
    }

    public Date getSchoolRequireDate() {
        return schoolRequireDate;
    }

    public void setSchoolRequireDate(Date schoolRequireDate) {
        this.schoolRequireDate = schoolRequireDate;
    }

    public Date getSchoolRequireAddDeadline() {
        return schoolRequireAddDeadline;
    }

    public void setSchoolRequireAddDeadline(Date schoolRequireAddDeadline) {
        this.schoolRequireAddDeadline = schoolRequireAddDeadline;
    }

    public Date getStudentConfirmSupplementDate() {
        return studentConfirmSupplementDate;
    }

    public void setStudentConfirmSupplementDate(Date studentConfirmSupplementDate) {
        this.studentConfirmSupplementDate = studentConfirmSupplementDate;
    }

    public Date getConditionOfferDate() {
        return conditionOfferDate;
    }

    public void setConditionOfferDate(Date conditionOfferDate) {
        this.conditionOfferDate = conditionOfferDate;
    }

    public Date getStudentConfirmOfferDate() {
        return studentConfirmOfferDate;
    }

    public void setStudentConfirmOfferDate(Date studentConfirmOfferDate) {
        this.studentConfirmOfferDate = studentConfirmOfferDate;
    }

    public Date getSchoolConfirmOfferDate() {
        return schoolConfirmOfferDate;
    }

    public void setSchoolConfirmOfferDate(Date schoolConfirmOfferDate) {
        this.schoolConfirmOfferDate = schoolConfirmOfferDate;
    }


    public Date getUnConditionDate() {
        return unConditionDate;
    }

    public void setUnConditionDate(Date unConditionDate) {
        unConditionDate = unConditionDate;
    }

    public Date getStudentConfirmUnConditionDate() {
        return studentConfirmUnConditionDate;
    }

    public void setStudentConfirmUnConditionDate(Date studentConfirmUnConditionDate) {
        this.studentConfirmUnConditionDate = studentConfirmUnConditionDate;
    }

    public Date getSchoolConfirmStuUnConditionDate() {
        return schoolConfirmStuUnConditionDate;
    }

    public void setSchoolConfirmStuUnConditionDate(Date schoolConfirmStuUnConditionDate) {
        this.schoolConfirmStuUnConditionDate = schoolConfirmStuUnConditionDate;
    }

    public Date getCoeDate() {
        return coeDate;
    }

    public void setCoeDate(Date coeDate) {
        this.coeDate = coeDate;
    }

    public Date getSchoolConfirmStudentSupplementDate() {
        return schoolConfirmStudentSupplementDate;
    }

    public void setSchoolConfirmStudentSupplementDate(Date schoolConfirmStudentSupplementDate) {
        this.schoolConfirmStudentSupplementDate = schoolConfirmStudentSupplementDate;
    }

    public String getReplyReason() {
        return replyReason;
    }

    public void setReplyReason(String replyReason) {
        this.replyReason = replyReason;
    }

    public String getReplyResult() {
        return replyResult;
    }

    public void setReplyResult(String replyResult) {
        this.replyResult = replyResult;
    }

    public Date getOriginalCoeDate() {
        return originalCoeDate;
    }

    public void setOriginalCoeDate(Date originalCoeDate) {
        this.originalCoeDate = originalCoeDate;
    }

    public Date getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(Date delayDate) {
        this.delayDate = delayDate;
    }

    public Date getDelayReplyDeadline() {
        return delayReplyDeadline;
    }

    public void setDelayReplyDeadline(Date delayReplyDeadline) {
        this.delayReplyDeadline = delayReplyDeadline;
    }

    public Date getDelayReplyDate() {
        return delayReplyDate;
    }

    public void setDelayReplyDate(Date delayReplyDate) {
        this.delayReplyDate = delayReplyDate;
    }

    public Date getSchoolRequireConditionOfferDeadline() {
        return schoolRequireConditionOfferDeadline;
    }

    public void setSchoolRequireConditionOfferDeadline(Date schoolRequireConditionOfferDeadline) {
        this.schoolRequireConditionOfferDeadline = schoolRequireConditionOfferDeadline;
    }
}
