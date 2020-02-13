package com.tyss.inventorymanagement.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.inventorymanagement.dao.InventoryManagementDAO;
import com.tyss.inventorymanagement.dto.CartInfoBean;
import com.tyss.inventorymanagement.dto.OrderInfoBean;
import com.tyss.inventorymanagement.dto.ProductInfoBean;
import com.tyss.inventorymanagement.dto.UserInfoBean;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private InventoryManagementDAO dao; 

	final Pattern validEmail = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
	
	final Pattern validName = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
	
	final Pattern validPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
	
	


	@Override
	public UserInfoBean auth(String email, String password) {
		Matcher emailMatcher = validEmail.matcher(email);
		Matcher passwordMatcher = validPassword.matcher(password);
		
		if (emailMatcher.find() && passwordMatcher.find() && password.length() >7) {
			return dao.auth(email, password);
		} else {
			return null;
		}
	}

	@Override
	public boolean register(UserInfoBean userInfoBean) {
		if (userInfoBean!=null) {
		
			Matcher emailMatcher = validEmail.matcher(userInfoBean.getEmail());
			Matcher nameMatcher = validName.matcher(userInfoBean.getuName());
			Matcher passwordMatcher = validPassword.matcher(userInfoBean.getPassword());
			if (emailMatcher.find() && nameMatcher.find() && userInfoBean.getuName().length() >3 && passwordMatcher.find() && userInfoBean.getPassword().length() >7) {
				return dao.register(userInfoBean);
			} else {
				return false;
			}
			
		} else {
			return false;
		}
		
	}

	
	
	@Override
	public boolean addProduct(ProductInfoBean productInfoBean) {
		return dao.addProduct(productInfoBean);
	}
	
	@Override
	public boolean updateProduct(ProductInfoBean productInfoBean) {
		return dao.updateProduct(productInfoBean);
	}
	
	@Override
	public boolean removeProduct(int id) {
		return dao.removeProduct(id);
	}
	
	@Override
	public List<ProductInfoBean> getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<ProductInfoBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public boolean addCart(CartInfoBean cartInfoBean) {
		return dao.addCart(cartInfoBean);
	}
	
	@Override
	public boolean removeCart(int id) {
		return dao.removeCart(id);
	}

	@Override
	public List<CartInfoBean> getCart(int id) {
		return dao.getCart(id);
	}

	@Override
	public List<CartInfoBean> getAllCart(CartInfoBean cartInfoBean) {
		return dao.getAllCart(cartInfoBean);
	}

	@Override
	public boolean addOrders(OrderInfoBean OrderInfoBean) {
		return dao.addOrders(OrderInfoBean);
	}

	@Override
	public List<OrderInfoBean> getAllOrder(int id) {
		return dao.getAllOrder(id);
	}
	

	
	


}
