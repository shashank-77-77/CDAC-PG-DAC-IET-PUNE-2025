package com.service;

import java.util.List;

import com.beans.Product;
import com.dao.ProductDao;
import com.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;
	
	public ProductServiceImpl()
	{
		pdao=new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getAllProducts() {
		return pdao.findAllProducts();
	}

}
