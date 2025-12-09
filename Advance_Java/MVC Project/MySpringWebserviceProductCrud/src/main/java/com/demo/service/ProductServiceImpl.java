package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dto.ProductDto;
import com.demo.mapper.ProductDtoMapper;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao pdao;

	public List<ProductDto> getAllProducts() {
		List<Product> plist=pdao.findAllProducts();
		List<ProductDto> plist1=plist.stream()
				.map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
	}

	@Override
	public boolean addproduct(ProductDto p) {
		Product prod=ProductDtoMapper.mapToProduct(p);
		return pdao.save(prod);
	}
	@Override
	public ProductDto getById(int pid) {
		Product p=pdao.findById(pid);
		ProductDto prod=ProductDtoMapper.mapToProductDto(p);
		return prod;
	}

	@Override
	public boolean updateproduct(ProductDto p) {
		Product prod=ProductDtoMapper.mapToProduct(p);
		return pdao.modifyProduct(prod);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}
}
