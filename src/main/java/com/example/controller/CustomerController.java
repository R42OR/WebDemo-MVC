package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/get-all-customers")
	public ModelAndView getAllCustomer() {
		List<Customer> customer = customerService.findAll();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("customer", customer);
		
		mav.setViewName("customer-home");
		
		return mav;
	}
}
