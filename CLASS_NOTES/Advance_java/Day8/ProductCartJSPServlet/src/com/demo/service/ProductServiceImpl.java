package com.demo.service;

import java.util.List;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
     private ProductDao pdao;

	public ProductServiceImpl() {
			pdao=new ProductDaoImpl();
	}

	@Override
	public List<Product> getAllProducts() {
		return pdao.findAllProducts();
	}

	@Override
	public boolean addproduct(Product p) {
		
		return pdao.save(p);
	}

	@Override
	public Product getById(int pid) {
		return pdao.findById(pid);
	}

	@Override
	public boolean updateproduct(Product p) {
		return pdao.modifyproduct(p);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}
     
}
