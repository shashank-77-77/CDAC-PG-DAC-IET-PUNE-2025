package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAllProducts();

	Product findById(int id);

	boolean updateById(int id, int qty, double price);

	boolean removeById(int id);

	List<Product> arrangeByPrice();

	void closeConnection();

}
