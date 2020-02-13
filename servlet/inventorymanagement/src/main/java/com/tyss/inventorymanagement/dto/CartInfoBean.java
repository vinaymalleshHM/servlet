package com.tyss.inventorymanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_info_bean")
public class CartInfoBean {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int cId;
	
//	@EmbeddedId
//	private ProductCartPK cartPK;
//	
	@Column
	private int quantity;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uId")
	private UserInfoBean userInfoBean;
	
	
	@OneToMany(mappedBy = "cartInfoBeans",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="pId")
	private List<ProductInfoBean> productInfoBeans;

	
	
	
	
	
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public UserInfoBean getUserInfoBean() {
		return userInfoBean;
	}

	public void setUserInfoBean(UserInfoBean userInfoBean) {
		this.userInfoBean = userInfoBean;
	}

	public List<ProductInfoBean> getProductInfoBeans() {
		return productInfoBeans;
	}

	public void setProductInfoBeans(List<ProductInfoBean> productInfoBeans) {
		this.productInfoBeans = productInfoBeans;
	}
	
	

	
	
}
