package com.demo.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUSer;
import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService pservice;
	
	@GetMapping("/showproduct")
	public ModelAndView getAllProducts(HttpSession session) {
		MyUSer user=(MyUSer)session.getAttribute("user");
		if(user!=null && user.getRole().equals("user")) {
			List<Product> plist=pservice.getAllProducts();
			return new ModelAndView("showproduct","plist",plist);
		}else {
			 //return new ModelAndView("redirect:/login/loginuser")
			 return new ModelAndView("loginpage","message","pls provide credentials");
		}
		
	}
	
	@GetMapping("/addproduct")
	public String showproductform(Model myModel) {
		myModel.addAttribute("p1",new Product());
		return "insertProduct";
		
	}
	
	@PostMapping("/insertProduct")
	//public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty, @RequestParam double price, @RequestParam LocalDate mfgdate,@RequestParam int cid) {
	public ModelAndView insertProduct(@ModelAttribute Product p) {
		System.out.println(p);
		boolean status=pservice.addproduct(p);
		return new ModelAndView("redirect:/product/showproduct");
	}
	
	@GetMapping("/editproduct/{pid}")  
	public ModelAndView editProduct(@PathVariable("pid") int pid) {
		Product p=pservice.getById(pid);
		if(p!=null) {
			return new ModelAndView("editproduct","prod",p);
		}else {
			return new ModelAndView("redirect:/product/showproduct");
		}
		
	}
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProduct(@ModelAttribute Product p) {
		System.out.println(p);
		boolean status=pservice.updateproduct(p);
		return new ModelAndView("redirect:/product/showproduct");
	}
	
	@GetMapping("/deleteproduct/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid) {
		boolean status=pservice.deleteById(pid);
		return new ModelAndView("redirect:/product/showproduct");
	}
	

}
