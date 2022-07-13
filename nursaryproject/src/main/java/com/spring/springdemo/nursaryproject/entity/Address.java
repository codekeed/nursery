package com.spring.springdemo.nursaryproject.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="addressId")
	private int addressId;

	
	@Column(name="houseNo")
	private String houseNo;
	
	@Column(name="colony")
	private String colony;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;
	
	

}
