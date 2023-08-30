package com.tut;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String phone;
	private String city;

	

	public Student(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " id = "+ this.id + 
				"\n name = " + this.name + 
				"\n phone = " + this.phone +
				"\n city "+ this.city;
	}
}
