package com.placement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.placement.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{
	 public StudentEntity findByStudentEmailAndStudentContact(String studentEmail, String studentContact);
	 
	 public StudentEntity findByStudentName(String name);
	 
	 
	 
	 
	//StudentEntity findByUsernameAndPassword(String studentEmail, String studentContact);
	
	 
	 
	 
	 
	 
	 
	 
//	@Query(value = "SELECT * FROM job_applicant ja WHERE ja.sid = :sid and ja.jid = :jid",nativeQuery = true)
//	public List<JobApplicant> getJobApplicantBySidandRid( @Param("sid")long sid, @Param("jid")long jid);
//	
	//@Query(value = "SELECT * FROM student_entity st WHERE st.student_email = :student_email and st.student_contact = :student_contact",nativeQuery = true)
	//StudentEntity findByUsernameAndPassword(@Param("student_email") String studentEmail, @Param("student_contact") String studentContact);
}
