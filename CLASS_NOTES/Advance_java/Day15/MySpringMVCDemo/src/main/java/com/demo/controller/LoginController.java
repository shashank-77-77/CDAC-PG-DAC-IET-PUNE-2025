package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUSer;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService lservice;
	
	@GetMapping("/loginuser")
	public String showLoginForm() {
		return "loginpage";
	}
	
	@PostMapping("/validateUser")
	public ModelAndView validateUser(HttpSession session,@RequestParam("uname") String uname,@RequestParam("pass") String passwd){
		   MyUSer user=lservice.validateUser(uname,passwd);
		   if(user!=null) {
			   session.setAttribute("user", user);
			   return new ModelAndView("redirect:/product/showproduct");
			   
			  // return new ModelAndView("showproduct","message","show products");
		   }else {
			   return new ModelAndView("loginpage","message","invalid credentials");
		   }
	} 
	
	

}
