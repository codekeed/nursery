package com.spring.springdemo.nursaryproject.dao;



// java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springdemo.nursaryproject.entity.Planter;

public interface PlanterRepository extends JpaRepository<Planter, Integer> {

	
	}






















//
////Optional<Planter> findByShape(String theShape);
//public Optional<Planter> findByShape(String theShape);