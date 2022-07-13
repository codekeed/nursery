package com.spring.springdemo.nursaryproject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@ Entity
@Table(name="planter")
public class Planter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="planterId")
	private int planterId;
	
	@Column(name="planterHeight")
	private float planterHeight;
	
	@Column(name="planterCapacity")
	private int planterCapacity ;
	
	@Column(name="drainageHoles")
	private int drainageHoles ;
	
	@Column(name="planterColor")
	private String planterColor;
	
	@Column(name="planterShape")
	private String planterShape;
	
	@Column(name="planterStock")
	private int planterStock;
	
	@Column(name="planterCost")
	private int planterCost ;
	
	@OneToOne
	public Plant plant;
	
	@OneToOne
	private Seed seed;
	
	
}




