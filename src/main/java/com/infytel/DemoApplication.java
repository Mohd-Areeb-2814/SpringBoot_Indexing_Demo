package com.infytel;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infytel.dto.CustomerDTO;

import com.infytel.service.CustomerService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static long time = System.currentTimeMillis();

	@Autowired
	CustomerService service;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		long time = System.currentTimeMillis();

		System.out.println("Application start time : " + time);

		Log logger = LogFactory.getLog(getClass());

//		CustomerDTO customer1 = new CustomerDTO(7022713754L, "Adam", 'M', 27, "Chicago", 1);
//
//		CustomerDTO customer2 = new CustomerDTO(7022713744L, "Susan", 'F', 27, "Alberta", 2);
//
//		CustomerDTO customer3 = new CustomerDTO(7022713722L, "Lucy", 'F', 27, "MUMBAI", 3);
//
//		service.insertCustomer(customer1);
//
//		service.insertCustomer(customer2);
//
//		service.insertCustomer(customer3);
//
//		System.out.println("Records added successfully.");

		logger.info("Let's print the details of a Customer");

		CustomerDTO customerDTO = service.findbyName("Adam");

		logger.info("Customer Details:");

		logger.info("Phone Number : " + customerDTO.getPhoneNumber());

		logger.info("Name : " + customerDTO.getName());

		logger.info("Age : " + customerDTO.getAge());

		logger.info("Gender : " + customerDTO.getGender());

		logger.info("Address : " + customerDTO.getAddress());

		logger.info("Plan ID : " + customerDTO.getPlanId());

		System.out.println("Application End Time : " + System.currentTimeMillis());

		System.out.println("Time Difference : " + (System.currentTimeMillis() - time));

	}

}
