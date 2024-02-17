package com.example.dao;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerDao {

	public List<Customer> findAll();
	
	public Customer findById(Integer id);
	
	public Customer save(Customer customer);
	
	public void deleteById(Integer id);
}
