package com.SmartInventoryManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String employeeid;
	private String employeename;
	private String designation;
	private String department;
	private String location;
	public EmployeeEntity(int id, String employeeid, String employeename, String designation, String department,
			String location) {
		super();
		this.id = id;
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.designation = designation;
		this.department = department;
		this.location = location;
	}
	public EmployeeEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", employeeid=" + employeeid + ", employeename=" + employeename
				+ ", designation=" + designation + ", department=" + department + ", location=" + location + "]";
	}
}
	
	
	