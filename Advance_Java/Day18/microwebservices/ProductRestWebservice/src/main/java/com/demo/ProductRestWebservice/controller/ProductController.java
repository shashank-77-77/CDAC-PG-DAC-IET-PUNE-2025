package com.demo.ProductRestWebservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ProductRestWebservice.beans.Product;
import com.demo.ProductRestWebservice.dto.ProductDto;
import com.demo.ProductRestWebservice.service.ProductService;

@RestController
//@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService pservice;
	
	@GetMapping("/products/category/{cid}")
	public ResponseEntity<List<ProductDto>> getByCategoryId(@PathVariable int cid ){
		List<ProductDto> plist=pservice.getAllProducts(cid);
		return ResponseEntity.ok(plist);
		
		
	}

}
