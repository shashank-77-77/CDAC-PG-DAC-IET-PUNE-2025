package com.demo.SpringBootMVCProductCrud.controller;

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

import com.demo.SpringBootMVCProductCrud.beans.Product;
import com.demo.SpringBootMVCProductCrud.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@GetMapping("/getproducts")
	public ModelAndView getAllProducts() {
		List<Product> plist=pservice.findAllProducts();
		return new ModelAndView("showproduct","plist",plist);
		
	}
	
	@GetMapping("/addproduct")
	public String showaddproductform(Model m) {
		m.addAttribute("product",new Product());
		return "insertProduct";
		
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProduct( @ModelAttribute Product product) {
		pservice.addnewProduct(product);
		return new ModelAndView("redirect:/product/getproducts");
		
	}
	@GetMapping("/editproduct/{pid}")
	public ModelAndView editProduct(@PathVariable int pid) {
		Product p=pservice.getById(pid);
		if(p!=null) {
		   return new ModelAndView("editproduct","prod",p);
		}
		else {
		   return new ModelAndView("redirect:/product/getproducts");
		}
	}
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProduct(@ModelAttribute Product prod) {
		pservice.updateProduct(prod);
		return new ModelAndView("redirect:/product/getproducts");
	}
	
	@GetMapping("/deleteproduct/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid) {
		pservice.deleteProduct(pid);
		return new ModelAndView("redirect:/product/getproducts");
	}
	
	
			

}
