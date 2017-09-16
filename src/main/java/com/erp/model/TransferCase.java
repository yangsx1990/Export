package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_transfer_info")
public class TransferCase
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	/**学生学号**/
    @Column(name ="student_no")
	private String studentNo;
	/**转案人*/
    @Column(name ="member_id")
	private Integer memberId;
	/**转案人名称*/
    @Column(name="member_name")
	private String memberName;

	/**岗位：1-销售顾问 2-文案 3-外联 4-业务员 5-后续员*/
	private Integer role;

	/**转案日期*/
	private Date receive;

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

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Date getReceive() {
		return receive;
	}

	public void setReceive(Date receive) {
		this.receive = receive;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
