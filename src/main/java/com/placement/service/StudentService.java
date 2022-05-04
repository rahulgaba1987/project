package com.placement.service;

import java.util.List;

import com.placement.entity.StudentEntity;

public interface StudentService
{
	  public void addStudent(StudentEntity student);
	  public List<StudentEntity> getStudentsDetails();
	 // public StudentEntity findByUsernameAndPassword(String studentEmail, String studentContact);
	  public StudentEntity findByStudentEmailAndStudentContact(String studentEmail, String studentContact);
	  
	  
	  public List<StudentEntity> viewStudentList();

}
