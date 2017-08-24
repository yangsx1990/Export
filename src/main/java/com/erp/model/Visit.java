package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "apply_visit_record_relation")
public class Visit
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**申请id*/
    @Column(name ="APPLY_ID")
	private Integer applyId;
	/**回访类型：1-无条件offer跟催 2-其他*/
    @Column(name ="VISIT_TYPE")
	private Integer visitType;
	/**回访内容*/
    @Column(name ="CONTENT")
	private String content;
	/**回访日期*/
    @Column(name ="VISIT_DATE")
	private Date visitDate;
	/**创建日期*/
    @Column(name ="CREATE_DATE")
	private Date createDate;
	/**创建人*/
    @Column(name ="CREATE_BY")
	private Integer createBy;
	/**回访类型：1-外联发给学校 2-学校发给外联*/
    @Column(name ="SEND_TYPE")
	private Integer sendType;

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
	 *@return: java.lang.Integer  回访途径
	 */

	public Integer getVisitType(){
		return this.visitType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  回访途径
	 */
	public void setVisitType(Integer visitType){
		this.visitType = visitType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  回访内容
	 */

	public String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  回访内容
	 */
	public void setContent(String content){
		this.content = content;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  回访日期
	 */

	public Date getVisitDate(){
		return this.visitDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  回访日期
	 */
	public void setVisitDate(Date visitDate){
		this.visitDate = visitDate;
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
	 *@return: java.lang.Integer  创建人
	 */

	public Integer getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  创建人
	 */
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  回访类型：1-外联发给学校 2-学校发给外联
	 */

	public Integer getSendType(){
		return this.sendType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  回访类型：1-外联发给学校 2-学校发给外联
	 */
	public void setSendType(Integer sendType){
		this.sendType = sendType;
	}
}
