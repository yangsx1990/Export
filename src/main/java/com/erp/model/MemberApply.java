package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "member_apply_relation")
public class MemberApply
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**学号*/
    @Column(name ="student_no")
	private String studentNo;
	/**申请类别*/
    @Column(name ="APPLY_TYPE")
	private Integer applyType;
	/**员工姓名*/
	@Column(name ="member_name")
	private Integer memberName;
	/**员工id*/
    @Column(name ="MEMBER_ID")
	private Integer memberId;
	/**员工角色*/
    @Column(name="member_role")
	private Integer memberRole;
	/**是否可用*/
    @Column(name ="ENABLE")
	private Integer enable;
	/**国家id*/
    @Column(name ="COUNTRY_ID")
	private Integer countryId;
	/**预计开学日*/
    @Column(name ="EXPECT_START_DATE")
	private String expectStartDate;
	/**是否可用 1-可用 0-不可用*/
    @Column(name ="SINGLE_STATUS")
	private Integer singleStatus;

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
	 *@return: java.lang.Integer  申请类别
	 */

	public Integer getApplyType(){
		return this.applyType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  申请类别
	 */
	public void setApplyType(Integer applyType){
		this.applyType = applyType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  员工id
	 */

	public Integer getMemberId(){
		return this.memberId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  员工id
	 */
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否可用
	 */

	public Integer getEnable(){
		return this.enable;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否可用
	 */
	public void setEnable(Integer enable){
		this.enable = enable;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  国家id
	 */

	public Integer getCountryId(){
		return this.countryId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  国家id
	 */
	public void setCountryId(Integer countryId){
		this.countryId = countryId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  预计开学日
	 */

	public String getExpectStartDate(){
		return this.expectStartDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  预计开学日
	 */
	public void setExpectStartDate(String expectStartDate){
		this.expectStartDate = expectStartDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否可用 1-可用 0-不可用
	 */

	public Integer getSingleStatus(){
		return this.singleStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否可用 1-可用 0-不可用
	 */
	public void setSingleStatus(Integer singleStatus){
		this.singleStatus = singleStatus;
	}

	public Integer getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(Integer memberRole) {
		this.memberRole = memberRole;
	}

	public Integer getMemberName() {
		return memberName;
	}

	public void setMemberName(Integer memberName) {
		this.memberName = memberName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
}
