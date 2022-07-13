package com.spring.springdemo.nursaryproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Admin {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="adminId")
 private int adminId;


 @Column(name="adminUsername")
 private String adminUsername;

 @Column(name="adminPassword")
 private String adminPassword;


}
