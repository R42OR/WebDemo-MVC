package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService {
	
	
	public List<Customer> findAll();
	
	public Customer findById(Integer id);
	
	public Customer save(Customer customer);
	
	public void deleteById(Integer id);

}
