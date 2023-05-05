package com.SmartInventoryManagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class deliveries
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String godownid;
	private String itemname;
	private String invoiceNum;
	
	private LocalDate dateofsupply;
	private LocalDate dateofdelivery;
	
	private String suplier;
	
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGodownid() {
		return godownid;
	}

	public void setGodownid(String godownid) {
		this.godownid = godownid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public LocalDate getDateofsupply() {
		return dateofsupply;
	}

	public void setDateofsupply(LocalDate dateofsupply) {
		this.dateofsupply = dateofsupply;
	}

	public LocalDate getDateofdelivery() {
		return dateofdelivery;
	}

	public void setDateofdelivery(LocalDate dateofdelivery) {
		this.dateofdelivery = dateofdelivery;
	}

	public String getSuplier() {
		return suplier;
	}

	public void setSuplier(String suplier) {
		this.suplier = suplier;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public deliveries(int id, String godownid, String itemname, String invoiceNum, LocalDate dateofsupply,
			LocalDate dateofdelivery, String suplier, int quantity) {
		super();
		this.id = id;
		this.godownid = godownid;
		this.itemname = itemname;
		this.invoiceNum = invoiceNum;
		this.dateofsupply = dateofsupply;
		this.dateofdelivery = dateofdelivery;
		this.suplier = suplier;
		this.quantity = quantity;
	}

	public deliveries() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "deliveries [id=" + id + ", godownid=" + godownid + ", itemname=" + itemname + ", invoiceNum="
				+ invoiceNum + ", dateofsupply=" + dateofsupply + ", dateofdelivery=" + dateofdelivery + ", suplier="
				+ suplier + ", quantity=" + quantity + "]";
	}
	
	
	
}