package com.erp.model;

import javax.persistence.*;


@Table(name = "member_bonus_relation")
public class Bonus
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**oaId*/
    @Column(name ="OA_ID")
	private Integer oaId;
	/**contractId*/
    @Column(name ="CONTRACT_ID")
	private Integer contractId;
	/**applyId*/
    @Column(name ="APPLY_ID")
	private Integer applyId;
	/**业务场景：1-外联寄出申请*/
    @Column(name ="BUSINESS_CASE")
	private Integer businessCase;
	/**报寄出奖金*/
    @Column(name ="BONUS_STATUS")
	private Integer bonusStatus;
	/**内网报寄出奖金*/
    @Column(name ="OA_BONUS_STATUS")
	private Integer oaBonusStatus;

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
	 *@return: java.lang.Integer  oaId
	 */

	public Integer getOaId(){
		return this.oaId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  oaId
	 */
	public void setOaId(Integer oaId){
		this.oaId = oaId;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  业务场景：1-外联寄出申请
	 */

	public Integer getBusinessCase(){
		return this.businessCase;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  业务场景：1-外联寄出申请
	 */
	public void setBusinessCase(Integer businessCase){
		this.businessCase = businessCase;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  报寄出奖金
	 */

	public Integer getBonusStatus(){
		return this.bonusStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  报寄出奖金
	 */
	public void setBonusStatus(Integer bonusStatus){
		this.bonusStatus = bonusStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  内网报寄出奖金
	 */

	public Integer getOaBonusStatus(){
		return this.oaBonusStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  内网报寄出奖金
	 */
	public void setOaBonusStatus(Integer oaBonusStatus){
		this.oaBonusStatus = oaBonusStatus;
	}
}
