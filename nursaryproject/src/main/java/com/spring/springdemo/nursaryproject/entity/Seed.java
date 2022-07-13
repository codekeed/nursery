package com.spring.springdemo.nursaryproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="seeds")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Seed {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seedId")
	private int seedId;

	
	@Column(name="commonName")
	private String commonName;
	
	@Column(name="bloomTime")
	private String bloomTime;
	
	@Column(name="watering")
	private String watering;
	
	@Column(name="difficultyLevel")
	private String difficultyLevel;
	
	@Column(name="temparature")
	private String temparature;
	
	@Column(name="typeOfSeeds")
	private String typeOfSeeds;
	
	@Column(name="seedsDescription")
	private String seedsDescription;
	
	@Column(name="seedsStock")
	private int seedsStock;
	
	@Column(name="seedsCost")
	private double seedsCost;
	
	@Column(name="seedsPerPacket")
	private int seedsPerPacket;

	

}
