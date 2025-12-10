package com.demo.SpringBootMVCProductCrud.service;

import java.util.List;

import com.demo.SpringBootMVCProductCrud.beans.Product;

public interface ProductService {

	List<Product> findAllProducts();

	void addnewProduct(Product product);

	Product getById(int pid);

	void updateProduct(Product prod);

	void deleteProduct(int pid);

}
