package com.spring.springdemo.nursaryproject.dao;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springdemo.nursaryproject.entity.Plant;

public interface PlantRepository extends JpaRepository<Plant, Integer> {


}
