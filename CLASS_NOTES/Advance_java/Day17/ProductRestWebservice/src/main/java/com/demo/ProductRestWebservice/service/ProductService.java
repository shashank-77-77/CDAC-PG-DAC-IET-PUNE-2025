package com.demo.ProductRestWebservice.service;

import java.util.List;

import com.demo.ProductRestWebservice.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts(int cid);

}
