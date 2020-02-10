package com.tyess.productrestapi.service;

import java.util.List;

import com.tyess.productrestapi.dto.ProductInfoBean;

public interface ProductService {
	
	boolean addProduct(ProductInfoBean bean);
	boolean removeProduct(int id);
	boolean updateProduct(ProductInfoBean bean);
	List<ProductInfoBean> getProductByName(String name);
	List<ProductInfoBean> getAllProduct();


}
