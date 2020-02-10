package com.tyss.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.tyss.hibernate.dto.Emp_Primary_Info;

import lombok.Data;
//@Data
@Entity
@Table(name="Emp_Address_Info")
public class Emp_Address_Info implements Serializable {
	@EmbeddedId
	private EmpAddressPK addressPK;
	@Column
	private int house_no;
	@Column
	private String address_1;
	@Column
	private String address_2;
	@Column
	private String landmark;
	@Column
	private String city;
	@Column
	private int pincode;
	//@Exclude // when ur using to @data to over come of stack over flow
	@MapsId("emp_id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Emp_Primary_Info primary;
	
	
	public Emp_Primary_Info getPrimary() {
		return primary;
	}
	public void setPrimary(Emp_Primary_Info primary) {
		this.primary = primary;
	}
	public EmpAddressPK getAddressPK() {
		return addressPK;
	}
	public void setAddressPK(EmpAddressPK addressPK) {
		this.addressPK = addressPK;
	}
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
