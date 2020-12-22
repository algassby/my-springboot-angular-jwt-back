package com.barry.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class MySpringBootJwtAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootJwtAngularApplication.class, args);
	}
	

}
