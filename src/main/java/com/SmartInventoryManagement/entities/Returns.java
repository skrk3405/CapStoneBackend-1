package com.SmartInventoryManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Returns {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productName;
	private String godownId;
	private String condition;
	private int quantity;
	private String returnedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getGodownId() {
		return godownId;
	}
	public void setGodownId(String godownId) {
		this.godownId = godownId;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getReturnedBy() {
		return returnedBy;
	}
	public void setReturnedBy(String returnedBy) {
		this.returnedBy = returnedBy;
	}
	public Returns(int id, String productName, String godownId, String condition, int quantity, String returnedBy) {
		super();
		this.id = id;
		this.productName = productName;
		this.godownId = godownId;
		this.condition = condition;
		this.quantity = quantity;
		this.returnedBy = returnedBy;
	}
	public Returns() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Returns [id=" + id + ", productName=" + productName + ", godownId=" + godownId + ", condition="
				+ condition + ", quantity=" + quantity + ", returnedBy=" + returnedBy + "]";
	}
	
	

}
