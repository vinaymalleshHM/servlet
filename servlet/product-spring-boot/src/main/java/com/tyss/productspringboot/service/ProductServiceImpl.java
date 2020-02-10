package com.tyss.productspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.productspringboot.dao.ProductDAO;
import com.tyss.productspringboot.dto.ProductInfoBean;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
  private ProductDAO dao;
	
	@Override
	public boolean addProduct(ProductInfoBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean removeProduct(int id) {
		return dao.removeProduct(id);
	}

	@Override
	public boolean updateProduct(ProductInfoBean bean) {
		return dao.updateProduct(bean);
	}

	@Override
	public List<ProductInfoBean> getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<ProductInfoBean> getAllProduct() {
		return dao.getAllProduct();
	}

}
