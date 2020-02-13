package com.tyss.inventorymanagement.service;

import java.util.List;

import com.tyss.inventorymanagement.dto.CartInfoBean;
import com.tyss.inventorymanagement.dto.OrderInfoBean;
import com.tyss.inventorymanagement.dto.ProductInfoBean;
import com.tyss.inventorymanagement.dto.UserInfoBean;

public interface ProductService {
	UserInfoBean auth(String email, String password);
	boolean register(UserInfoBean userInfoBean);
	
	
	boolean addProduct(ProductInfoBean productInfoBean);
	boolean updateProduct(ProductInfoBean productInfoBean);
	boolean removeProduct(int id);
	List<ProductInfoBean> getProductByName(String name);
	List<ProductInfoBean> getAllProduct();
	
	
	boolean addCart(CartInfoBean cartInfoBean);
	boolean removeCart(int id);
	List<CartInfoBean> getCart(int id);
	List<CartInfoBean> getAllCart(CartInfoBean cartInfoBean);
	
	
	boolean addOrders(OrderInfoBean OrderInfoBean );
	public List<OrderInfoBean> getAllOrder(int id);
	
}
