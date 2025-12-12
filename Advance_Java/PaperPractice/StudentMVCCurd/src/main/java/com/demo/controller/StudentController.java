package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService stservice;
	
	@GetMapping("/showstudent")
	public ModelAndView getAllStudent()
	{
		List<Student> slist=stservice.getAllStudent();
		return new ModelAndView("showstudent","slist",slist);
	}
	
	@GetMapping("/addstudent")
	public String addProduct(Model me)
	{
		me.addAttribute("p1",new Student());
		return "insertStudent";
	}
	
	@PostMapping("/insertStudent")
	public ModelAndView getById(@ModelAttribute Student s1)
	{
		boolean status=stservice.addStudent(s1);
		return new ModelAndView("redirect:/student/showstudent");
				
	}
	
	@GetMapping("/editstudent/{studentID}")
	public ModelAndView editStudent(@PathVariable("studentID")int studentID)
	{
		Student s1=stservice.getById(studentID);
		if(s1 != null)
		{
			return new ModelAndView("editstudent","stud",s1);
		}
		else
		{
			return new ModelAndView("redirect:/student/showstudent");
		}
	}
	
	@PostMapping("/updatestudent")
	public ModelAndView	updateAStudent(@ModelAttribute Student s1)
	{
		boolean status=stservice.updatestudent(s1);
		return new ModelAndView("redirect:/student/showstudent");
	}
	
	@GetMapping("/deletestudent/{studentID}")
	public ModelAndView deletestudent(@PathVariable int studentID)
	{
		boolean status=stservice.deleteById(studentID);
		return new ModelAndView("redirect:/student/showstudent");
	}
	
	
}
