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
	/**学号*/
    @Column(name ="student_no")
	private String studentNo;
	/**操作人id*/
    @Column(name ="OPERATOR")
	private Integer operator;
	/**操作人名称*/
    @Column(name="operator_name")
	private  String operatorName;

	/**转案日期*/
    @Column(name ="transfer_date")
	private Date transferDate;

    /**转案类型：1-销售转文案 2-文案转外联 3-外联转签证**/
    @Column(name="transfer_type")
	private Integer transferType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public Integer getTransferType() {
		return transferType;
	}

	public void setTransferType(Integer transferType) {
		this.transferType = transferType;
	}
}
