package com.erp.model;

import javax.persistence.*;
import java.util.Date;


@Table(name = "student_exam_relation")
public class Exam
{
	/**id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
	private Integer id;
	@Column(name ="student_no")
	private String studentNo;
	/**gpa*/
    @Column(name ="GPA")
	private String gpa;
	/**examType*/
    @Column(name ="EXAM_TYPE")
	private String examType;
	/**examScore*/
    @Column(name ="EXAM_SCORE")
	private String examScore;
	/**examTypeName*/
    @Column(name ="EXAM_TYPE_NAME")
	private String examTypeName;
	/**examTime*/
    @Column(name ="EXAM_TIME")
	private Date examTime;

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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  gpa
	 */

	public String getGpa(){
		return this.gpa;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  gpa
	 */
	public void setGpa(String gpa){
		this.gpa = gpa;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  examType
	 */

	public String getExamType(){
		return this.examType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  examType
	 */
	public void setExamType(String examType){
		this.examType = examType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  examScore
	 */

	public String getExamScore(){
		return this.examScore;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  examScore
	 */
	public void setExamScore(String examScore){
		this.examScore = examScore;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  examTypeName
	 */

	public String getExamTypeName(){
		return this.examTypeName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  examTypeName
	 */
	public void setExamTypeName(String examTypeName){
		this.examTypeName = examTypeName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  examTime
	 */

	public Date getExamTime(){
		return this.examTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  examTime
	 */
	public void setExamTime(Date examTime){
		this.examTime = examTime;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
}
