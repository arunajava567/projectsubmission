package com.revature.pdfreport.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.pdfreport.model.Customer;


 
public interface CustomerRepository extends CrudRepository<Customer, Long>{}