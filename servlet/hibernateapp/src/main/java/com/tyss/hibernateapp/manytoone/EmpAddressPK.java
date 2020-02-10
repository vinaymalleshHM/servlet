package com.tyss.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

//@Data
@Embeddable
public class EmpAddressPK implements Serializable {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr_type == null) ? 0 : addr_type.hashCode());
		result = prime * result + emp_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpAddressPK other = (EmpAddressPK) obj;
		if (addr_type == null) {
			if (other.addr_type != null)
				return false;
		} else if (!addr_type.equals(other.addr_type))
			return false;
		if (emp_id != other.emp_id)
			return false;
		return true;
	}
	
}
