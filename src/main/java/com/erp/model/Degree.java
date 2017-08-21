package com.erp.model;

import javax.persistence.*;


@Table(name = "tbldegree")
public class Degree
{
	/**degreeid*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="DEGREEID")
	private Integer degreeId;
	/**degree*/
    @Column(name ="DEGREE")
	private String degree;
	/**orderid*/
    @Column(name ="ORDERID")
	private Integer orderId;
	/**dispflag*/
    @Column(name ="DISPFLAG")
	private Integer dispFlag;

	public Integer getDegreeId() {
		return degreeId;
	}

	public void setDegreeId(Integer degreeId) {
		this.degreeId = degreeId;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getDispFlag() {
		return dispFlag;
	}

	public void setDispFlag(Integer dispFlag) {
		this.dispFlag = dispFlag;
	}
}
