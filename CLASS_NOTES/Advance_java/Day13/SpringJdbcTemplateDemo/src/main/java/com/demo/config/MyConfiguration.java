package com.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configuration
//@PropertySource("data.properties")
public class MyConfiguration {
	
	//@Bean 
	public PropertySourcesPlaceholderConfigurer getPlaceHolder() {
		System.out.println("in getPlaceHolder");
		PropertySourcesPlaceholderConfigurer placeholder=new PropertySourcesPlaceholderConfigurer();
		return placeholder;
	}
	
	//@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(null);
		ds.setUrl(null);
		ds.setUsername(null);
		ds.setPassword(null);
		return ds;
	}
	
	//@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

}
