package com.amit.ntiersboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NtierSbootApplication {



	/** this is very bad,  instead define bean or components
	 * CustomerService customerService = new CustomerService(new CustomerDao());
	   CustomerController customerController = new CustomerController(customerService)*/;

	public static void main(String[] args) {
		SpringApplication.run(NtierSbootApplication.class, args);
	}

}
