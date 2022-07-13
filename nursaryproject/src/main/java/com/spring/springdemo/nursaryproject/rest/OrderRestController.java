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

import com.spring.springdemo.nursaryproject.entity.Order;
import com.spring.springdemo.nursaryproject.service.OrderService;

	@RestController
	public class OrderRestController {
	private OrderService orderService;
	
	@Autowired
	public OrderRestController(OrderService orderService) {
	this.orderService = orderService;
	}
	
	
	@GetMapping("/order")
	public List<Order> findAll() {
	return orderService.viewAllOrder();
	}
	
	
	@GetMapping("/order/{orderId}")
	public Order getOrder(@PathVariable int orderId) {
	
	Order theOrder = orderService.viewOrder(orderId);
	
	if (theOrder == null) {
	throw new RuntimeException("Order id not found - " + orderId);
	}
	
	return theOrder;
	}
	
	
	
	@PostMapping("/order")
	public Order addOrder(@RequestBody Order theOrder) {
	
	theOrder.setBookingOrderId(0);
	
	orderService.addOrder(theOrder);
	
	return theOrder;
	}
	
	@PutMapping("/order")
	public Order updateOrder(@RequestBody Order theOrder) {
	
	orderService.updateOrder(theOrder);
	
	return theOrder;
	}
	
	@DeleteMapping("/order/{orderId}")
	public String deleteOrder(@PathVariable int orderId) {
	
	Order tempOrder = orderService.viewOrder(orderId);
	
	// throw exception if null
	
	if (tempOrder == null) {
	throw new RuntimeException("Order id not found - " + orderId);
	}
	
	orderService.deleteOrder(orderId);
	
	return "Deleted Order id - " + orderId;
	  }
	}