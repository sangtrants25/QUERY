package com.webapp.service;

import java.util.List;

import com.webapp.model.Customer;
import com.webapp.repository.CustomerRepository;

public class CustomerService {
	private CustomerRepository cusReposity;
	public CustomerService(){
		cusReposity = new CustomerRepository();
	}
	public boolean create(Customer cus){
		return cusReposity.create(cus);
	}
	public List<Customer> listAll(){
		return cusReposity.listAll();
	}
}
