package com.service;

import java.util.List;

import com.beans.Product;

public interface ProductService {

	List<Integer> getAllCategory();

	List<Product> getByCid(int cid);

}
