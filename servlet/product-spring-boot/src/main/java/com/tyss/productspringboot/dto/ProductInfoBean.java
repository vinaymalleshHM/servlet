package com.tyss.productspringboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class ProductInfoBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String pName;
	@Column
	private double price;
	@Column
	private int qty;
	@Column
	private String description;
	@Column
	private String proImg;
	@Column
	private String medicineType;
	@Column
	private String compony;
	
	
	
	public String getCompony() {
		return compony;
	}
	public void setCompony(String compony) {
		this.compony = compony;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProImg() {
		return proImg;
	}
	public void setProImg(String proImg) {
		this.proImg = proImg;
	}
	public String getMedicineType() {
		return medicineType;
	}
	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}
	
	
	
	

}
