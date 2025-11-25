package com.service;


import java.util.List;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.beans.Product;


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
