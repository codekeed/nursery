package com.spring.springdemo.nursaryproject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.springdemo.nursaryproject.entity.Planter;

import com.spring.springdemo.nursaryproject.service.PlanterService;


@RestController
public class PlanterRestController {
	private PlanterService planterService;

	@Autowired
	public PlanterRestController(PlanterService planterService) {
		this.planterService = planterService;
	}


	@GetMapping("/planter")
	public List<Planter> viewAllPlanters() {
		return planterService.viewAllPlanters();
	}


	@GetMapping("/planter/{planterId}")
	public Planter getPlanter(@PathVariable int planterId) {
		
		Planter thePlanter = planterService.viewPlanter(planterId);
		
		if (thePlanter == null) {
			throw new RuntimeException("Planter id not found - " + planterId);
		}
		
		return thePlanter;
	}

	@PostMapping("/planter")
	public Planter addPlanter(@RequestBody Planter planter) {
		
		planter.setPlanterId(0);
		
		planterService.addPlanter(planter);
		
		return planter;
	}

	@PutMapping("/planter")
	public Planter updatePlanter(@RequestBody Planter planter) {
		
		planterService.updatePlanter(planter);
		
		return planter;
	}
	
	@DeleteMapping("/planter/{planterId}")
	public String deletePlanter(@PathVariable int planterId) {
		
		Planter tempPlanter = planterService.viewPlanter(planterId);
		
		// throw exception if null
		
		if (tempPlanter == null) {
			throw new RuntimeException("Planter id not found - " + planterId);
		}
		
		planterService.deletePlanter(planterId);
		
		return "Deleted Planter id - " + planterId;
		
	   }
	
}


		

	





