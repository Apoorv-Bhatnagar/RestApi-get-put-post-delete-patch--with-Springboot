package com.spring.restspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestspringApplication.class, args);
	}

}
