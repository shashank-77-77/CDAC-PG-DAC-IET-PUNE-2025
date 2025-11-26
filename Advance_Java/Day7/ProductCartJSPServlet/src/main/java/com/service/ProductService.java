package com.service;

import java.util.List;


import com.bean.Product;

public interface ProductService {

	List<Product> getAllProducts();

	boolean addproduct(Product p);

	Product getById(int pid);

	boolean updateproduct(Product p);

	boolean deleteById(int pid);

}
