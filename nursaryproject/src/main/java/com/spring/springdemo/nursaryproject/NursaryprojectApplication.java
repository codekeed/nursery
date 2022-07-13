package com.spring.springdemo.nursaryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;



@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Online Plant Nursery",version="1.0",description="An API used for Online Plant Nursery Application Implementation."))
public class NursaryprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NursaryprojectApplication.class, args);
	}

}
