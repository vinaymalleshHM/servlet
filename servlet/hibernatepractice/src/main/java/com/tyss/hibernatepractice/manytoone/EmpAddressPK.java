package com.tyss.hibernatepractice.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmpAddressPK implements Serializable{

	private int emp_id ;
	private String addr_type;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getAddr_type() {
		return addr_type;
	}
	public void setAddr_type(String addr_type) {
		this.addr_type = addr_type;
	}
	
}
