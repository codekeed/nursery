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

import com.spring.springdemo.nursaryproject.entity.Plant;
import com.spring.springdemo.nursaryproject.service.PlantService;

@RestController
public class PlantRestController {
	private PlantService plantService;

	@Autowired
	public PlantRestController(PlantService plantService) {
		this.plantService = plantService;
	}


	@GetMapping("/plant")
	public List<Plant> findAll() {
		return plantService.viewAllPlant();
	}


	@GetMapping("/plant/{plantId}")
	public Plant getPlant(@PathVariable int PlantId) {
		
		Plant thePlant = plantService.viewPlant(PlantId);
		
		if (thePlant == null) {
			throw new RuntimeException("Plant id not found - " + PlantId);
		}
		
		return thePlant;
	}



	@PostMapping("/plant")
	public Plant addPlant(@RequestBody Plant thePlant) {
		
		thePlant.setPlantId(0);
		
		plantService.addPlant(thePlant);
		
		return thePlant;
	}

	@PutMapping("/plant")
	public Plant updatePlant(@RequestBody Plant thePlant) {
		
		plantService.updatePlant(thePlant);
		
		return thePlant;
	}

	@DeleteMapping("/plant/{plantId}")
	public String deletePlant(@PathVariable int PlantId) {
		
		Plant tempPlant = plantService.viewPlant(PlantId);
		
		// throw exception if null
		
		if (tempPlant == null) {
			throw new RuntimeException("Plant id not found - " + PlantId);
		}
		
		plantService.deletePlant(PlantId);
		
		return "Deleted Plant id - " + PlantId;
	   }
	
}