package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.dao.OrderRepository;
import com.spring.springdemo.nursaryproject.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

private OrderRepository orderRepository;

@Autowired
public OrderServiceImpl(OrderRepository orderRepository) {
this.orderRepository = orderRepository;
}

@Override
public List<Order> viewAllOrder() {
return orderRepository.findAll();
}

@Override
public Order viewOrder(int theId) {
Optional<Order> result = orderRepository.findById(null);

Order theOrder = null;

if (result.isPresent()) {
theOrder = result.get();
} else {
// we didn't find the order
throw new RuntimeException("Did not find Order id - " + theId);
}

return theOrder;
}


@Override
public void addOrder(Order theOrder) {
orderRepository.save(theOrder);
}

@Override
public void updateOrder(Order theOrder) {
orderRepository.save(theOrder);
}


@Override
public void deleteOrder(int theId) {
orderRepository.deleteById(theId);
}

}