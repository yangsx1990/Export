package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_service_relation")
public class AfterBusiness
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**contractId*/
    @Column(name ="CONTRACT_ID")
	private Integer contractId;
	/**住宿类型：*/
    @Column(name ="STAY_TYPE")
	private String stayType;
	/**住宿完成日期*/
    @Column(name ="STAY_COMPLETE_DATE")
	private Date stayCompleteDate;
	/**healthTestDate*/
    @Column(name ="HEALTH_TEST_DATE")
	private Date healthTestDate;
	/**接机申请日期*/
    @Column(name ="PICK_APPLY_DATE")
	private Date pickApplyDate;
	/**接机完成日期*/
    @Column(name ="PICK_COMPLETE_DATE")
	private Date pickCompleteDate;
	/**接机信息*/
    @Column(name="pick_info")
	private String pickInfo;
	/**离境日期*/
    @Column(name ="LEAVE_DATE")
	private Date leaveDate;
	/**是否有体检要求*/
    @Column(name="health_test_status")
    private Integer healthTestStatus;
	/**学费金额*/
    @Column(name="tuition_amount")
	private String tuitionAmount;

	/**学费缴纳日期*/
	@Column(name ="tuition_payment_date")
	private Date tuitionPaymentDate;

	@Column(name="orientation_date")
	private Date orientationDate;
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
	 *@return: java.lang.Integer  contractId
	 */

	public Integer getContractId(){
		return this.contractId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  contractId
	 */
	public void setContractId(Integer contractId){
		this.contractId = contractId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  住宿类型：
	 */

	public String getStayType(){
		return this.stayType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  住宿类型：
	 */
	public void setStayType(String stayType){
		this.stayType = stayType;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  住宿完成日期
	 */

	public Date getStayCompleteDate(){
		return this.stayCompleteDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  住宿完成日期
	 */
	public void setStayCompleteDate(Date stayCompleteDate){
		this.stayCompleteDate = stayCompleteDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  healthTestDate
	 */

	public Date getHealthTestDate(){
		return this.healthTestDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  healthTestDate
	 */
	public void setHealthTestDate(Date healthTestDate){
		this.healthTestDate = healthTestDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  接机申请日期
	 */

	public Date getPickApplyDate(){
		return this.pickApplyDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  接机申请日期
	 */
	public void setPickApplyDate(Date pickApplyDate){
		this.pickApplyDate = pickApplyDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  接机完成日期
	 */

	public Date getPickCompleteDate(){
		return this.pickCompleteDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  接机完成日期
	 */
	public void setPickCompleteDate(Date pickCompleteDate){
		this.pickCompleteDate = pickCompleteDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  离境日期
	 */

	public Date getLeaveDate(){
		return this.leaveDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  离境日期
	 */
	public void setLeaveDate(Date leaveDate){
		this.leaveDate = leaveDate;
	}

	public String getPickInfo() {
		return pickInfo;
	}

	public void setPickInfo(String pickInfo) {
		this.pickInfo = pickInfo;
	}

	public Integer getHealthTestStatus() {
		return healthTestStatus;
	}

	public void setHealthTestStatus(Integer healthTestStatus) {
		this.healthTestStatus = healthTestStatus;
	}

	public String getTuitionAmount() {
		return tuitionAmount;
	}

	public void setTuitionAmount(String tuitionAmount) {
		this.tuitionAmount = tuitionAmount;
	}

	public Date getTuitionPaymentDate() {
		return tuitionPaymentDate;
	}

	public void setTuitionPaymentDate(Date tuitionPaymentDate) {
		this.tuitionPaymentDate = tuitionPaymentDate;
	}

	public Date getOrientationDate() {
		return orientationDate;
	}

	public void setOrientationDate(Date orientationDate) {
		this.orientationDate = orientationDate;
	}
}
