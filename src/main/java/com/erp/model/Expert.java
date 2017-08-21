package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "t_s_expert")
public class Expert
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**专家姓名*/
	private String name;
	/**头衔*/
	private String title;
	/**缩略图*/
	private String picture;
	/**员工OAid*/
    @Column(name ="oa_id")
	private Integer oaId;
	/**从业年限*/
	private Integer experience;


	/**所属国家*/
	private Integer nation;
	/**所属分支机构*/
	private Integer branch;

	@Transient
	private String nationName;
	/**所属分支机构*/
	@Transient
	private String branchName;

	/**0：已删除1：正常*/
    @Column(name ="del_flag")
	private Integer delFlag;
	/**创建时间*/
    @Column(name ="create_date")
	private Date createDate;
	/**创建人编号*/
    @Column(name ="create_by")
	private String createBy;
	/**创建人姓名*/
    @Column(name ="create_name")
	private String createName;
	/**更新日期*/
    @Column(name ="update_date")
	private Date updateDate;
	/**更新人编号*/
    @Column(name ="update_by")
	private String updateBy;
	/**更新人姓名*/
    @Column(name ="update_name")
	private String updateName;

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */

	public Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专家姓名
	 */

	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专家姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  头衔
	 */

	public String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  头衔
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缩略图
	 */

	public String getPicture(){
		return this.picture;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缩略图
	 */
	public void setPicture(String picture){
		this.picture = picture;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  员工OAid
	 */

	public Integer getOaId(){
		return this.oaId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  员工OAid
	 */
	public void setOaId(Integer oaId){
		this.oaId = oaId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  从业年限
	 */

	public Integer getExperience(){
		return this.experience;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  从业年限
	 */
	public void setExperience(Integer experience){
		this.experience = experience;
	}


	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  简短描述
	 */

	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  所属国家
	 */

	public Integer getNation(){
		return this.nation;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  所属国家
	 */
	public void setNation(Integer nation){
		this.nation = nation;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  所属分支机构
	 */

	public Integer getBranch(){
		return this.branch;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  所属分支机构
	 */
	public void setBranch(Integer branch){
		this.branch = branch;
	}



	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  0：已删除1：正常
	 */

	public Integer getDelFlag(){
		return this.delFlag;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  0：已删除1：正常
	 */
	public void setDelFlag(Integer delFlag){
		this.delFlag = delFlag;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */

	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人编号
	 */

	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人编号
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人姓名
	 */

	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人姓名
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人编号
	 */

	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人编号
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人姓名
	 */

	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人姓名
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}

	public String getNationName() {
		return nationName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
}
