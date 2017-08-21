package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "apply_urge_record_relation")
public class Urge
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**申请id*/
    @Column(name ="APPLY_ID")
	private Integer applyId;
	/**跟催类型：跟催内容：1-跟催offer 2-延期offer 3-offer出错 4-换专业 5-要求退费 6-要求学校确认收到材料  7-向学校提出其他问题*/
    @Column(name ="URGE_CONTENT")
	private Integer urgeContent;
	/**内容*/
    @Column(name ="URGE_COMMENT")
	private String urgeComment;
	/**跟催日期*/
    @Column(name ="URGE_DATE")
	private Date urgeDate;
	/**创建日期*/
    @Column(name ="CREATE_DATE")
	private Date createDate;

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
	 *@return: java.lang.Integer  跟催类型：跟催内容：1-跟催offer 2-延期offer 3-offer出错 4-换专业 5-要求退费 6-要求学校确认收到材料  7-向学校提出其他问题
	 */

	public Integer getUrgeContent(){
		return this.urgeContent;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  跟催类型：跟催内容：1-跟催offer 2-延期offer 3-offer出错 4-换专业 5-要求退费 6-要求学校确认收到材料  7-向学校提出其他问题
	 */
	public void setUrgeContent(Integer urgeContent){
		this.urgeContent = urgeContent;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  内容
	 */

	public String getUrgeComment(){
		return this.urgeComment;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  内容
	 */
	public void setUrgeComment(String urgeComment){
		this.urgeComment = urgeComment;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  跟催日期
	 */

	public Date getUrgeDate(){
		return this.urgeDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  跟催日期
	 */
	public void setUrgeDate(Date urgeDate){
		this.urgeDate = urgeDate;
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
}
