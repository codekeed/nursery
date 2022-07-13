package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.dao.PlantRepository;
import com.spring.springdemo.nursaryproject.entity.Plant;

@Service
public class PlantServiceImpl implements PlantService {

	private PlantRepository PlantRepository;

	@Autowired
	public PlantServiceImpl(PlantRepository PlantRepository) {
		this.PlantRepository = PlantRepository;
	}

	@Override
	public List<Plant> viewAllPlant() {
		return PlantRepository.findAll();
	}

	@Override
	public Plant viewPlant(int theId) {
		Optional<Plant> result = PlantRepository.findById(theId);

		Plant thePlant = null;

		if (result.isPresent()) {
			thePlant = result.get();
		} else {
			
			throw new RuntimeException("Did not find Plant id - " + theId);
		}

		return thePlant;
	}
	
	
	@Override
	public void addPlant(Plant thePlant) {
		PlantRepository.save(thePlant);
	}
	
	@Override
	public void updatePlant(Plant thePlant) {
		PlantRepository.save(thePlant);
	}
	

	@Override
	public void deletePlant(int theId) {
		PlantRepository.deleteById(theId);
	}
	
	

}