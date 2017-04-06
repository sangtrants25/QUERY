package com.webapp.service;

import java.util.List;

import com.webapp.model.BaseModel;
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
	public List<String> ListProvinces(){
		return cusReposity.ListProvince();
	}
	public List<BaseModel> ListDistricts(String provinceID){
		return cusReposity.ListDistricts(provinceID);
	}
	public List<BaseModel> ListProvinces(String state){
		return cusReposity.ListProvinces(state);
	}
	public List<BaseModel> ListWard(String district){
		return cusReposity.ListWard(district);
	}
}
