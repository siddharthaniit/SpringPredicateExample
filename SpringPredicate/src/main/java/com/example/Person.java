package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	 private String name;
	 
	 private String surname;
	 
	 private String city;
	 
	 private Integer age;
	 
	 private long startDate;
	 
	 private long startDate1;
	 
	 

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public long getStartDate() {
		return startDate;
	}

	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}

	public long getStartDate1() {
		return startDate1;
	}

	public void setStartDate1(long startDate1) {
		this.startDate1 = startDate1;
	}



	 

}
