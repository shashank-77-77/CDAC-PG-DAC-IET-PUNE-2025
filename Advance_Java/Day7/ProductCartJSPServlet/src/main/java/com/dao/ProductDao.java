package com.dao;

import java.util.List;

import com.bean.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	boolean save(Product p);

	Product findById(int pid);

	boolean modifyproduct(Product p);

	boolean removeById(int pid);

}
