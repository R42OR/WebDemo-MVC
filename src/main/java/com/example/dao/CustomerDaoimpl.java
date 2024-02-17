package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
@Repository
public class CustomerDaoimpl implements CustomerDao{
	
	Map<Integer, Customer> custMap;
	
	public CustomerDaoimpl() {
		custMap = new HashMap<>();
		custMap.put(1,  new Customer(1, "C1", "c1@gmail.com", 21));
		custMap.put(2,  new Customer(2, "C2", "c2@gmail.com", 22));
		custMap.put(3,  new Customer(3, "C3", "c3@gmail.com", 23));
		custMap.put(4,  new Customer(4, "C4", "c4@gmail.com", 24));
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Set<Integer> keySet = custMap.keySet();
		
		for(Integer key : keySet) {
			Customer customer = custMap.get(key);
			customers.add(customer);
			
		}
		return customers;
	}

	@Override
	public Customer findById(Integer id) {
		Customer customer = custMap.get(id);
		
		return customer;
	}

	@Override
	public Customer save(Customer customer) {
		Integer id = customer.getId();
		
		Customer customer2 = custMap.put(id, customer);
		
		return customer2;
	}

	@Override
	public void deleteById(Integer id) {
		custMap.remove(id);		
	}
	
	

}
