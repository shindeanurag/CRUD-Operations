package com.crud.Springboot_Crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stud_id;
	private String stud_name;
	private String stud_city;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_city() {
		return stud_city;
	}
	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}
	public CStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CStudent(int stud_id, String stud_name, String stud_city) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_city = stud_city;
	}
	@Override
	public String toString() {
		return "CStudent [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_city=" + stud_city + "]";
	}
	
	
}
