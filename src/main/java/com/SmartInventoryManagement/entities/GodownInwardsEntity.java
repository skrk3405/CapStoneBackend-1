package com.SmartInventoryManagement.entities;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class GodownInwardsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String godownid;
	private String itemname;
	private LocalDate dateofsupply;
	//private LocalDate dateofdelivery;
	private int productId;
	private String invoiceno;
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
	public LocalDate getDateofsupply() {
		return dateofsupply;
	}
	public void setDateofsupply(LocalDate dateofsupply) {
		this.dateofsupply = dateofsupply;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
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
	public GodownInwardsEntity(int id, String godownid, String itemname, LocalDate dateofsupply, int productId,
			String invoiceno, String suplier, int quantity) {
		super();
		this.id = id;
		this.godownid = godownid;
		this.itemname = itemname;
		this.dateofsupply = dateofsupply;
		this.productId = productId;
		this.invoiceno = invoiceno;
		this.suplier = suplier;
		this.quantity = quantity;
	}
	public GodownInwardsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GodownInwardsEntity [id=" + id + ", godownid=" + godownid + ", itemname=" + itemname + ", dateofsupply="
				+ dateofsupply + ", productId=" + productId + ", invoiceno=" + invoiceno + ", suplier=" + suplier
				+ ", quantity=" + quantity + "]";
	}
	
	
}