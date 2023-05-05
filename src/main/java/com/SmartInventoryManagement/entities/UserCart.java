package com.SmartInventoryManagement.entities;

import java.lang.reflect.Array;
import java.util.LinkedList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private LinkedList<Integer> products;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LinkedList<Integer> getProducts() {
		return products;
	}
	public void setProducts(LinkedList<Integer> products) {
		this.products = products;
	}
	public UserCart(int id, String userName, LinkedList<Integer> products) {
		super();
		this.id = id;
		this.userName = userName;
		this.products = products;
	}
	public UserCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserCart [id=" + id + ", userName=" + userName + ", products=" + products + "]";
	}
	
	
	
	
	

}
