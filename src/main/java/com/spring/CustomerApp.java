package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.model.Customer;
import com.spring.repository.ICustomerRepositary;

@SpringBootApplication
public class CustomerApp implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ICustomerRepositary repositary;

	public static void main(String[] args) {
	
		SpringApplication.run(CustomerApp.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Customer id 1 -> {}", repositary.findbyId(1));

		logger.info("Inserting -> {}",
				repositary.insert(new Customer(3, "simu", "S@gmail.com", "m@gmail.com", 789056789)));

		logger.info("Update 2 -> {}",
				repositary.update(new Customer(2, "Mami", "M@gmail.com", "m@gmail.com", 909087654)));

		logger.info("All users -> {}", repositary.findAll());

	}
}
