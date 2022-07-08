package com.prueba2rickandmorty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "personaje")


public class Personaje {
	

		public Personaje(Long id, String name, String lastName, String age, String gender, String email) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column
		private String name;
		
		@Column
		private String lastName;
		
		@Column
		private String age;
		
		@Column
		private String gender;
		
		@Column
		private String email;
		
		
}
