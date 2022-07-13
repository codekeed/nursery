package com.spring.springdemo.nursaryproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springdemo.nursaryproject.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
