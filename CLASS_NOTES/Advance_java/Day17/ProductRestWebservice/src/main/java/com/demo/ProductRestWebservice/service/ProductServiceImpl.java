package com.demo.ProductRestWebservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ProductRestWebservice.beans.Product;
import com.demo.ProductRestWebservice.dao.ProductDao;
import com.demo.ProductRestWebservice.dto.ProductDto;
import com.demo.ProductRestWebservice.mapper.ProductDtoMapper;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao pdao;

	@Override
	public List<ProductDto> getAllProducts(int cid) {
		List<Product> plist=pdao.findAllByCid(cid);
		List<ProductDto> plist1=plist.stream()
				.map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
	}

}
