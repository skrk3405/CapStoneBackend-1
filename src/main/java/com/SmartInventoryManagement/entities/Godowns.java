package com.SmartInventoryManagement.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="godowns")
public class Godowns {
	@Id
	@Column(name="godown_id")
	private int godownid;
	@Column(name="location")
	String godownlocation;
	@Column(name="manager")
	private String godownmanager;
	@Column(name="capacity")
	private Long godownItemsCount;
	//private BigInteger image;
	@Column(name=" start_date")
	private LocalDateTime startDate;
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public int getGodownid() {
		return godownid;
	}
	public void setGodownid(int godownid) {
		this.godownid = godownid;
	}
	public String getGodownlocation() {
		return godownlocation;
	}
	public void setGodownlocation(String godownlocation) {
		this.godownlocation = godownlocation;
	}
	public String getGodownmanager() {
		return godownmanager;
	}
	public void setGodownmanager(String godownmanager) {
		this.godownmanager = godownmanager;
	}
	public Long getGodownItemsCount() {
		return godownItemsCount;
	}
	public void setGodownItemsCount(Long godownItemsCount) {
		this.godownItemsCount = godownItemsCount;
	}
	

	public Godowns(int godownid, String godownlocation, String godownmanager, Long godownItemsCount, LocalDateTime startDate) {
		super();
		this.godownid = godownid;
		this.godownlocation = godownlocation;
		this.godownmanager = godownmanager;
		this.godownItemsCount = godownItemsCount;
		this.startDate = startDate;
	}
	public Godowns() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}