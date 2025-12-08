package com.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration
//@PropertySource("data.properties")
public class MyConfiguration {
	//@Value("${jdbc.driverclass}")
	private String driverClassname;
	//@Value("${jdbc.url}")
	private String url;
	//@Value("${jdbc.uname}")
	private String username;
	//@Value("${jdbc.pass}")
	private String password;
	
	
	//@Bean //it creates bean ---> application context object calls this function automatically
	public static PropertySourcesPlaceholderConfigurer getPlaceHolder() {
		System.out.println("in getPlaceHolder");
		PropertySourcesPlaceholderConfigurer placeholder=new PropertySourcesPlaceholderConfigurer();
		return placeholder;
	}
	
	
	
	//@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(driverClassname);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	//@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	

	
	//@Bean
	public CommonsMultipartResolver multipartResolver() {
	    CommonsMultipartResolver resolver = new CommonsMultipartResolver();
	    resolver.setMaxUploadSize(10 * 1024 * 1024); // 10 MB
	    return resolver;
	}
	
	//to display image on client machine
	// VERY IMPORTANT: expose file system directory as URL
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/photos/**")
                .addResourceLocations(
                    "file:" + System.getProperty("catalina.base") + "/user-photos/"
                );
    }


}
