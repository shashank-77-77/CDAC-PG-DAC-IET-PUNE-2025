package com.example.JWTSecurityUsingdatabse.service;

import java.util.List;

import com.example.JWTSecurityUsingdatabse.dto.ProductDto;



public interface ProductService {

	List<ProductDto> getAllProducts();

	boolean addproduct(ProductDto p);

	ProductDto getById(int pid);

	boolean updateproduct(ProductDto p);

	boolean deleteById(int pid);

	List<ProductDto> getByprice(double lprice, double hprice);


  
}
