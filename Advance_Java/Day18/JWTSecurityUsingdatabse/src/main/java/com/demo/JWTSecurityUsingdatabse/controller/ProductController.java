package com.demo.JWTSecurityUsingdatabse.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.JWTSecurityUsingdatabse.dto.ProductDto;
import com.demo.JWTSecurityUsingdatabse.service.ProductService;

@RestController
public class ProductController {
	
	private ProductService pservice;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getAllProducts()
	{
		List<ProductDto> plist=pservice.getAllproducts();
		return ResponseEntity.ok(plist);
	}
}
