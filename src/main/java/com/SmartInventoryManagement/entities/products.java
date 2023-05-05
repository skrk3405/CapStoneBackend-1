package com.SmartInventoryManagement.entities;

import java.util.LinkedList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String availCount;
	private LinkedList<String> inGodowns;
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
	public String getAvailCount() {
		return availCount;
	}
	public void setAvailCount(String availCount) {
		this.availCount = availCount;
	}
	public LinkedList<String> getInGodowns() {
		return inGodowns;
	}
	public void setInGodowns(LinkedList<String> inGodowns) {
		this.inGodowns = inGodowns;
	}
	public products(int id, String name, String availCount, LinkedList<String> inGodowns) {
		super();
		this.id = id;
		this.name = name;
		this.availCount = availCount;
		this.inGodowns = inGodowns;
	}
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", availCount=" + availCount + ", inGodowns=" + inGodowns + "]";
	}
	
	
	

}
