package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "contract_refund_relation")
public class Refund
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**学号*/
    @Column(name ="student_no")
	private String student_no;
	/**退费申请日期*/
    @Column(name ="REFUND_APPLY_DATE")
	private Date refundApplyDate;
	/**确认退费日期*/
    @Column(name ="CONFIRM_DATE")
	private Date confirmDate;

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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  退费申请日期
	 */

	public Date getRefundApplyDate(){
		return this.refundApplyDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  退费申请日期
	 */
	public void setRefundApplyDate(Date refundApplyDate){
		this.refundApplyDate = refundApplyDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  确认退费日期
	 */

	public Date getConfirmDate(){
		return this.confirmDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  确认退费日期
	 */
	public void setConfirmDate(Date confirmDate){
		this.confirmDate = confirmDate;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
}
