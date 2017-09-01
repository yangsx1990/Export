package com.erp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Table(name = "student_info")
public class StudentInfo
{
	/**主键id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**内网学号*/
    @Column(name ="SYSTEM_NO")
	private String systemNo;
	/**学生姓名*/
    @Column(name ="NAME")
	private String name;

    /**姓名拼音**/
    @Column(name="pinyin")
    private String pinyin;
	/**性别*/
    @Column(name ="GENDER")
	private Integer gender;
	/**出生日期*/
    @Column(name ="BIRTHDAY")
	private Date birthday;
	/**家庭住址*/
  /*  @Column(name ="ADDRESS")
	private String address;
	*//**移动电话*//*
    @Column(name ="MOBILE")
	private String mobile;
	*//**固定电话*//*
    @Column(name ="FIXED_PHONE")
	private String fixedPhone;
	*//**邮政编码*//*
    @Column(name ="POSTALCODE")
	private String postalcode;
	*//**qq号*//*
    @Column(name ="QQ_NUMBER")
	private String qqNumber;
	*//**微信号*//*
    @Column(name ="WEICHAT_NUMBER")
	private String weichatNumber;
	*//**邮箱*//*
    @Column(name ="EMAIL")
	private String email;*/
	/**分支机构id*/
    @Column(name ="BRANCH_ID")
	private Integer branchId;
	/**是否为vip用户：0-否 1-是*/
    @Column(name ="VIP_STATUS")
	private Integer vipStatus;
	/**是否毕业：0-否 1-是*/
    @Column(name ="GRADUATION_STATUS")
	private Integer graduationStatus;
	/**所在学校*/
    @Column(name ="SCHOOL")
	private String school;
	/**当前学历*/
    @Column(name ="EDUCATION")
	private String education;
	/**专业*/
    @Column(name ="MAJOR")
	private String major;
	/**年级*/
    @Column(name ="GRADE")
	private String grade;
	/**申请账号*/
    @Column(name ="EMAIL_ACCOUNT")
	private String emailAccount;
	/**申请密码*/
    @Column(name ="EMAIL_PASSWORD")
	private String emailPassword;
/**学历名称**/
    @Transient
	private String educationName;
    @Transient
	private String contract_type;

    @Transient
	private String contract_name;

    /**工作经验**/
	@Transient
	private String experiencename;

	/**考试类型**/
	@Transient
	private String examType;
	/**考试成绩**/
	@Transient
	private String examScore;
	/**gpa**/
	@Transient
	private String gpa;
	/****/
	@Transient
	private String workStatus;
	/**工作职务**/
	@Transient
	private String workPosition;

    @Transient
	private BigDecimal amount;

    /**分支机构名称**/
    @Column(name="branch_name")
	private String branchName;

	/**海外住址**/
    @Column(name="overseas_address")
    private String overseasAddress;

	/**海外联系方式**/
	@Column(name="overseas_phone")
	private String overseasPhone;
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  主键id
	 */

	public Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  主键id
	 */
	public void setId(Integer id){
		this.id = id;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  内网学号
	 */

	public String getSystemNo(){
		return this.systemNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  内网学号
	 */
	public void setSystemNo(String systemNo){
		this.systemNo = systemNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学生姓名
	 */

	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学生姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  性别
	 */

	public Integer getGender(){
		return this.gender;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  性别
	 */
	public void setGender(Integer gender){
		this.gender = gender;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  出生日期
	 */

	public Date getBirthday(){
		return this.birthday;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  出生日期
	 */
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  家庭住址
	 */
/*
	public String getAddress(){
		return this.address;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  家庭住址
	 *//*
	public void setAddress(String address){
		this.address = address;
	}
	*//**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  移动电话
	 *//*

	public String getMobile(){
		return this.mobile;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  移动电话
	 *//*
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	*//**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  固定电话
	 *//*

	public String getFixedPhone(){
		return this.fixedPhone;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  固定电话
	 *//*
	public void setFixedPhone(String fixedPhone){
		this.fixedPhone = fixedPhone;
	}
	*//**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮政编码
	 *//*

	public String getPostalcode(){
		return this.postalcode;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮政编码
	 *//*
	public void setPostalcode(String postalcode){
		this.postalcode = postalcode;
	}
	*//**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  qq号
	 *//*

	public String getQqNumber(){
		return this.qqNumber;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  qq号
	 *//*
	public void setQqNumber(String qqNumber){
		this.qqNumber = qqNumber;
	}
	*//**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  微信号
	 *//*

	public String getWeichatNumber(){
		return this.weichatNumber;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  微信号
	 *//*
	public void setWeichatNumber(String weichatNumber){
		this.weichatNumber = weichatNumber;
	}
	*//**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮箱
	 *//*

	public String getEmail(){
		return this.email;
	}

	*//**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮箱
	 *//*
	public void setEmail(String email){
		this.email = email;
	}*/
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  分支机构id
	 */

	public Integer getBranchId(){
		return this.branchId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  分支机构id
	 */
	public void setBranchId(Integer branchId){
		this.branchId = branchId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否为vip用户：0-否 1-是
	 */

	public Integer getVipStatus(){
		return this.vipStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否为vip用户：0-否 1-是
	 */
	public void setVipStatus(Integer vipStatus){
		this.vipStatus = vipStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否毕业：0-否 1-是
	 */

	public Integer getGraduationStatus(){
		return this.graduationStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否毕业：0-否 1-是
	 */
	public void setGraduationStatus(Integer graduationStatus){
		this.graduationStatus = graduationStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所在学校
	 */

	public String getSchool(){
		return this.school;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所在学校
	 */
	public void setSchool(String school){
		this.school = school;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  当前学历
	 */

	public String getEducation(){
		return this.education;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  当前学历
	 */
	public void setEducation(String education){
		this.education = education;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专业
	 */

	public String getMajor(){
		return this.major;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专业
	 */
	public void setMajor(String major){
		this.major = major;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  年级
	 */

	public String getGrade(){
		return this.grade;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  年级
	 */
	public void setGrade(String grade){
		this.grade = grade;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请账号
	 */

	public String getEmailAccount(){
		return this.emailAccount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请账号
	 */
	public void setEmailAccount(String emailAccount){
		this.emailAccount = emailAccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请密码
	 */

	public String getEmailPassword(){
		return this.emailPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请密码
	 */
	public void setEmailPassword(String emailPassword){
		this.emailPassword = emailPassword;
	}

	public String getContract_type() {
		return contract_type;
	}

	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}

	public String getContract_name() {
		return contract_name;
	}

	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getExperiencename() {
		return experiencename;
	}

	public void setExperiencename(String experiencename) {
		this.experiencename = experiencename;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public String getWorkPosition() {
		return workPosition;
	}

	public void setWorkPosition(String workPosition) {
		this.workPosition = workPosition;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getExamScore() {
		return examScore;
	}

	public void setExamScore(String examScore) {
		this.examScore = examScore;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getOverseasAddress() {
		return overseasAddress;
	}

	public void setOverseasAddress(String overseasAddress) {
		this.overseasAddress = overseasAddress;
	}

	public String getOverseasPhone() {
		return overseasPhone;
	}

	public void setOverseasPhone(String overseasPhone) {
		this.overseasPhone = overseasPhone;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
}
