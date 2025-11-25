package com.demo.service;


import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.beans.Product;


public class ProductServiceImpl implements ProductService{
	private ProductDao pdao;
	
	public ProductServiceImpl()
	{
		pdao=new ProductDaoImpl();
	}

	@Override
	public List<Integer> getAllCategory() {
		
		return pdao.findAllCategory();
	}

	@Override
	public List<Product> getByCid(int cid) {
		// TODO Auto-generated method stub
		return pdao.findByCategory(cid);
	}

}
