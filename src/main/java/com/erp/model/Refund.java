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
	/**contractId*/
    @Column(name ="CONTRACT_ID")
	private Integer contractId;
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
}
