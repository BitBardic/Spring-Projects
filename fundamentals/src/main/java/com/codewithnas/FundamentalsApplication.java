package com.codewithnas;

import com.codewithnas.entity.Application;
import com.codewithnas.entity.Release;
import com.codewithnas.entity.Ticket;
import com.codewithnas.repository.ReleaseRepository;
import com.codewithnas.repository.TicketRepository;
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
	public CommandLineRunner demo(ApplicationRepository applicationRepository,
								  ReleaseRepository releaseRepository,
								  TicketRepository ticketRepository) {
		return (args) -> {
			var app1 = new Application("Trackzilla","kesha.williams","Application for tracking bugs.");
			applicationRepository.save(app1);

			var app2 = new Application("Expenses","mary.jones","Application to track expense reports.");
			applicationRepository.save(app2);

			var app3 = new Application("Notifications","karen.kane","Application to send alerts and notifications to users.");
			applicationRepository.save(app3);

			/*var release1 = new Release(1,"release 1","2030-05-27");
			releaseRepository.save(release1);

			var release2 = new Release(2,"release 2","2025-05-27");
			releaseRepository.save(release1);

			var release3 = new Release(3,"release 3","2020-05-27");
			releaseRepository.save(release1);

			var ticket1 = new Ticket("Sort Feature", "Add the ability to sort tickets by serverity", app1, release1, "open");
			ticketRepository.save(ticket1);

			var ticket2 = new Ticket("Search Feature", "Add the ability to sort tickets by serverity", app1, release1, "pending");
			ticketRepository.save(ticket2);

			var ticket3 = new Ticket("Booking Feature", "Add the ability to sort tickets by serverity", app1, release1, "close");
			ticketRepository.save(ticket3);*/





			for (Application application : applicationRepository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}

}
