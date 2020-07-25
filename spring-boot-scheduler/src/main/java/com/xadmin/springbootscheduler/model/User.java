package com.xadmin.springbootscheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {
	
	@javax.persistence.Id
	@GeneratedValue
	private Integer Id;
	private String name;
	public User(Integer id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public User() {
		
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
