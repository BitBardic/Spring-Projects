package com.codewithnas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// This annotation is equivalent to below three annotations
@SpringBootApplication

//@SpringBootConfiguration
// Replaces @Configuration and annotates a class as a configuration

//@EnableAutoConfiguration
// Tell Spring Boot to configure beans

//@ComponentScan
// Tells Spring Boot to scan current package and subpackages

public class FundamentalsApplication {
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}
}