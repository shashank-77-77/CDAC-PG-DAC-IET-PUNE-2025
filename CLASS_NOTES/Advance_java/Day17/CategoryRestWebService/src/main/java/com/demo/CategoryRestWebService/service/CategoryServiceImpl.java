package com.demo.CategoryRestWebService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.demo.CategoryRestWebService.beans.Category;
import com.demo.CategoryRestWebService.dao.CategoryDao;
import com.demo.CategoryRestWebService.dto.CategoryDto;
import com.demo.CategoryRestWebService.dto.ProductDto;

@Service
public class CategoryServiceImpl implements CategoryService{
     
	 @Autowired
	 CategoryDao cdao;
	 
	 @Autowired
	 RestClient restClient;

	@Override
	public Category getById(int cid) {
		Optional<Category> c=cdao.findById(cid);
		if(c.isPresent()) {
			return c.get();
		}
		return null;
	}

	@Override
	public CategoryDto getProdCatById(int cid) {
		Category c=cdao.findById(cid)
				.orElseThrow(() -> new RuntimeException("Category not found"));;
		
		//it will send AJAX request to product webservice to get all products by category
		List<ProductDto> productList =
                restClient.get()
                        .uri("http://localhost:8585/products/category/" + cid)
                        .retrieve()
                        .body(new ParameterizedTypeReference<List<ProductDto>>() {});
		CategoryDto cdto=new CategoryDto();
		cdto.setCategory(c);
		cdto.setPlist(productList);
		return cdto;
		
	}
}
