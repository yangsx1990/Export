package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_copywriting_relation")
public class StudentCopywriting
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**合同id**/
	@Column(name="contract_no")
	private  Integer contractNo;
	/**学号id*/
    @Column(name ="student_no")
	private String studentNo;
	/**文案名称*/
    @Column(name ="COPY_NAME")
	private String copyName;
	/**是否接受*/
    @Column(name ="ACCEPT_STATUS")
	private Integer studentAcceptStatus;
	/**是否发送首次辅导清单*/
    @Column(name ="SEND_GUIDANCE_STATUS")
	private Integer sendCopyGuidanceStatus;
	/**预计申请季（主课开学时间）*/
    @Column(name ="EXPECT_APPLY_DATE")
	private Date expectApplyDate;
	/**是否申请危险在途*/
    @Column(name ="APPLY_DANGER_STATUS")
	private Integer applyDangerStatus;
	/**materialCollectedDate*/
    @Column(name ="MATERIAL_COLLECTED_DATE")
	private Date materialCollectedDate;

	/**申请制作完成日期*/
    @Column(name ="COMPLETE_DATE")
	private Date completeDate;
	/**GPA*/
    @Column(name ="GPA")
	private String copyGpa;
	/**标准化考试类型*/
    @Column(name ="EXAM_TYPE")
	private Integer copyExamType;
	/**标准化考试成绩*/
    @Column(name ="EXAM_SCORE")
	private String copyExamScore;
	/**其他经历*/
    @Column(name ="OTHER_EXPERIENCE")
	private String otherExperience;
    /**再考时间**/
    @Column(name="exam_time")
	private  Date copyExamTime;
	/**是否有申请国拒签史*/
    @Column(name ="APPLY_COUNTRY_REJECT_HISTORY")
	private Integer applyCountryRejectHistory;
	/**是否有其他国拒签史*/
    @Column(name ="OTHER_COUNTRY_REJECT_HISTORY")
	private Integer otherCountryRejectHistory;
	/**是否首次回访日期*/
	@Column(name="first_visit_status")
	private Integer firstVisitStatus;
	/**是否走大四流程*/
	@Column(name="grade_four_status")
	private Integer gradeFourStatus;


	/**简历完成时间*/
	@Column(name="resume_complete_date")
	private Date resumeCompleteDate;

	/**个人陈述完成时间*/
	@Column(name="statement_complete_date")
	private Date statementCompleteDate;

	/**推荐信完成时间*/
	@Column(name="recommendation_complete_date")
	private Date recommendationCompleteDate;

	/**是否外包文书*/
	@Column(name="copy_outsource_status")
	private Integer copyOutsourceStatus;
	/**外包文书内容*/
	@Column(name="copy_outsource_content")
	private String copyOutsourceContent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContractNo() {
		return contractNo;
	}

	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getCopyName() {
		return copyName;
	}

	public void setCopyName(String copyName) {
		this.copyName = copyName;
	}

	public Integer getStudentAcceptStatus() {
		return studentAcceptStatus;
	}

	public void setStudentAcceptStatus(Integer studentAcceptStatus) {
		this.studentAcceptStatus = studentAcceptStatus;
	}

	public Integer getSendCopyGuidanceStatus() {
		return sendCopyGuidanceStatus;
	}

	public void setSendCopyGuidanceStatus(Integer sendCopyGuidanceStatus) {
		this.sendCopyGuidanceStatus = sendCopyGuidanceStatus;
	}

	public Date getExpectApplyDate() {
		return expectApplyDate;
	}

	public void setExpectApplyDate(Date expectApplyDate) {
		this.expectApplyDate = expectApplyDate;
	}

	public Integer getApplyDangerStatus() {
		return applyDangerStatus;
	}

	public void setApplyDangerStatus(Integer applyDangerStatus) {
		this.applyDangerStatus = applyDangerStatus;
	}

	public Date getMaterialCollectedDate() {
		return materialCollectedDate;
	}

	public void setMaterialCollectedDate(Date materialCollectedDate) {
		this.materialCollectedDate = materialCollectedDate;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public String getCopyGpa() {
		return copyGpa;
	}

	public void setCopyGpa(String copyGpa) {
		this.copyGpa = copyGpa;
	}

	public Integer getCopyExamType() {
		return copyExamType;
	}

	public void setCopyExamType(Integer copyExamType) {
		this.copyExamType = copyExamType;
	}

	public String getCopyExamScore() {
		return copyExamScore;
	}

	public void setCopyExamScore(String copyExamScore) {
		this.copyExamScore = copyExamScore;
	}

	public String getOtherExperience() {
		return otherExperience;
	}

	public void setOtherExperience(String otherExperience) {
		this.otherExperience = otherExperience;
	}

	public Date getCopyExamTime() {
		return copyExamTime;
	}

	public void setCopyExamTime(Date copyExamTime) {
		this.copyExamTime = copyExamTime;
	}

	public Integer getApplyCountryRejectHistory() {
		return applyCountryRejectHistory;
	}

	public void setApplyCountryRejectHistory(Integer applyCountryRejectHistory) {
		this.applyCountryRejectHistory = applyCountryRejectHistory;
	}

	public Integer getOtherCountryRejectHistory() {
		return otherCountryRejectHistory;
	}

	public void setOtherCountryRejectHistory(Integer otherCountryRejectHistory) {
		this.otherCountryRejectHistory = otherCountryRejectHistory;
	}

	public Integer getFirstVisitStatus() {
		return firstVisitStatus;
	}

	public void setFirstVisitStatus(Integer firstVisitStatus) {
		this.firstVisitStatus = firstVisitStatus;
	}

	public Integer getGradeFourStatus() {
		return gradeFourStatus;
	}

	public void setGradeFourStatus(Integer gradeFourStatus) {
		this.gradeFourStatus = gradeFourStatus;
	}

	public Date getResumeCompleteDate() {
		return resumeCompleteDate;
	}

	public void setResumeCompleteDate(Date resumeCompleteDate) {
		this.resumeCompleteDate = resumeCompleteDate;
	}

	public Date getStatementCompleteDate() {
		return statementCompleteDate;
	}

	public void setStatementCompleteDate(Date statementCompleteDate) {
		this.statementCompleteDate = statementCompleteDate;
	}

	public Date getRecommendationCompleteDate() {
		return recommendationCompleteDate;
	}

	public void setRecommendationCompleteDate(Date recommendationCompleteDate) {
		this.recommendationCompleteDate = recommendationCompleteDate;
	}

	public Integer getCopyOutsourceStatus() {
		return copyOutsourceStatus;
	}

	public void setCopyOutsourceStatus(Integer copyOutsourceStatus) {
		this.copyOutsourceStatus = copyOutsourceStatus;
	}

	public String getCopyOutsourceContent() {
		return copyOutsourceContent;
	}

	public void setCopyOutsourceContent(String copyOutsourceContent) {
		this.copyOutsourceContent = copyOutsourceContent;
	}
}
