package com.spring.springdemo.nursaryproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.entity.Order;


	@Service
	public interface OrderService {
		  public List<Order> viewAllOrder();
			
		  public Order viewOrder(int theId);
			
		  public void addOrder(Order thePlant);
		  
	      public void updateOrder(Order thePlant);
			
		  public void deleteOrder(int theId);
	}
