package com.spring.springdemo.nursaryproject.dao;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springdemo.nursaryproject.entity.Seed;

public interface SeedRepository extends JpaRepository<Seed , Integer> {

}
