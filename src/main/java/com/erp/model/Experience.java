package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_experience_relation")
public class Experience
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;

	@Column(name ="student_id")
	private Integer studentId;
	/**workCompany*/
    @Column(name ="WORK_COMPANY")
	private String workCompany;
	/**workPosition*/
    @Column(name ="WORK_POSITION")
	private String workPosition;
	/**workStartDate*/
    @Column(name ="WORK_START_DATE")
	private Date workStartDate;
	/**workEndDate*/
    @Column(name ="WORK_END_DATE")
	private Date workEndDate;
	/**sort*/
    @Column(name ="SORT")
	private Integer sort;
    /**工作状态：1-工作 0-实习**/
    @Column(name="work_status")
	private Integer workStatus;

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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  workCompany
	 */

	public String getWorkCompany(){
		return this.workCompany;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  workCompany
	 */
	public void setWorkCompany(String workCompany){
		this.workCompany = workCompany;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  workPosition
	 */

	public String getWorkPosition(){
		return this.workPosition;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  workPosition
	 */
	public void setWorkPosition(String workPosition){
		this.workPosition = workPosition;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  workStartDate
	 */

	public Date getWorkStartDate(){
		return this.workStartDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  workStartDate
	 */
	public void setWorkStartDate(Date workStartDate){
		this.workStartDate = workStartDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  workEndDate
	 */

	public Date getWorkEndDate(){
		return this.workEndDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  workEndDate
	 */
	public void setWorkEndDate(Date workEndDate){
		this.workEndDate = workEndDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  sort
	 */

	public Integer getSort(){
		return this.sort;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  sort
	 */
	public void setSort(Integer sort){
		this.sort = sort;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(Integer workStatus) {
		this.workStatus = workStatus;
	}
}
