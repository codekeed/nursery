package com.spring.springdemo.nursaryproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.entity.Seed;

@Service
public interface SeedService
{
	  public List<Seed> viewAllSeed();
		
	  public Seed viewSeed(int theId);
	  
      public void addSeed(Seed thePlant);
	  
      public void updateSeed(Seed thePlant);
		
	  public void deleteSeed(int theId);
	  
}
