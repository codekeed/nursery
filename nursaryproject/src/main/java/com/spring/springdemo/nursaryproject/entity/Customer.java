package com.spring.springdemo.nursaryproject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;



@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode




	public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="customerId")
		private int customerId;

		
		@Column(name="customerName")
		private String customerName;
		
		@Column(name="customerEmail")
		private String customerEmail;
		
		@Column(name="userName")
		private String userName;
		
		@Column(name="password")
		private String password;
		
		@OneToOne
		private Address  address;
		


	}

