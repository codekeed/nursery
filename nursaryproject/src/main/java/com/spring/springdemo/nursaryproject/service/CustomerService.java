package com.spring.springdemo.nursaryproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.entity.Customer;
@Service
public interface CustomerService {
	public List<Customer> viewAllCustomer();
		
	  public Customer viewCustomer(int theId);
		
	  public void addCustomer(Customer theCustomer);
	  
      public void updateCustomer(Customer theCustomer);
		
	  public void deleteCustomer(int theId);
	

}
