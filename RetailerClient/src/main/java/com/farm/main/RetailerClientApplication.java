package com.farm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RetailerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailerClientApplication.class, args);
	}

}
