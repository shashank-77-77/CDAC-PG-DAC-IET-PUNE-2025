package com.demo.SpringBootMVCProductCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootMVCProductCrud.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

}
