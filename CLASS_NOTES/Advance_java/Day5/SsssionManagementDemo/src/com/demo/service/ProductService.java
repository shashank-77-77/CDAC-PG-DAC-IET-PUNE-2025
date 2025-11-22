package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Integer> getAllCategory();

	List<Product> getByCid(int cid);

}
