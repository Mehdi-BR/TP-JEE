package org.sid.Billingservice;

import org.sid.Billingservice.feign.CustomerRestClient;
import org.sid.Billingservice.feign.ProductItemRestClient;
import org.sid.Billingservice.repositories.BillRepository;
import org.sid.Billingservice.repositories.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BillingServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(BillRepository billRepository,
							ProductItemRepository productItemRepository,
							CustomerRestClient customerRestClient,
							ProductItemRestClient productItemRestClient){

		return args->{

		};
	}
}
