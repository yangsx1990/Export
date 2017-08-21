package com.erp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Table(name = "student_contract_relation")
public class Contract
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**学生id*/
    @Column(name ="STUDENT_ID")
	private Integer studentId;
	/**留学国家*/
    @Column(name ="COUNTRY_NO")
	private Integer countryNo;
	/**合同类型*/
    @Column(name ="CONTRACT_TYPE")
	private Integer contractType;
	/**合同名称*/
    @Column(name ="CONTRACT_NAME")
	private String contractName;
	/**签约日期*/
    @Column(name ="SIGN_DATE")
	private Date signDate;
	/**合同金额*/
    @Column(name ="AMOUNT")
	private BigDecimal amount;
	/**合同类型名称*/
    @Column(name="contract_type_name")
	private String contractTypeName;

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
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
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  学生id
	 */

	public Integer getStudentId(){
		return this.studentId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  学生id
	 */
	public void setStudentId(Integer studentId){
		this.studentId = studentId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  留学国家
	 */

	public Integer getCountryNo(){
		return this.countryNo;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  留学国家
	 */
	public void setCountryNo(Integer countryNo){
		this.countryNo = countryNo;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  合同类型
	 */

	public Integer getContractType() {
		return contractType;
	}

	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同名称
	 */

	public String getContractName(){
		return this.contractName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同名称
	 */
	public void setContractName(String contractName){
		this.contractName = contractName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  签约日期
	 */

	public Date getSignDate(){
		return this.signDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  签约日期
	 */
	public void setSignDate(Date signDate){
		this.signDate = signDate;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  合同金额
	 */

	public BigDecimal getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  合同金额
	 */
	public void setAmount(BigDecimal amount){
		this.amount = amount;
	}
}
