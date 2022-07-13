package com.spring.springdemo.nursaryproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springdemo.nursaryproject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {



}
