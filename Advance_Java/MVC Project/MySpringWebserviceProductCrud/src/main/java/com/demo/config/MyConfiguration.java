package com.demo.config;

import javax.sql.DataSource;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

public class MyConfiguration {
	private String driverClassname;
	private String url;
	private String username;
	private String password;
	
	public static PropertySourcesPlaceholderConfigurer getPlaceholder()
	{
		System.out.println("in get placeholder");
		PropertySourcesPlaceholderConfigurer placeholder=new PropertySourcesPlaceholderConfigurer();
		return placeholder;
	}
	
	public DataSource getDataSource()
	{
		DriverManagerDataSource	ds=new DriverManagerDataSource();
		ds.setDriverClassName(driverClassname);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbctemplate=new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
	}
	
	public CommonsMultipartResolver multipartResolver()
	{
		CommonsMultipartResolver resolver=new CommonsMultipartResolver();
		resolver.setMaxUploadSize(10 * 1024 * 1024);
		return resolver;
	}
	
	public void addResourceHandler(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/photos/**")
		.addResourceLocations("file:" + System.getProperty("catalina.base") + "/user-photos/");
	}
}
