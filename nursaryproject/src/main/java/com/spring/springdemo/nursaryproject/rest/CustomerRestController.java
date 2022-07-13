package com.spring.springdemo.nursaryproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springdemo.nursaryproject.entity.Customer;
import com.spring.springdemo.nursaryproject.service.CustomerService;

@RestController
public class CustomerRestController {
	private  CustomerService  customerService;

	@Autowired
	public CustomerRestController(CustomerService customerService) {
		this.customerService = customerService;
	}


	@GetMapping("/customer")
	public List<Customer> findAll() {
		return customerService.viewAllCustomer();
	}


	@GetMapping("/customer/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		
		Customer theCustomer = customerService.viewCustomer(customerId);
		
		if (theCustomer == null) {
			throw new RuntimeException("Customer id not found - " + customerId);
		}
		
		return theCustomer;
	}



	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer theCustomer) {
		
		theCustomer.setCustomerId(0);
		
		customerService.addCustomer(theCustomer);
		
		return theCustomer;
	}

	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
		
		customerService.updateCustomer(theCustomer);
		
		return theCustomer;
	}

	@DeleteMapping("/customer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		
		Customer tempCustomer= customerService.viewCustomer(customerId);
		
		// throw exception if null
		
		if (tempCustomer == null) {
			throw new RuntimeException("Planter id not found - " + customerId);
		}
		
		customerService.deleteCustomer (customerId);
		
		return "Deleted Planter id - " + customerId;
	   }
}
