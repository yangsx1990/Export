package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "apply_operator_relation")
public class Operator
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**applyId*/
    @Column(name ="APPLY_ID")
	private Integer applyId;
	/**operator*/
    @Column(name ="OPERATOR")
	private Integer operator;

    @Column(name="operator_name")
	private  String operatorName;
	/**role*/
    @Column(name ="ROLE")
	private Integer role;
	/**startTime*/
    @Column(name ="START_TIME")
	private Date startTime;
	/**endTime*/
    @Column(name ="END_TIME")
	private Date endTime;

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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  operator
	 */

	public Integer getOperator(){
		return this.operator;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  operator
	 */
	public void setOperator(Integer operator){
		this.operator = operator;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  role
	 */

	public Integer getRole(){
		return this.role;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  role
	 */
	public void setRole(Integer role){
		this.role = role;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  startTime
	 */

	public Date getStartTime(){
		return this.startTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  startTime
	 */
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  endTime
	 */

	public Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  endTime
	 */
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
}
