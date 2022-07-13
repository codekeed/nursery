package com.spring.springdemo.nursaryproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springdemo.nursaryproject.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
