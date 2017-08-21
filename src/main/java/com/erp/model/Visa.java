package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_visa_relation")
public class Visa
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**学生id*/
    @Column(name ="STUDENT_ID")
	private Integer studentId;
	/**主要资助人*/
    @Column(name ="MAIN_SPONSOR")
	private String mainSponsor;
	/**主要资助人单位*/
    @Column(name ="SPONSOR_UNIT")
	private String sponsorUnit;
	/**主要资助人职务*/
    @Column(name ="SPONSOR_POSITION")
	private String sponsorPosition;
	/**主要资助人收入*/
    @Column(name ="SPONSOR_INCOME")
	private String sponsorIncome;
	/**其他资助人*/
    @Column(name ="OTHER_SPONSOR")
	private String otherSponsor;
	/**家庭资产情况*/
    @Column(name ="FAMILY_ASSET")
	private String familyAsset;
	/**缴费时间*/
    @Column(name ="PAYMENT_DATE")
	private Date paymentDate;
	/**缴费渠道*/
    @Column(name ="PAYMENT_CHANNEL")
	private String paymentChannel;
	/**是否体检*/
    @Column(name ="HEALTH_TEST_STATUS")
	private Integer healthTestStatus;
	/**模拟电话调查时间*/
    @Column(name ="IMITATE_SURVEY")
	private Date imitateSurvey;
	/**签证材料收齐时间*/
    @Column(name ="MATERIAL_COMPLETE_DATE")
	private Date materialCompleteDate;
	/**体检时间*/
    @Column(name ="HEALTH_TEST_DATE")
	private Date healthTestDate;
	/**签证递交时间*/
    @Column(name ="COMMIT_DATE")
	private Date commitDate;
	/**签证类型*/
    @Column(name ="VISA_TYPE")
	private Integer visaType;
	/**是否提供房产证明*/
    @Column(name ="PROPERTY_CERTIFICATE")
	private Integer propertyCertificate;
	/**签证预约网站账号*/
    @Column(name ="ORDER_ACCOUNT")
	private String orderAccount;
	/**签证预约网站密码*/
    @Column(name ="ORDER_PASSWORD")
	private String orderPassword;
	/**签证结果到达日期*/
    @Column(name ="VISA_RESULT_DATE")
	private Date visaResultDate;
	/**签证结果*/
    @Column(name ="VISA_RESULT")
	private Integer visaResult;
	/**DS160编号*/
    @Column(name ="DS160_NO")
	private String ds160No;
	/**DS160安全问答答案*/
    @Column(name ="DS160_ANSWER")
	private String ds160Answer;
	/**EVUS登记完成日期*/
    @Column(name ="EVUS_COMPLETE_DATE")
	private Date evusCompleteDate;

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

	public Integer getStudentId(){
		return this.studentId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  学生id
	 */
	public void setStudentId(Integer studentId){
		this.studentId = studentId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人
	 */

	public String getMainSponsor(){
		return this.mainSponsor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人
	 */
	public void setMainSponsor(String mainSponsor){
		this.mainSponsor = mainSponsor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人单位
	 */

	public String getSponsorUnit(){
		return this.sponsorUnit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人单位
	 */
	public void setSponsorUnit(String sponsorUnit){
		this.sponsorUnit = sponsorUnit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人职务
	 */

	public String getSponsorPosition(){
		return this.sponsorPosition;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人职务
	 */
	public void setSponsorPosition(String sponsorPosition){
		this.sponsorPosition = sponsorPosition;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主要资助人收入
	 */

	public String getSponsorIncome(){
		return this.sponsorIncome;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主要资助人收入
	 */
	public void setSponsorIncome(String sponsorIncome){
		this.sponsorIncome = sponsorIncome;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其他资助人
	 */

	public String getOtherSponsor(){
		return this.otherSponsor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其他资助人
	 */
	public void setOtherSponsor(String otherSponsor){
		this.otherSponsor = otherSponsor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  家庭资产情况
	 */

	public String getFamilyAsset(){
		return this.familyAsset;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  家庭资产情况
	 */
	public void setFamilyAsset(String familyAsset){
		this.familyAsset = familyAsset;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  缴费时间
	 */

	public Date getPaymentDate(){
		return this.paymentDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  缴费时间
	 */
	public void setPaymentDate(Date paymentDate){
		this.paymentDate = paymentDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费渠道
	 */

	public String getPaymentChannel(){
		return this.paymentChannel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费渠道
	 */
	public void setPaymentChannel(String paymentChannel){
		this.paymentChannel = paymentChannel;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否体检
	 */

	public Integer getHealthTestStatus(){
		return this.healthTestStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否体检
	 */
	public void setHealthTestStatus(Integer healthTestStatus){
		this.healthTestStatus = healthTestStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  模拟电话调查时间
	 */

	public Date getImitateSurvey(){
		return this.imitateSurvey;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  模拟电话调查时间
	 */
	public void setImitateSurvey(Date imitateSurvey){
		this.imitateSurvey = imitateSurvey;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签证材料收齐时间
	 */

	public Date getMaterialCompleteDate(){
		return this.materialCompleteDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签证材料收齐时间
	 */
	public void setMaterialCompleteDate(Date materialCompleteDate){
		this.materialCompleteDate = materialCompleteDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  体检时间
	 */

	public Date getHealthTestDate(){
		return this.healthTestDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  体检时间
	 */
	public void setHealthTestDate(Date healthTestDate){
		this.healthTestDate = healthTestDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签证递交时间
	 */

	public Date getCommitDate(){
		return this.commitDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签证递交时间
	 */
	public void setCommitDate(Date commitDate){
		this.commitDate = commitDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  签证类型
	 */

	public Integer getVisaType(){
		return this.visaType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  签证类型
	 */
	public void setVisaType(Integer visaType){
		this.visaType = visaType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否提供房产证明
	 */

	public Integer getPropertyCertificate(){
		return this.propertyCertificate;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否提供房产证明
	 */
	public void setPropertyCertificate(Integer propertyCertificate){
		this.propertyCertificate =propertyCertificate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签证预约网站账号
	 */

	public String getOrderAccount(){
		return this.orderAccount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签证预约网站账号
	 */
	public void setOrderAccount(String orderAccount){
		this.orderAccount = orderAccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签证预约网站密码
	 */

	public String getOrderPassword(){
		return this.orderPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签证预约网站密码
	 */
	public void setOrderPassword(String orderPassword){
		this.orderPassword = orderPassword;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签证结果到达日期
	 */

	public Date getVisaResultDate(){
		return this.visaResultDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签证结果到达日期
	 */
	public void setVisaResultDate(Date visaResultDate){
		this.visaResultDate = visaResultDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  签证结果
	 */

	public Integer getVisaResult(){
		return this.visaResult;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  签证结果
	 */
	public void setVisaResult(Integer visaResult){
		this.visaResult = visaResult;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  DS160编号
	 */

	public String getDs160No(){
		return this.ds160No;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  DS160编号
	 */
	public void setDs160No(String ds160No){
		this.ds160No = ds160No;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  DS160安全问答答案
	 */

	public String getDs160Answer(){
		return this.ds160Answer;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  DS160安全问答答案
	 */
	public void setDs160Answer(String ds160Answer){
		this.ds160Answer = ds160Answer;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  EVUS登记完成日期
	 */

	public Date getEvusCompleteDate(){
		return this.evusCompleteDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  EVUS登记完成日期
	 */
	public void setEvusCompleteDate(Date evusCompleteDate){
		this.evusCompleteDate = evusCompleteDate;
	}
}
