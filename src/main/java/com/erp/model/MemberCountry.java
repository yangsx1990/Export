package com.erp.model;

import javax.persistence.*;


@Table(name = "member_country_relation")
public class MemberCountry
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**oaId*/
    @Column(name ="OA_ID")
	private Integer oaId;
	/**国家id*/
    @Column(name ="COUNTRY_ID")
	private Integer countryId;

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
	 *@return: java.lang.Integer  countryId
	 */

	public Integer getCountryId(){
		return this.countryId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  countryId
	 */
	public void setCountryId(Integer countryId){
		this.countryId = countryId;
	}

}
