package com.service;

import java.util.List;

import com.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deletebyId(int id);

	boolean modifyById(int id, int qty, double price);

	Product getById(int id);

	List<Product> getAllProduct();

	List<Product> sortByPrice();

	void closeMyConnection();

}
