package com.tyss.inventorymanagement.dto;

import javax.persistence.Column;

public class ProperResponse {
	private int uId;
	private String name;
	private String email;
	private String password;
	private long mobile;
//	public ProperResponse(int uId, String name, String email, String password, long mobile) {
//		super();
//		this.uId = uId;
//		this.name = name;
//		this.email = email;
//		this.password = password;
//		this.mobile = mobile;
//	}
	
	private int pId;
//	private String pName;
	private String catagoery;
	private String company;
	private int quantity;
	private double price;
	private String url;
//	public ProperResponse(int pId, String pName, String catagoery, String company, int quantity, double price,
//			String url) {
//		super();
//		this.pId = pId;
//		this.pName = pName;
//		this.catagoery = catagoery;
//		this.company = company;
//		this.quantity = quantity;
//		this.price = price;
//		this.url = url;
//	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getCatagoery() {
		return catagoery;
	}
	public void setCatagoery(String catagoery) {
		this.catagoery = catagoery;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
