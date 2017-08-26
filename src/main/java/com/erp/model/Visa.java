package com.erp.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "student_visa_relation")
public class Visa
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private java.lang.Integer id;
	/**学生id*/
	@Column(name ="STUDENT_ID")
	private java.lang.Integer studentId;
	/**主要资助人*/
	@Column(name ="MAIN_SPONSOR")
	private java.lang.String mainSponsor;
	/**主要资助人单位*/
	@Column(name ="SPONSOR_UNIT")
	private java.lang.String sponsorUnit;
	/**主要资助人职务*/
	@Column(name ="SPONSOR_POSITION")
	private java.lang.String sponsorPosition;
	/**主要资助人收入*/
	@Column(name ="SPONSOR_INCOME")
	private java.lang.String sponsorIncome;
	/**其他资助人*/
	@Column(name ="OTHER_SPONSOR")
	private java.lang.String otherSponsor;
	/**家庭资产情况*/
	@Column(name ="FAMILY_ASSET")
	private java.lang.String familyAsset;
	/**缴费时间*/
	@Column(name ="PAYMENT_DATE")
	private java.util.Date paymentDate;
	/**缴费渠道*/
	@Column(name ="PAYMENT_CHANNEL")
	private java.lang.String paymentChannel;
	/**是否体检*/
	@Column(name ="HEALTH_TEST_STATUS")
	private java.lang.Integer healthTestStatus;
	/**模拟电话调查时间*/
	@Column(name ="IMITATE_SURVEY")
	private java.util.Date imitateSurvey;
	/**签证材料收齐时间*/
	@Column(name ="MATERIAL_COMPLETE_DATE")
	private java.util.Date materialCompleteDate;
	/**体检时间*/
	@Column(name ="HEALTH_TEST_DATE")
	private java.util.Date healthTestDate;
	/**签证递交时间*/
	@Column(name ="COMMIT_DATE")
	private java.util.Date commitDate;
	/**签证类型*/
	@Column(name ="VISA_TYPE")
	private String visaType;
	/**是否提供房产证明*/
	@Column(name ="property_certificate")
	private Integer  propertyCertificate;
	/**签证预约网站账号*/
	@Column(name ="ORDER_ACCOUNT")
	private java.lang.String orderAccount;
	/**签证预约网站密码*/
	@Column(name ="ORDER_PASSWORD")
	private java.lang.String orderPassword;
	/**签证结果到达日期*/
	@Column(name ="VISA_RESULT_DATE")
	private java.util.Date visaResultDate;
	/**签证结果*/
	@Column(name ="VISA_RESULT")
	private java.lang.Integer visaResult;
	/**拒签分析*/
	@Column(name="reject_analysis")
	private String rejectAnalysis;
	/**DS160编号*/
	@Column(name ="DS160_NO")
	private java.lang.String ds160No;
	/**DS160安全问答答案*/
	@Column(name ="DS160_ANSWER")
	private java.lang.String ds160Answer;
	/**EVUS登记完成日期*/
	@Column(name ="EVUS_COMPLETE_DATE")
	private java.util.Date evusCompleteDate;
	/**特殊情况说明*/
	@Column(name ="SPECIAL_COMMENT")
	private java.lang.String specialComment;
	/**TB日期*/
	@Column(name ="TB_DATE")
	private java.util.Date tbDate;
	/**预计离境日期*/
	@Column(name ="EXPECT_LEAVE_DATE")
	private java.util.Date expectLeaveDate;
	/**递签日期*/
	@Column(name ="SEND_VISA_DATE")
	private java.util.Date sendVisaDate;
	/**递签地点*/
	@Column(name ="SEND_VISA_POSITION")
	private java.lang.String sendVisaPosition;
	/**取签日期*/
	@Column(name ="TAKE_VISA_DATE")
	private java.util.Date takeVisaDate;
	/**取签方式*/
	@Column(name ="TAKE_VISA_TYPE")
	private java.lang.String takeVisaType;
	/**行前指导日期*/
	@Column(name ="GUIDE_DATE")
	private java.util.Date guideDate;
	/**是否接受**/
	@Column(name ="ACCEPT_STATUS")
	private Integer studentAcceptStatus;
	/**是否发送首次辅导清单*/
	@Column(name ="SEND_GUIDANCE_STATUS")
	private Integer sendCopyGuidanceStatus;
	/**是否首次回访日期*/
	@Column(name="first_visit_status")
	private Integer firstVisitStatus;
	/**担保金类型**/
	@Column(name="guarantee_type")
	private String guaranteeType;

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	*/

	public java.lang.Integer getId(){
	return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	*/
	public void setId(java.lang.Integer id){
this.id = id;
}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  学生id
	 */

	public java.lang.Integer getStudentId(){
		return this.studentId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  学生id
	 */
	public void setStudentId(java.lang.Integer studentId){
		this.studentId = studentId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人
	 */

	public java.lang.String getMainSponsor(){
		return this.mainSponsor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人
	 */
	public void setMainSponsor(java.lang.String mainSponsor){
		this.mainSponsor = mainSponsor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人单位
	 */

	public java.lang.String getSponsorUnit(){
		return this.sponsorUnit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人单位
	 */
	public void setSponsorUnit(java.lang.String sponsorUnit){
		this.sponsorUnit = sponsorUnit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人职务
	 */

	public java.lang.String getSponsorPosition(){
		return this.sponsorPosition;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人职务
	 */
	public void setSponsorPosition(java.lang.String sponsorPosition){
		this.sponsorPosition = sponsorPosition;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人收入
	 */

	public java.lang.String getSponsorIncome(){
		return this.sponsorIncome;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人收入
	 */
	public void setSponsorIncome(java.lang.String sponsorIncome){
		this.sponsorIncome = sponsorIncome;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其他资助人
	 */

	public java.lang.String getOtherSponsor(){
		return this.otherSponsor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其他资助人
	 */
	public void setOtherSponsor(java.lang.String otherSponsor){
		this.otherSponsor = otherSponsor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  家庭资产情况
	 */

	public java.lang.String getFamilyAsset(){
		return this.familyAsset;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  家庭资产情况
	 */
	public void setFamilyAsset(java.lang.String familyAsset){
		this.familyAsset = familyAsset;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  缴费时间
	 */

	public java.util.Date getPaymentDate(){
		return this.paymentDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  缴费时间
	 */
	public void setPaymentDate(java.util.Date paymentDate){
		this.paymentDate = paymentDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费渠道
	 */

	public java.lang.String getPaymentChannel(){
		return this.paymentChannel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费渠道
	 */
	public void setPaymentChannel(java.lang.String paymentChannel){
		this.paymentChannel = paymentChannel;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否体检
	 */

	public java.lang.Integer getHealthTestStatus(){
		return this.healthTestStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否体检
	 */
	public void setHealthTestStatus(java.lang.Integer healthTestStatus){
		this.healthTestStatus = healthTestStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  模拟电话调查时间
	 */

	public java.util.Date getImitateSurvey(){
		return this.imitateSurvey;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  模拟电话调查时间
	 */
	public void setImitateSurvey(java.util.Date imitateSurvey){
		this.imitateSurvey = imitateSurvey;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签证材料收齐时间
	 */

	public java.util.Date getMaterialCompleteDate(){
		return this.materialCompleteDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签证材料收齐时间
	 */
	public void setMaterialCompleteDate(java.util.Date materialCompleteDate){
		this.materialCompleteDate = materialCompleteDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  体检时间
	 */

	public java.util.Date getHealthTestDate(){
		return this.healthTestDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  体检时间
	 */
	public void setHealthTestDate(java.util.Date healthTestDate){
		this.healthTestDate = healthTestDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签证递交时间
	 */

	public java.util.Date getCommitDate(){
		return this.commitDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签证递交时间
	 */
	public void setCommitDate(java.util.Date commitDate){
		this.commitDate = commitDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  签证类型
	 */

	public String getVisaType(){
		return this.visaType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  签证类型
	 */
	public void setVisaType(String visaType){
		this.visaType = visaType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否提供房产证明
	 */

	public java.lang.Integer getPropertyCertificate(){
		return this.propertyCertificate;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否提供房产证明
	 */
	public void setPropertyCertificate(java.lang.Integer  	propertyCertificate){
		this.propertyCertificate =
				propertyCertificate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签证预约网站账号
	 */

	public java.lang.String getOrderAccount(){
		return this.orderAccount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签证预约网站账号
	 */
	public void setOrderAccount(java.lang.String orderAccount){
		this.orderAccount = orderAccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签证预约网站密码
	 */

	public java.lang.String getOrderPassword(){
		return this.orderPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签证预约网站密码
	 */
	public void setOrderPassword(java.lang.String orderPassword){
		this.orderPassword = orderPassword;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签证结果到达日期
	 */

	public java.util.Date getVisaResultDate(){
		return this.visaResultDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签证结果到达日期
	 */
	public void setVisaResultDate(java.util.Date visaResultDate){
		this.visaResultDate = visaResultDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  签证结果
	 */

	public java.lang.Integer getVisaResult(){
		return this.visaResult;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  签证结果
	 */
	public void setVisaResult(java.lang.Integer visaResult){
		this.visaResult = visaResult;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  DS160编号
	 */

	public java.lang.String getDs160No(){
		return this.ds160No;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  DS160编号
	 */
	public void setDs160No(java.lang.String ds160No){
		this.ds160No = ds160No;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  DS160安全问答答案
	 */

	public java.lang.String getDs160Answer(){
		return this.ds160Answer;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  DS160安全问答答案
	 */
	public void setDs160Answer(java.lang.String ds160Answer){
		this.ds160Answer = ds160Answer;
	}
	/*
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  EVUS登记完成日期
	 */

	public java.util.Date getEvusCompleteDate(){
		return this.evusCompleteDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  EVUS登记完成日期
	 */
	public void setEvusCompleteDate(java.util.Date evusCompleteDate){
		this.evusCompleteDate = evusCompleteDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  特殊情况说明
	 */

	public java.lang.String getSpecialComment(){
		return this.specialComment;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  特殊情况说明
	 */
	public void setSpecialComment(java.lang.String specialComment){
		this.specialComment = specialComment;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  TB日期
	 */

	public java.util.Date getTbDate(){
		return this.tbDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  TB日期
	 */
	public void setTbDate(java.util.Date tbDate){
		this.tbDate = tbDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  预计离境日期
	 */

	public java.util.Date getExpectLeaveDate(){
		return this.expectLeaveDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  预计离境日期
	 */
	public void setExpectLeaveDate(java.util.Date expectLeaveDate){
		this.expectLeaveDate = expectLeaveDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  递签日期
	 */

	public java.util.Date getSendVisaDate(){
		return this.sendVisaDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  递签日期
	 */
	public void setSendVisaDate(java.util.Date sendVisaDate){
		this.sendVisaDate = sendVisaDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  递签地点
	 */

	public java.lang.String getSendVisaPosition(){
		return this.sendVisaPosition;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  递签地点
	 */
	public void setSendVisaPosition(java.lang.String sendVisaPosition){
		this.sendVisaPosition = sendVisaPosition;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  取签日期
	 */

	public java.util.Date getTakeVisaDate(){
		return this.takeVisaDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  取签日期
	 */
	public void setTakeVisaDate(java.util.Date takeVisaDate){
		this.takeVisaDate = takeVisaDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  取签方式
	 */

	public java.lang.String getTakeVisaType(){
		return this.takeVisaType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  取签方式
	 */
	public void setTakeVisaType(java.lang.String takeVisaType){
		this.takeVisaType = takeVisaType;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  行前指导日期
	 */

	public java.util.Date getGuideDate(){
		return this.guideDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  行前指导日期
	 */
	public void setGuideDate(java.util.Date guideDate){
		this.guideDate = guideDate;
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

	public Integer getFirstVisitStatus() {
		return firstVisitStatus;
	}

	public void setFirstVisitStatus(Integer firstVisitStatus) {
		this.firstVisitStatus = firstVisitStatus;
	}

	public String getRejectAnalysis() {
		return rejectAnalysis;
	}

	public void setRejectAnalysis(String rejectAnalysis) {
		this.rejectAnalysis = rejectAnalysis;
	}

	public String getGuaranteeType() {
		return guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}
}
