package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dto.ProductDto;

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
	public boolean addproduct(Product p) {
	
		return pdao.save(p);
	}

	@Override
	public ProductDto getById(int pid) {
		return pdao.findById(pid);

	}

	@Override
	public boolean updateproduct(Product p) {
		
		return pdao.modifyProduct(p);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public boolean updateproduct(ProductDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addproduct(ProductDto p) {
		// TODO Auto-generated method stub
		return false;
	}
}
