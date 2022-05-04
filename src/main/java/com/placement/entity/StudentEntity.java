package com.placement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class StudentEntity
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	@NonNull
	private String studentName;
	
	private String studentEmail;
	
	private String studentContact;
	
	private String studentCourse;
	
	private String studentAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public StudentEntity(int id, String studentName, String studentEmail, String studentContact, String studentCourse,
			String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentContact = studentContact;
		this.studentCourse = studentCourse;
		this.studentAddress = studentAddress;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentContact=" + studentContact + ", studentCourse=" + studentCourse + ", studentAddress="
				+ studentAddress + "]";
	}
	

	
	
	
	

}
