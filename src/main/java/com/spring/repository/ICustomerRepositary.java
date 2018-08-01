package com.spring.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.model.Customer;
@Component
public interface ICustomerRepositary {
	public List<Customer> findAll();

	public int update(Customer cost);

	public Customer findbyId(int id);

	public int insert(Customer cost);

}
