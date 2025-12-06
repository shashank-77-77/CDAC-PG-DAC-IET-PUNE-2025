package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String hompage() {
		return "index";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";   //hello is logical viewname
		
	}
	
	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String msg="welcome message from controller";
		return new ModelAndView("welcome","message",msg);   //hello is logical viewname
		
	}
	
	@GetMapping("/test")
	public String testdata(Model mymodel) {
		mymodel.addAttribute("name","Kishori");
		mymodel.addAttribute("email","kkk@gmsil.com");
		return "testdata";  
		
	}
	
	
	

}
