package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_college_apply_relation")
public class Apply
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**学生id*/
    @Column(name ="STUDENT_ID")
	private Integer studentId;
	/**合同id*/
    @Column(name ="CONTRACT_ID")
	private Integer contractId;
	/**留学国家*/
    @Column(name ="COUNTRY")
	private Integer country;
	/**申请院校*/
    @Column(name ="COLLEGE")
	private Integer applyCollege;
	/**申请专业*/
	@Column(name ="MAJOR")
	private Integer applyMajor;
	/**院校校区*/
    @Column(name ="COLLEGE_CAMPUS")
	private Integer collegeCampus;
	/**是否加申院校*/
    @Column(name ="ADD_COLLEGE_STATUS")
	private Integer addCollegeStatus;
/**申请日期**/
    @Column(name="APPLY_DATE")
	private Date applyDate;
	/**是否加申专业*/
	@Column(name ="ADD_MAJOR_STATUS")
	private Integer addMajorStatus;
	/**是否协议院校*/
    @Column(name ="ADD_PROTOCOL")
	private Integer addProtocol;
	/**申请方式*/
    @Column(name ="APPLY_WAY")
	private Integer applyWay;
	/**approvalCycle*/
    @Column(name ="APPROVAL_CYCLE")
	private Date approvalCycle;
	/**interviewType*/
    @Column(name ="INTERVIEW_TYPE")
	private Integer interviewType;
	/**interviewDate*/
    @Column(name ="INTERVIEW_DATE")
	private Date interviewDate;
	/**interviewLocation*/
    @Column(name ="INTERVIEW_LOCATION")
	private String interviewLocation;
	/**sendMaterialType*/
    @Column(name ="SEND_MATERIAL_TYPE")
	private Integer sendMaterialType;
	/**申请状态*/
    @Column(name ="apply_status_code")
	private Integer applyStatus;
	/**申请状态名称*/
	@Column(name ="apply_status_name")
	private String applyStatusName;
	/**argueDate*/
    @Column(name ="ARGUE_DATE")
	private Date argueDate;
	/**depositPaymentDate*/
    @Column(name ="DEPOSIT_PAYMENT_DATE")
	private Date depositPaymentDate;
	/**申请类型*/
    @Column(name ="APPLY_TYPE")
	private Integer applyType;
	/**申请账户*/
    @Column(name ="APPLY_ACCOUNT")
	private String applyAccount;
	/**申请密码*/
    @Column(name ="APPLY_PASSWORD")
	private String applyPassword;

	@Column(name ="OPERATOR")
	private Integer operator;

	/**是否有关联课**/
	@Column(name="relation_status")
	private Integer relationStatus;

	/**关联课id**/
	@Column(name="apply_relation")
	private Integer mainRelation;

	@Column(name="college_name")
	private String applyCollegeName;

	/**申请学期**/
	@Column(name="apply_term")
	private  String applyTerm;
	@Column(name="major_name")
	private String applyMajorName;
	/**合作机构名称**/
	@Column(name="agent_name")
	private String agentName;

	/**快递单号**/
	@Column(name="express_no")
	private String expressNo;
	/**快递投递状态:1-投递成功 2-在途 3-已签收。**/
	@Column(name="express_status")
	private Integer expressStatus;

	/**申请学历**/
	@Column(name="apply_edu")
	private String applyEdu;
	/**申请类别：直录，双录取等**/
	@Column(name="apply_category")
	private String applyCategory;

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */

	public Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(Integer id){
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  合同id
	 */

	public Integer getContractId(){
		return this.contractId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  合同id
	 */
	public void setContractId(Integer contractId){
		this.contractId = contractId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  留学国家
	 */

	public Integer getCountry(){
		return this.country;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  留学国家
	 */
	public void setCountry(Integer country){
		this.country = country;
	}

	public Integer getApplyCollege() {
		return applyCollege;
	}

	public void setApplyCollege(Integer applyCollege) {
		this.applyCollege = applyCollege;
	}

	public Integer getApplyMajor() {
		return applyMajor;
	}

	public void setApplyMajor(Integer applyMajor) {
		this.applyMajor = applyMajor;
	}

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  院校校区
	 */

	public Integer getCollegeCampus(){
		return this.collegeCampus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  院校校区
	 */
	public void setCollegeCampus(Integer collegeCampus){
		this.collegeCampus = collegeCampus;
	}

	public Integer getAddCollegeStatus() {
		return addCollegeStatus;
	}

	public void setAddCollegeStatus(Integer addCollegeStatus) {
		this.addCollegeStatus = addCollegeStatus;
	}

	public Integer getAddMajorStatus() {
		return addMajorStatus;
	}

	public void setAddMajorStatus(Integer addMajorStatus) {
		this.addMajorStatus = addMajorStatus;
	}

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否协议院校
	 */

	public Integer getAddProtocol(){
		return this.addProtocol;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否协议院校
	 */
	public void setAddProtocol(Integer addProtocol){
		this.addProtocol = addProtocol;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  申请方式
	 */

	public Integer getApplyWay(){
		return this.applyWay;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  申请方式
	 */
	public void setApplyWay(Integer applyWay){
		this.applyWay = applyWay;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  approvalCycle
	 */

	public Date getApprovalCycle(){
		return this.approvalCycle;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  approvalCycle
	 */
	public void setApprovalCycle(Date approvalCycle){
		this.approvalCycle = approvalCycle;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  interviewType
	 */

	public Integer getInterviewType(){
		return this.interviewType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  interviewType
	 */
	public void setInterviewType(Integer interviewType){
		this.interviewType = interviewType;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  interviewDate
	 */

	public Date getInterviewDate(){
		return this.interviewDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  interviewDate
	 */
	public void setInterviewDate(Date interviewDate){
		this.interviewDate = interviewDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  interviewLocation
	 */

	public String getInterviewLocation(){
		return this.interviewLocation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  interviewLocation
	 */
	public void setInterviewLocation(String interviewLocation){
		this.interviewLocation = interviewLocation;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  sendMaterialType
	 */

	public Integer getSendMaterialType(){
		return this.sendMaterialType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  sendMaterialType
	 */
	public void setSendMaterialType(Integer sendMaterialType){
		this.sendMaterialType = sendMaterialType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  applyStatus
	 */

	public Integer getApplyStatus(){
		return this.applyStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  applyStatus
	 */
	public void setApplyStatus(Integer applyStatus){
		this.applyStatus = applyStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  argueDate
	 */

	public Date getArgueDate(){
		return this.argueDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  argueDate
	 */
	public void setArgueDate(Date argueDate){
		this.argueDate = argueDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  depositPaymentDate
	 */

	public Date getDepositPaymentDate(){
		return this.depositPaymentDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  depositPaymentDate
	 */
	public void setDepositPaymentDate(Date depositPaymentDate){
		this.depositPaymentDate = depositPaymentDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  applyType
	 */

	public Integer getApplyType(){
		return this.applyType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  applyType
	 */
	public void setApplyType(Integer applyType){
		this.applyType = applyType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  applyAccount
	 */

	public String getApplyAccount(){
		return this.applyAccount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  applyAccount
	 */
	public void setApplyAccount(String applyAccount){
		this.applyAccount = applyAccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  applyPassword
	 */

	public String getApplyPassword(){
		return this.applyPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  applyPassword
	 */
	public void setApplyPassword(String applyPassword){
		this.applyPassword = applyPassword;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Integer getMainRelation() {
		return mainRelation;
	}

	public void setMainRelation(Integer mainRelation) {
		this.mainRelation = mainRelation;
	}

	public Integer getRelationStatus() {
		return relationStatus;
	}

	public void setRelationStatus(Integer relationStatus) {
		this.relationStatus = relationStatus;
	}

	public String getApplyCollegeName() {
		return applyCollegeName;
	}

	public void setApplyCollegeName(String applyCollegeName) {
		this.applyCollegeName = applyCollegeName;
	}

	public String getApplyMajorName() {
		return applyMajorName;
	}

	public void setApplyMajorName(String applyMajorName) {
		this.applyMajorName = applyMajorName;
	}

	public String getApplyStatusName() {
		return applyStatusName;
	}

	public void setApplyStatusName(String applyStatusName) {
		this.applyStatusName = applyStatusName;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Integer getExpressStatus() {
		return expressStatus;
	}

	public void setExpressStatus(Integer expressStatus) {
		this.expressStatus = expressStatus;
	}

	public String getApplyTerm() {
		return applyTerm;
	}

	public void setApplyTerm(String applyTerm) {
		this.applyTerm = applyTerm;
	}

	public String getApplyEdu() {
		return applyEdu;
	}

	public void setApplyEdu(String applyEdu) {
		this.applyEdu = applyEdu;
	}

	public String getApplyCategory() {
		return applyCategory;
	}

	public void setApplyCategory(String applyCategory) {
		this.applyCategory = applyCategory;
	}
}
