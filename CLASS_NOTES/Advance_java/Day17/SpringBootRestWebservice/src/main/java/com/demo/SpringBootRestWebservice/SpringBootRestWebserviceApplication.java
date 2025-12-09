package com.demo.SpringBootRestWebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;




@SpringBootApplication
public class SpringBootRestWebserviceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootRestWebserviceApplication.class, args);
		/*for(String name:ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

}
