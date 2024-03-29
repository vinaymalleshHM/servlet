package com.tyss.hibernatepractice.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

@Entity
@Table(name="Emp_Address_Info")
public class EmpAddressInfo {

	@EmbeddedId
	private EmpAddressPK addressPK;

	@Column(name="house_no")
	private int houseNo;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	@Column(name="landmark")
	private String landMark;

	@Column
	private String city;

	@Column
	private int pincode;

	@MapsId("emp_id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmpPrimaryInfo empPrimaryInfo;




	public EmpAddressPK getAddressPK() {
		return addressPK;
	}
	public void setAddressPK(EmpAddressPK addressPK) {
		this.addressPK = addressPK;
	}
	public EmpPrimaryInfo getEmpPrimaryInfo() {
		return empPrimaryInfo;
	}
	public void setEmpPrimaryInfo(EmpPrimaryInfo empPrimaryInfo) {
		this.empPrimaryInfo = empPrimaryInfo;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
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
