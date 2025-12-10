package com.example.JWTSecurityUsingdatabse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.JWTSecurityUsingdatabse.beans.MyUSer;

@Repository
public interface LoginDao extends JpaRepository<MyUSer,String>{
	@Query(value="select * from user1 where uname=:username",nativeQuery=true)
	MyUSer findByUname(String username);
}
