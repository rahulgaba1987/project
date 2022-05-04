package com.placement.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.placement.entity.StudentEntity;
import com.placement.service.StudentService;



@Controller
//@RestController
public class StudentController
{
	  
    @Autowired	
	private StudentService studentService;
	
	//@RequestMapping(value="/home",method=RequestMethod.GET)
	
	@GetMapping("/home") //handler
	public String index()
	{
//		StudentEntity  student = new StudentEntity();
//		student.setName("Aman");
//		
//		studentService.addStudent(student);
//		
		
		
		return "home1";
	}
	
	@GetMapping("/studentDetail")
	public List<StudentEntity> getStudentsDetails()
	{
		
		return studentService.getStudentsDetails();
	
		
	}
	
	@GetMapping("/home1")
	public String home1()
	{
		return "home";
	}
	
	@GetMapping("/student")
	
	public String student()
	{
		return "student";
	}
	
	@PostMapping("/display")
	public String display(@ModelAttribute StudentEntity student, Model model)
	{
		
		studentService.addStudent(student);
		model.addAttribute("student1", student);
		
		
		
		System.out.println("Student  Name   "+student.getStudentName());
		System.out.println("Student  Contact   "+student.getStudentContact());
		System.out.println("Student  Email   "+student.getStudentEmail());
		System.out.println("Student  course   "+student.getStudentCourse());
		System.out.println("Student  Address   "+student.getStudentAddress());
		
		
		
		return "information";
	}
	@GetMapping("/dashboard")
	public String dash()
	{
		return "dashboard";
	}
	@GetMapping("/login")
	public String login(Model model)
	{
	    model.addAttribute("student", new StudentEntity());
		return "login";
	}
	@PostMapping("/loginCheck")
	public String loginCkeck(@ModelAttribute StudentEntity student,Model model, HttpSession session)
	{
		StudentEntity studentEntity= studentService.findByStudentEmailAndStudentContact(student.getStudentEmail(), student.getStudentContact());

		//StudentEntity studentEntity= studentService.findByUsernameAndPassword(student.getStudentEmail(), student.getStudentContact());

		if(Objects.isNull(studentEntity))
		{
			//session.setAttribute("message", new Message)
			 model.addAttribute("student", student);
			//ra.addFlashAttribute("emessage", "Id or password is incorrect");			
			return "redirect:/login";
			//return "login";
		}
		else
		{
//			session.setAttribute("sname",s.getSname());
//			session.setAttribute("sid",s.getSid());
//			session.setAttribute("status",true);
			//model.addAttribute("student", s);
			return "redirect:/dashboard";
		}
		
		
	
	}
	
	
	@GetMapping("/viewstudentlist")
	public String name( Model model)
	{
		
		List<StudentEntity>  obj =  studentService.viewStudentList();
		model.addAttribute("student",obj);
		return "studentlist";
	}
	
	

}
