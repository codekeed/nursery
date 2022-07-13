package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.dao.CustomerRepository;
import com.spring.springdemo.nursaryproject.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer viewCustomer(int theId) {
		Optional<Customer> result = customerRepository.findById(theId);

		Customer theCustomer = null;

		if (result.isPresent()) {
			theCustomer = result.get();
		} else {
			throw new RuntimeException("Did not find Customer id - " + theId);
		}

		return theCustomer;
	}
	

	@Override
	public void addCustomer(Customer theCustomer) {
		customerRepository.save(theCustomer);
	}
	
	@Override
	public void updateCustomer(Customer theCustomer) {
		customerRepository.save(theCustomer);
	}

	@Override
	public void deleteCustomer(int theId) {
		customerRepository.deleteById(theId);
	}

	
	
}