package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUSer;
import com.demo.dto.RegistrationForm;
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
	
	@GetMapping("/registerme")
	public String showRegisterForm(Model m) {
		m.addAttribute("register",new RegistrationForm());
		m.addAttribute("availableSkills", Arrays.asList("Java","Spring","Hibernate","SQL","JS")); 
		m.addAttribute("city",List.of("Pune","Mumbai","Nagpur","Delhi"));
		return "registerform";
		
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("registrationForm") @Valid RegistrationForm form, BindingResult br, Model model) throws IOException 
	{ 
		if (br.hasErrors()) 
		{ 
			model.addAttribute("availableSkills", Arrays.asList("Java","Spring","Hibernate","SQL","JS")); 
			
			return "registerform"; 
		} 
		// Save file to disk (example path) — in production use a dedicated storage 
		    MultipartFile photo = form.getPhoto(); 
		    String uploadDir = System.getProperty("catalina.base") + File.separator + "user-photos"; 
		    // or configure File 
		    File dir = new File(uploadDir); 
		    if (!dir.exists()) 
		    	dir.mkdirs(); 
		    //retrieve extenssion of the file
		    String ext = FilenameUtils.getExtension(photo.getOriginalFilename());
		    //generate unique file name
            String savedName = form.getUsername() + "_profile." + ext; 
            File dest = new File(dir, savedName); 
            //copy the file file on the server
            photo.transferTo(dest); 
            //Mapping of DTO to Bean
            MyRegisterUser user = new MyRegisterUser(); 
            user.setUserId(form.getUserId()); 
            user.setName(form.getName()); 
            user.setGender(form.getGender()); 
            user.setDob(form.getDob()); 
            user.setUsername(form.getUsername()); 
            user.setPassword(form.getPassword()); // hash in real app 
            user.setSkills(String.join(",", form.getSkills())); 
            user.setPhotoPath(dest.getAbsolutePath()); 
            lservice.registerUser(user); 
            model.addAttribute("user", user); 
            return "register-success"; 
             
	
		}

}
