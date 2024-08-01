package com.infytel.repository;

import org.springframework.data.repository.CrudRepository;

import com.infytel.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Customer findByName(String name);

}
