package com.demo.JWTSecurityUsingdatabse.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.JWTSecurityUsingdatabse.beans.Product;
import com.demo.JWTSecurityUsingdatabse.dao.ProductDao;
import com.demo.JWTSecurityUsingdatabse.dto.ProductDto;
import com.demo.JWTSecurityUsingdatabse.mapper.ProductDtoMapper;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao pdao;

	@Override
	public List<ProductDto> getAllproducts() {
		List<Product> plist=pdao.findAll();
		List<ProductDto> plist1=plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
	}
	

}
