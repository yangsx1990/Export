package com.erp.model;

import javax.persistence.*;


@Table(name = "student_college_plan_relation")
public class Plan
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
	private Integer college;
	/**是否加申院校*/
    @Column(name ="ADD_COLLEGE_STATUS")
	private Integer addCollegeStatus;
	/**是否协议院校*/
    @Column(name ="ADD_PROTOCOL")
	private Integer addProtocol;
	/**转案人*/
    @Column(name ="OPERATOR")
	private Integer operator;
	/**申请院校名称*/
    @Column(name ="COLLEGE_NAME")
	private String collegeName;
	/**申请专业名称*/
    @Column(name ="MAJOR_NAME")
	private String majorName;

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
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  申请院校
	 */

	public Integer getCollege(){
		return this.college;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  申请院校
	 */
	public void setCollege(Integer college){
		this.college = college;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否加申院校
	 */

	public Integer getAddCollegeStatus(){
		return this.addCollegeStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否加申院校
	 */
	public void setAddCollegeStatus(Integer addCollegeStatus){
		this.addCollegeStatus = addCollegeStatus;
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
	 *@return: java.lang.Integer  转案人
	 */

	public Integer getOperator(){
		return this.operator;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  转案人
	 */
	public void setOperator(Integer operator){
		this.operator = operator;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请院校名称
	 */

	public String getCollegeName(){
		return this.collegeName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请院校名称
	 */
	public void setCollegeName(String collegeName){
		this.collegeName = collegeName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  申请专业名称
	 */

	public String getMajorName(){
		return this.majorName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  申请专业名称
	 */
	public void setMajorName(String majorName){
		this.majorName = majorName;
	}
}
