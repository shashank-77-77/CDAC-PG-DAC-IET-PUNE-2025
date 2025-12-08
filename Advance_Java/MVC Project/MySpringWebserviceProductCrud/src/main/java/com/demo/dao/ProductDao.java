package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dto.ProductDto;

public interface ProductDao {

	List<Product> findAllProducts();

	boolean save(Product p);

	Product findById(int pid);

	boolean modifyProduct(Product p);

	boolean removeById(int pid);

}
