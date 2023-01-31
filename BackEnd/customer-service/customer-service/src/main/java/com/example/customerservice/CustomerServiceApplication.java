package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"slimani","slimani@gmail.com"));
			customerRepository.save(new Customer(null,"slimanya","slimanya@gmail.com"));
			customerRepository.save(new Customer(null,"laalaoui","laalaoui@gmail.com"));
			customerRepository.findAll().forEach(c->{System.out.println(c.toString());});
		};
	}
}
