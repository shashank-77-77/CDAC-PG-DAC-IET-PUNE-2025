package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String sayHello()
	{
		return "hello";
	}
	
	@GetMapping("/welcome")
	public ModelAndView sayWelcome()
	{
		String msg="welcome message from controller";
		return new ModelAndView("welcome","message",msg);
	}
	
	@GetMapping("/test")
	public String testdata(Model mymodel)
	{
		mymodel.addAttribute("name","Soham");
		mymodel.addAttribute("email","ss123@gmail.com");
		
		mymodel.addAttribute("name1","Shashank");
		mymodel.addAttribute("email1","shass12@gmail.com");
		return "testdata";
	}

}
