package com.demo.SpringBootRestWebservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRestWebservice.dto.ProductDto;
import com.demo.SpringBootRestWebservice.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getAllProducts(){
		List<ProductDto> plist=pservice.getAllProducts();
		//return plist;
		return ResponseEntity.ok(plist);
		
	}
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<ProductDto> getById(@PathVariable int pid){
		ProductDto p=pservice.getById(pid);
		if(p!=null) {
		     return ResponseEntity.ok(p);
		}else {
			return (ResponseEntity<ProductDto>) ResponseEntity.notFound();
		}
	}
	
	@GetMapping("/products/{lprice}/{hprice}")
	public ResponseEntity<List<ProductDto>> getById(@PathVariable double lprice,@PathVariable double hprice){
		List<ProductDto> p=pservice.getByprice(lprice,hprice);
		if(p!=null) {
		     return ResponseEntity.ok(p);
		}else {
			return (ResponseEntity<List<ProductDto>>) ResponseEntity.notFound();
		}
	}
	
	@PostMapping("/products/{pid}")
	public ResponseEntity<String> addProduct(@RequestBody ProductDto p){
		boolean status=pservice.addproduct(p);
		if(status) {
			return ResponseEntity.ok("data added successfully");
		}else {
			return ResponseEntity.ok("Error occured");
		}
		
	}
	
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateProduct(@RequestBody ProductDto p){
		boolean status=pservice.updateproduct(p);
		if(status) {
			return ResponseEntity.ok("data update successfully");
		}else {
			return ResponseEntity.ok("Error occured");
		}
		
	}
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid){
		boolean status=pservice.deleteById(pid);
		if(status) {
			return ResponseEntity.ok("data deleted successfully");
		}else {
			return ResponseEntity.ok("Error occured");
		}
	}

}
