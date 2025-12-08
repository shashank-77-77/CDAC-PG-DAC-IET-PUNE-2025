package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUSer;

@Repository
public class LoginDaoImpl implements LoginDao{
    @Autowired
	JdbcTemplate jdbcTemplate;

	public MyUSer autheticateUser(String uname, String passwd) {
		try {
		MyUSer u1=jdbcTemplate.queryForObject("select * from user1 where uname=? and password=?",
				new Object[] {uname,passwd},BeanPropertyRowMapper.newInstance(MyUSer.class));
		System.out.println(u1);
		return u1;
		}catch(EmptyResultDataAccessException e) {
			System.out.println("user not found");
			return null;
		}
	}
    
    
	
}
