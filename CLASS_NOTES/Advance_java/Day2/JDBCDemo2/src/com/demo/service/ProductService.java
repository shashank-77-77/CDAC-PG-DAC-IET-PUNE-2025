package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> getAllProducts();

	Product getById(int id);

	boolean modifyById(int id, int qty, double price);

	boolean deleteById(int id);

	List<Product> sortByPrice();

	void closeMyConnetion();

}
