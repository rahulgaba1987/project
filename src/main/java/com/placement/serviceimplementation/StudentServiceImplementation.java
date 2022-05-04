package com.placement.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.StudentEntity;
import com.placement.repository.StudentRepository;
import com.placement.service.StudentService;


@Service
public class StudentServiceImplementation  implements StudentService
{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void addStudent(StudentEntity student) 
	{
		
		 studentRepository.save(student);
		 
	}

	@Override
	public List<StudentEntity> getStudentsDetails()
	{
		// TODO Auto-generated method stub
		
		List<StudentEntity> studentList=studentRepository.findAll();
		
		return studentList;
	}

	@Override
	public StudentEntity findByStudentEmailAndStudentContact(String studentEmail, String studentContact) {
		// TODO Auto-generated method stub
		      return studentRepository.findByStudentEmailAndStudentContact(studentEmail, studentContact);
	}

	@Override
	public List<StudentEntity> viewStudentList()
	{
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

//	@Override
//	public StudentEntity findByUsernameAndPassword(String studentEmail, String studentContact) {
//		// TODO Auto-generated method stub
//		
//		StudentEntity entity=studentRepository.findByUsernameAndPassword(studentEmail, studentContact);
//		return entity;
//	}
//    
}
