package com.spring.springdemo.nursaryproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.entity.Plant;

@Service
public interface PlantService {
	
		public List<Plant> viewAllPlant();
		
		public Plant viewPlant(int theId);
			
		public void addPlant(Plant thePlant);
		  
	    public void updatePlant(Plant thePlant);
			
		public void deletePlant(int theId);
		  

}

