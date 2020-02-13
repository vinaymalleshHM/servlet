package com.tyss.inventorymanagement.dto;

import java.util.List;


public class ProductResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<ProductInfoBean> beans;
	private List<UserInfoBean> userInfoBeans;
	private List<CartInfoBean> cartInfoBeans;
	private List<OrderInfoBean> orderInfoBeans;
	

	
	
	public List<OrderInfoBean> getOrderInfoBeans() {
		return orderInfoBeans;
	}
	public void setOrderInfoBeans(List<OrderInfoBean> orderInfoBeans) {
		this.orderInfoBeans = orderInfoBeans;
	}
	public List<CartInfoBean> getCartInfoBeans() {
		return cartInfoBeans;
	}
	public void setCartInfoBeans(List<CartInfoBean> cartInfoBeans) {
		this.cartInfoBeans = cartInfoBeans;
	}
	public List<UserInfoBean> getUserInfoBeans() {
		return userInfoBeans;
	}
	public void setUserInfoBeans(List<UserInfoBean> userInfoBeans) {
		this.userInfoBeans = userInfoBeans;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<ProductInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<ProductInfoBean> beans) {
		this.beans = beans;
	}
	

}
