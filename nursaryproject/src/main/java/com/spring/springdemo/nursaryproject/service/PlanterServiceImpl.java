package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.springdemo.nursaryproject.dao.PlanterRepository;
import com.spring.springdemo.nursaryproject.entity.Planter;

@Service
public class PlanterServiceImpl implements PlanterService {

	private PlanterRepository planterRepository;

	@Autowired
	public PlanterServiceImpl(PlanterRepository planterRepository) {
		this.planterRepository = planterRepository;
	}
	
	@Override
	public List<Planter> viewAllPlanters() {
		return planterRepository.findAll();
	}
	
	@Override
	public Planter viewPlanter(int planterId) {
		Optional<Planter> result = planterRepository.findById(planterId);
	
		Planter thePlanter = null;
	
		if (result.isPresent()) {
			thePlanter = result.get();
		} else {
			
			throw new RuntimeException("Did not find Planter id - " + planterId);
		}
	
		return thePlanter;
	}
	

   @Override
	public void addPlanter(Planter planter) {
		planterRepository.save(planter);
	}
	
	@Override
	public void updatePlanter(Planter thePlanter) {
		planterRepository.save(thePlanter);
	}
	
	@Override
	public void deletePlanter(int planterId) {
		planterRepository.deleteById(planterId);
	}

}



















