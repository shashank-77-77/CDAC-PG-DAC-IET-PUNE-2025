package com.demo.CategoryRestWebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.CategoryRestWebService.beans.Category;
import com.demo.CategoryRestWebService.dto.CategoryDto;
import com.demo.CategoryRestWebService.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService cservice;
	
	
	@GetMapping("/category/{cid}")
	public ResponseEntity<Category> getById(@PathVariable int cid){
		Category c=cservice.getById(cid);
		if(c!=null) {
		return ResponseEntity.ok(c);
		}
		return (ResponseEntity<Category>) ResponseEntity.notFound();
		
		
		
	}
	@GetMapping("/categoryproduct/{cid}")
	public ResponseEntity<CategoryDto> getProductByCid(@PathVariable int cid){
		CategoryDto cdto=cservice.getProdCatById(cid);
		return ResponseEntity.ok(cdto);
		
		
		
		
		
	}

}
