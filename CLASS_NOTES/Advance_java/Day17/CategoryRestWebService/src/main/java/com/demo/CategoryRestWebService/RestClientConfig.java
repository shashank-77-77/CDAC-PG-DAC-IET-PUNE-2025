package com.demo.CategoryRestWebService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient restClient() {
    	System.out.println("restclient is ready");
        return RestClient.create();
    }
}

