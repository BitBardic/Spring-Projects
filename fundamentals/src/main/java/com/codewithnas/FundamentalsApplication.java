package com.codewithnas;

import com.codewithnas.entity.Application;
import org.springframework.boot.CommandLineRunner;
import com.codewithnas.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


// This annotation is equivalent to below three annotations
@SpringBootApplication

//@SpringBootConfiguration
// Replaces @Configuration and annotates a class as a configuration

//@EnableAutoConfiguration
// Tell Spring Boot to configure beans

//@ComponentScan
// Tells Spring Boot to scan current package and subpackages

public class FundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla","kesha.williams","Application for tracking bugs."));
			repository.save(new Application("Expenses","mary.jones","Application to track expense reports."));
			repository.save(new Application("Notifications","karen.kane","Application to send alerts and notifications to users."));

			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}

}
