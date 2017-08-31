package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_transfer_case_info")
public class TransferCase
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**学生学号**/
    @Column(name ="student_no")
	private String studentNo;
	/**上一负责人*/
    @Column(name ="PRE_OPERATOR")
	private Integer preOperator;

	/**上一负责人*/
	@Column(name ="PRE_OPERATOR_NAME")
	private String preOperatorName;
	/**下一负责人*/
    @Column(name ="LATER_OPERATOR")
	private Integer laterOperator;

	/**下一负责人*/
	@Column(name ="LATER_OPERATOR_NAME")
	private String laterOperatorName;
	/**转出日期*/
    @Column(name ="SEND_DATE")
	private Date sendDate;
	/**接收日期*/
    @Column(name ="RECEIVE_DATE")
	private Date receiveDate;
	/**接收结果*/
    @Column(name ="RESULT")
	private Integer result;
	/**最新修改日期*/
    @Column(name ="MODIFIED_DATE")
	private Date modifiedDate;

    /**是否可用**/
    @Column(name="enable_status")
    private Integer enableStatus;
	/**业务场景：1-销售文书转文签 2-销售签证转文签 3-外联转文签 **/
	@Column(name="business_case")
	private Integer bussinessCase;


	/**销售转文签日期**/
	@Transient
	private Date saleToCopyDate;
	/**文签转外联日期**/
	@Transient
	private Date copyToConnectDate;
	/**外联转文签日期**/
	@Transient
	private Date connectToCopyDate;

	public Integer getBussinessCase() {
		return bussinessCase;
	}

	public void setBussinessCase(Integer bussinessCase) {
		this.bussinessCase = bussinessCase;
	}

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

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  preOperator
	 */

	public Integer getPreOperator(){
		return this.preOperator;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  preOperator
	 */
	public void setPreOperator(Integer preOperator){
		this.preOperator = preOperator;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  laterOperator
	 */

	public Integer getLaterOperator(){
		return this.laterOperator;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  laterOperator
	 */
	public void setLaterOperator(Integer laterOperator){
		this.laterOperator = laterOperator;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  sendDate
	 */

	public Date getSendDate(){
		return this.sendDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  sendDate
	 */
	public void setSendDate(Date sendDate){
		this.sendDate = sendDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  receiveDate
	 */

	public Date getReceiveDate(){
		return this.receiveDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  receiveDate
	 */
	public void setReceiveDate(Date receiveDate){
		this.receiveDate = receiveDate;
	}

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  result
	 */

	public Integer getResult(){
		return this.result;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  result
	 */
	public void setResult(Integer result){
		this.result = result;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  modifiedDate
	 */

	public Date getModifiedDate(){
		return this.modifiedDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  modifiedDate
	 */
	public void setModifiedDate(Date modifiedDate){
		this.modifiedDate = modifiedDate;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}


	public String getPreOperatorName() {
		return preOperatorName;
	}

	public void setPreOperatorName(String preOperatorName) {
		this.preOperatorName = preOperatorName;
	}

	public String getLaterOperatorName() {
		return laterOperatorName;
	}

	public void setLaterOperatorName(String laterOperatorName) {
		this.laterOperatorName = laterOperatorName;
	}

	public Date getSaleToCopyDate() {
		return saleToCopyDate;
	}

	public void setSaleToCopyDate(Date saleToCopyDate) {
		this.saleToCopyDate = saleToCopyDate;
	}

	public Date getCopyToConnectDate() {
		return copyToConnectDate;
	}

	public void setCopyToConnectDate(Date copyToConnectDate) {
		this.copyToConnectDate = copyToConnectDate;
	}

	public Date getConnectToCopyDate() {
		return connectToCopyDate;
	}

	public void setConnectToCopyDate(Date connectToCopyDate) {
		this.connectToCopyDate = connectToCopyDate;
	}
}
