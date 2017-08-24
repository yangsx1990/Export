package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "apply_college_reply_relation")
public class Reply
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**申请id*/
    @Column(name ="APPLY_ID")
	private Integer applyId;
	/**回复途径*/
    @Column(name ="REPLY_WAY")
	private Integer replyWay;
	/**回复类型：1-收到申请  2-要求补件 3-确认收到补件 4-offer到达 5-无offer 6-coe电子版到达 7-coe原件 8-offer延期 */
    @Column(name ="REPLY_TYPE")
	private Integer replyType;
	/**补充说明*/
    @Column(name ="ADD_COMMENT")
	private String addComment;
	/**回复日期，即申请结果到达日期。*/
    @Column(name ="REPLY_DATE")
	private Date replyDate;
	/**创建日期*/
    @Column(name ="CREATE_DATE")
	private Date createDate;
	/**回复结果:1-录取 2-拒绝*/
    @Column(name ="REPLY_RESULT")
	private Integer replyResult;
	/**回复offer截止日期*/
    @Column(name ="REPLY_OFFER_DEALINE")
	private Date replyOfferDealine;

	/**回复id，本表的主键，代表针对某条记录*/
    @Column(name ="REPLY_ID")
	private Integer replyId;
	/**录取拒绝原因*/
    @Column(name ="REPLY_REASON")
	private String replyReason;
	/**学生确认offer日期*/
    @Transient
	private Date studentConfirmDate;
	/**学校确认offer日期*/
    @Transient
	private Date schoolConfirmStuDate;

	/**无条件offer到达日期*/
	@Transient
	private Date UnConditionDate;
	/**学生确认无条件offer日期*/
	@Transient
	private Date studentConfirmUnConditionDate;
	/**学校确认无条件offer日期*/
	@Transient
	private Date schoolConfirmStuUnConditionDate;
	/**押金支付日期*/
	@Transient
	private Date depositPaymentDate;
	/**coe日期**/
	@Transient
	private Date coeDate;

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
	 *@return: java.lang.Integer  申请id
	 */

	public Integer getApplyId(){
		return this.applyId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  申请id
	 */
	public void setApplyId(Integer applyId){
		this.applyId = applyId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  回复途径
	 */

	public Integer getReplyWay(){
		return this.replyWay;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  回复途径
	 */
	public void setReplyWay(Integer replyWay){
		this.replyWay = replyWay;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  回复类型：1-offer到达 2-无offer 3-coe到达
	 */

	public Integer getReplyType(){
		return this.replyType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  回复类型：1-offer到达 2-无offer 3-coe到达
	 */
	public void setReplyType(Integer replyType){
		this.replyType = replyType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  补充说明
	 */

	public String getAddComment(){
		return this.addComment;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  补充说明
	 */
	public void setAddComment(String addComment){
		this.addComment = addComment;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  回复日期，即申请结果到达日期。
	 */

	public Date getReplyDate(){
		return this.replyDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  回复日期，即申请结果到达日期。
	 */
	public void setReplyDate(Date replyDate){
		this.replyDate = replyDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  回复结果:1-录取 2-拒绝
	 */

	public Integer getReplyResult(){
		return this.replyResult;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  回复结果:1-录取 2-拒绝
	 */
	public void setReplyResult(Integer replyResult){
		this.replyResult = replyResult;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  回复offer截止日期
	 */

	public Date getReplyOfferDealine(){
		return this.replyOfferDealine;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  回复offer截止日期
	 */
	public void setReplyOfferDealine(Date replyOfferDealine){
		this.replyOfferDealine = replyOfferDealine;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  回复id，本表的主键，代表针对某条记录
	 */

	public Integer getReplyId(){
		return this.replyId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  回复id，本表的主键，代表针对某条记录
	 */
	public void setReplyId(Integer replyId){
		this.replyId = replyId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  录取拒绝原因
	 */

	public String getReplyReason(){
		return this.replyReason;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  录取拒绝原因
	 */
	public void setReplyReason(String replyReason){
		this.replyReason = replyReason;
	}

	public Date getStudentConfirmDate() {
		return studentConfirmDate;
	}

	public void setStudentConfirmDate(Date studentConfirmDate) {
		this.studentConfirmDate = studentConfirmDate;
	}

	public Date getSchoolConfirmStuDate() {
		return schoolConfirmStuDate;
	}

	public void setSchoolConfirmStuDate(Date schoolConfirmStuDate) {
		this.schoolConfirmStuDate = schoolConfirmStuDate;
	}

	public Date getStudentConfirmUnConditionDate() {
		return studentConfirmUnConditionDate;
	}

	public void setStudentConfirmUnConditionDate(Date studentConfirmUnConditionDate) {
		this.studentConfirmUnConditionDate = studentConfirmUnConditionDate;
	}

	public Date getSchoolConfirmStuUnConditionDate() {
		return schoolConfirmStuUnConditionDate;
	}

	public void setSchoolConfirmStuUnConditionDate(Date schoolConfirmStuUnConditionDate) {
		this.schoolConfirmStuUnConditionDate = schoolConfirmStuUnConditionDate;
	}

	public Date getUnConditionDate() {
		return UnConditionDate;
	}

	public void setUnConditionDate(Date unConditionDate) {
		UnConditionDate = unConditionDate;
	}

	public Date getCoeDate() {
		return coeDate;
	}

	public void setCoeDate(Date coeDate) {
		this.coeDate = coeDate;
	}



	public Date getDepositPaymentDate() {
		return depositPaymentDate;
	}

	public void setDepositPaymentDate(Date depositPaymentDate) {
		this.depositPaymentDate = depositPaymentDate;
	}
}
