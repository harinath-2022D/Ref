package com.zettamine.hibernate.entities;

public class Student {
	private Integer studentId;
	private String studentName;
	private String studentEmail;
	public Student() {
		super();
		System.out.println("inside no args constructer ");
	}
	public Student(String studentName, String studentEmail) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	
	public Student(Integer studentId, String studentName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}
	
}
