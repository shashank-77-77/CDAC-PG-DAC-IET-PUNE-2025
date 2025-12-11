package com.demo.JWTSecurityUsingdatabse.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.demo.JWTSecurityUsingdatabse.beans.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	@Query(value="select * from product where price between :lprice and :hprice",nativeQuery=true)
	List<Product> findByPrice(double lprice,double hprice);
	
	@Procedure(procedureName="getCount")
	public int getCount();

}
