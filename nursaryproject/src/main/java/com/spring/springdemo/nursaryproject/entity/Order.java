package com.spring.springdemo.nursaryproject.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookingOrderId")
	private int bookingOrderId;

	
	@Column(name="orderDate")
	private LocalDate orderDate;
	
	@Column(name="transactionMode")
	private String transactionMode;

    @Column(name="quantity")
	private int quantity;

	
	@Column(name="totalCost")
	private double totalCost;
	
	@OneToOne
	private Customer customer;
	
   @OneToOne
   private Planter planter;
}
