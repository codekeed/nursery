package com.spring.springdemo.nursaryproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name="plant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Plant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="plantId")
	private int plantId;

	
	@Column(name="commonName")
	private String commonName;
	
	@Column(name="plantHeight")
	private int plantHeight;
	
	@Column(name="plantSpread")
	private String plantSpread;
	
	@Column(name="bloomTime")
	private String bloomTime;
	
	@Column(name="temparature")
	private String temparature;
	
	@Column(name="medicinalOrCulinaryUse")
	private String medicinalOrCulinaryUse;
	
	@Column(name="plantDescription")
	private String plantDescription;
	
	@Column(name="difficultyLevel")
	private int difficultyLevel;
	
	@Column(name="typeOfPlant")
	private String typeOfPlant;
	
	@Column(name="plantStock")
	private int plantStock;
	
	@Column(name="plantCost")
	private double plantCost;

	
	
}
