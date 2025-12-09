package com.demo.SpringBootMVCProductCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMVCProductCrud.beans.Product;
import com.demo.SpringBootMVCProductCrud.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
   @Autowired
	ProductDao pdao;

@Override
public List<Product> findAllProducts() {
	return pdao.findAll();
}

@Override
public void addnewProduct(Product product) {
	pdao.save(product);
	
}

@Override
public Product getById(int pid) {
	Optional<Product> op=pdao.findById(pid);
	if(op.isPresent()) {
		return op.get();
	}
	return null;
}

@Override
public void updateProduct(Product prod) {
	Optional<Product> op=pdao.findById(prod.getPid());
	if(op.isPresent()) {
		Product p=op.get();
		p.setPname(prod.getPname());
		p.setQty(prod.getQty());
		p.setPrice(prod.getPrice());
		p.setCid(prod.getCid());
		//update the product
		pdao.save(p);
		
	}
	
}

@Override
public void deleteProduct(int pid) {
	Optional<Product> op=pdao.findById(pid);
	if(op.isPresent()) {
		Product p=op.get();
		pdao.delete(p);
	}
	
}
}
