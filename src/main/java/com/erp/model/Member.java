package com.erp.model;

import javax.persistence.*;


@Table(name = "member_info")
public class Member
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private Integer id;
	/**oaId*/
	@Column(name ="OA_ID")
	private Integer oaId;

	/**职务级别：1-专员 2-经理 3-总监 4-总经理*/
	@Column(name ="POSITION")
	private Integer position;
	/**负责国家id，总监需填写，其他不需要*/
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

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
}
