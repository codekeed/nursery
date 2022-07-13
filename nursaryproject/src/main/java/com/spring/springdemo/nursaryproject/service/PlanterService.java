package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.entity.Planter;


	@Service
	public interface PlanterService {
		  public List<Planter> viewAllPlanters();
		  
          public Planter viewPlanter(int planterId);
		 
          public void addPlanter(Planter planter);
		  
	      public void updatePlanter(Planter planter);
			
		  public void deletePlanter(int planterId);
	}	  
		  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	      public Planter deletePlanter(Planter planter);
	//public Planter viewPlanterShape(String planterShape);
	
//	  public List<Planter> viewAllPlanters(double minCost, double maxCost);
	
	      

	
	
	
	
	
	
	
	
	
	
	//	      public Optional<Planter> findByShape(String theShape);

//		Planter viewPlanter(String theShape);
	      
	      

