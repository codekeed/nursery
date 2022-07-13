package com.spring.springdemo.nursaryproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springdemo.nursaryproject.entity.Seed;
import com.spring.springdemo.nursaryproject.service.SeedService;

@RestController
public class SeedRestController {
	private SeedService seedService;

	@Autowired
	public SeedRestController(SeedService seedService) {
		this.seedService =seedService;
	}


	@GetMapping("/seed")
	public List<Seed> findAll() {
		return seedService.viewAllSeed();
	}


	@GetMapping("/seed/{seedId}")
	public Seed getSeed(@PathVariable int seedId) {
		
		Seed theSeed = seedService.viewSeed(seedId);
		
		if (theSeed == null) {
			throw new RuntimeException("Seed id not found - " + seedId);
		}
		
		return theSeed;
	}



	@PostMapping("/seed")
	public Seed addSeed(@RequestBody Seed theSeed) {
		
		theSeed.setSeedId(0);
		
		seedService.addSeed(theSeed);
		
		return theSeed;
	}

	@PutMapping("/seed")
	public Seed updateSeed(@RequestBody Seed theSeed) {
		
		seedService.updateSeed(theSeed);
		
		return theSeed;
	}

	@DeleteMapping("/seed/{seedId}")
	public String deleteSeed(@PathVariable int seedId) {
		
		Seed tempSeed =seedService.viewSeed(seedId);
		
		// throw exception if null
		
		if (tempSeed == null) {
			throw new RuntimeException("Seed id not found - " + seedId);
		}
		
		seedService.deleteSeed(seedId);
		
		return "Deleted Seed id - " + seedId;
	   }

}
