package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "apply_offer_relation")
public class Offer
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**applyId*/
    @Column(name ="APPLY_ID")
	private Integer applyId;
	/**offerInfo*/
    @Column(name ="OFFER_INFO")
	private String offerInfo;
	/**depositAmount*/
    @Column(name ="DEPOSIT_AMOUNT")
	private String depositAmount;
	/**depositDealine*/
    @Column(name ="DEPOSIT_DEALINE")
	private Date depositDealine;
	/**depositPaymentDate*/
    @Column(name ="DEPOSIT_PAYMENT_DATE")
	private Date depositPaymentDate;
	/**delayStaus*/
    @Column(name ="DELAY_STAUS")
	private Integer delayStaus;
	/**delayDate*/
    @Column(name ="DELAY_DATE")
	private Date delayDate;
	/**scholarshipStatus*/
    @Column(name ="SCHOLARSHIP_STATUS")
	private Integer scholarshipStatus;
	/**scholarshipAmount*/
    @Column(name ="SCHOLARSHIP_AMOUNT")
	private String scholarshipAmount;
    /**课程名称**/
    @Column(name="course_name")
	private String courseName;
	/**开课日期**/
    @Column(name="course_start_date")
	private Date courseStartDate;
	/**是否需要ATAS**/
    @Column(name="atas_status")
	private Integer atasStatus;
	/**offer类别**/
    @Column(name="offer_type")
	private Integer offerType;

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
	 *@return: java.lang.Integer  applyId
	 */

	public Integer getApplyId(){
		return this.applyId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  applyId
	 */
	public void setApplyId(Integer applyId){
		this.applyId = applyId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  offerInfo
	 */

	public String getOfferInfo(){
		return this.offerInfo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  offerInfo
	 */
	public void setOfferInfo(String offerInfo){
		this.offerInfo = offerInfo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  depositAmount
	 */

	public String getDepositAmount(){
		return this.depositAmount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  depositAmount
	 */
	public void setDepositAmount(String depositAmount){
		this.depositAmount = depositAmount;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  depositDealine
	 */

	public Date getDepositDealine(){
		return this.depositDealine;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  depositDealine
	 */
	public void setDepositDealine(Date depositDealine){
		this.depositDealine = depositDealine;
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
	 *@return: java.lang.Integer  delayStaus
	 */

	public Integer getDelayStaus(){
		return this.delayStaus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  delayStaus
	 */
	public void setDelayStaus(Integer delayStaus){
		this.delayStaus = delayStaus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  delayDate
	 */

	public Date getDelayDate(){
		return this.delayDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  delayDate
	 */
	public void setDelayDate(Date delayDate){
		this.delayDate = delayDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  scholarshipStatus
	 */

	public Integer getScholarshipStatus(){
		return this.scholarshipStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  scholarshipStatus
	 */
	public void setScholarshipStatus(Integer scholarshipStatus){
		this.scholarshipStatus = scholarshipStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  scholarshipAmount
	 */

	public String getScholarshipAmount(){
		return this.scholarshipAmount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  scholarshipAmount
	 */
	public void setScholarshipAmount(String scholarshipAmount){
		this.scholarshipAmount = scholarshipAmount;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public Integer getAtasStatus() {
		return atasStatus;
	}

	public void setAtasStatus(Integer atasStatus) {
		this.atasStatus = atasStatus;
	}

	public Integer getOfferType() {
		return offerType;
	}

	public void setOfferType(Integer offerType) {
		this.offerType = offerType;
	}
}
