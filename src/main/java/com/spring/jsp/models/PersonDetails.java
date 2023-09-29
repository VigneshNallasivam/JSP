package com.spring.jsp.models;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="person_details")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "gender")
	private String gender; 

	@Column(name = "age")
	private int age;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "email")
	private String email;

	@Column(name = "place")
	private String place; 
}
