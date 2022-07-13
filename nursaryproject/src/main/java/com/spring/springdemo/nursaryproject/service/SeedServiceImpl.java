package com.spring.springdemo.nursaryproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdemo.nursaryproject.dao.SeedRepository;
import com.spring.springdemo.nursaryproject.entity.Plant;
import com.spring.springdemo.nursaryproject.entity.Seed;

@Service
public class SeedServiceImpl implements SeedService {

	private SeedRepository seedRepository;

	@Autowired
	public SeedServiceImpl(SeedRepository seedRepository) {
		this.seedRepository = seedRepository;
	}

	@Override
	public List<Seed> viewAllSeed() {
		return seedRepository.findAll();
	}


	@Override
	public Seed viewSeed(int theId) {
		Optional<Seed> result = seedRepository.findById(theId);

		Seed theSeed = null;

		if (result.isPresent()) {
			theSeed = result.get();
		} else {
			// we didn't find the seed
			throw new RuntimeException("Did not find Seed id - " + theId);
		}

		return theSeed;
	}

	@Override
	public void addSeed(Seed theSeed) {
		seedRepository.save(theSeed);
	}
	
	@Override
	public void updateSeed(Seed theSeed) {
		seedRepository.save(theSeed);
	}
	

	@Override
	public void deleteSeed(int theId) {
		seedRepository.deleteById(theId);
		
	}
	
}