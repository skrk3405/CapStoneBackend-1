package com.SmartInventoryManagement.entities;



import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String password;
	private String username;
	private String Email;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public UserDetails(int userid, String password, String username,String Email) {
		super();
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.Email = Email;
		
	}
	public UserDetails() {
		super();
	}
	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", password=" + password + ", username=" + username + ", Email="
				+ Email + "]";
	}
	
}
	
	
