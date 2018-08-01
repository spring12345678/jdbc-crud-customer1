package com.spring.model;
public class Customer {
	private int id;
	private String name;
	private String email;
	private String ccemail;
	private int phone;
	public Customer(int i, String string, String string2, String string3, int j) {
		this.id=i;
		this.name=string;
		this.email=string2;
		this.ccemail=string3;
		this.phone=j;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCcemail() {
		return ccemail;
	}
	public void setCcemail(String ccemail) {
		this.ccemail = ccemail;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
