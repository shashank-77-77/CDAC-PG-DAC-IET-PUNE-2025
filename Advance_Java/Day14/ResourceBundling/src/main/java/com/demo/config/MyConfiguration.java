package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MyConfiguration {
	
	@Bean
	public ResourceBundleMessageSource getMessageSource() {
		ResourceBundleMessageSource rms=new ResourceBundleMessageSource();
		rms.setBasename("messages");
		return rms;
	}

}
