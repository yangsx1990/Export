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
	/**学生no*/
    @Column(name ="STUDENT_NO")
	private String studentNo;

	/**合同no*/
	@Column(name ="contract_no")
	private String contractNo;

	/**留学国家名称*/
    @Column(name="country_name")
	private String countryName;
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

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
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

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
}
