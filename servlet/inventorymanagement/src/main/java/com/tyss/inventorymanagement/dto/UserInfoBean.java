package com.tyss.inventorymanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_info_bean")
public class UserInfoBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uId;
	@Column
	private String uName;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	@Column
	private long mobile;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "userInfoBeans")
	private List<ProductInfoBean> productInfoBeans;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userInfoBeans")
	private List< OrderInfoBean> orderInfoBeans;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "userInfoBean")
	private CartInfoBean cartInfoBean;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
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

	public List<ProductInfoBean> getProductInfoBeans() {
		return productInfoBeans;
	}

	public void setProductInfoBeans(List<ProductInfoBean> productInfoBeans) {
		this.productInfoBeans = productInfoBeans;
	}

//	public List<OrderInfoBean> getOrderInfoBeans() {
//		return orderInfoBeans;
//	}
//
//	public void setOrderInfoBeans(List<OrderInfoBean> orderInfoBeans) {
//		this.orderInfoBeans = orderInfoBeans;
//	}

	public CartInfoBean getCartInfoBean() {
		return cartInfoBean;
	}

	public void setCartInfoBean(CartInfoBean cartInfoBean) {
		this.cartInfoBean = cartInfoBean;
	}
	
	
	
	
	
}
