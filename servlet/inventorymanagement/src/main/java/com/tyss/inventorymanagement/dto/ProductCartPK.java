package com.tyss.inventorymanagement.dto;

import javax.persistence.Embeddable;

@Embeddable
public class ProductCartPK {
	
	private int pId ;
	private int cId;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}

	
	
}
