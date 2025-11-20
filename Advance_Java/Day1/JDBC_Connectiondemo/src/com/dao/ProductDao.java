package com.dao;

import java.util.List;

import com.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	boolean removeById(int id);

	boolean updateById(int id, int qty, double price);

	Product findById(int id);

	List<Product> findAllProducts();

	List<Product> arrangeByPrice();

	void closeConnection();

}
