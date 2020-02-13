package com.tyss.inventorymanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="order_info")
public class OrderInfoBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int oId;
	@Column
	private Double totalPrice;
	@Column
	private double totalPriceWithGST;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uId")
	private UserInfoBean userInfoBeans;
	
	@OneToMany(mappedBy = "orderInfoBeans",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<ProductInfoBean> productInfoBeans;

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPriceWithGST() {
		return totalPriceWithGST;
	}

	public void setTotalPriceWithGST(double totalPriceWithGST) {
		this.totalPriceWithGST = totalPriceWithGST;
	}

	public List<ProductInfoBean> getProductInfoBeans() {
		return productInfoBeans;
	}

	public void setProductInfoBeans(List<ProductInfoBean> productInfoBeans) {
		this.productInfoBeans = productInfoBeans;
	}

//	public UserInfoBean getUserInfoBeans() {
//		return userInfoBeans;
//	}
//
//	public void setUserInfoBeans(UserInfoBean userInfoBeans) {
//		this.userInfoBeans = userInfoBeans;
//	}

	
	
	
	
}
