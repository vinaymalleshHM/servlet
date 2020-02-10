package com.tyss.productspringboot.service;

import java.util.List;

import com.tyss.productspringboot.dto.ProductInfoBean;

public interface ProductService {
	boolean addProduct(ProductInfoBean bean);
	boolean removeProduct(int id);
	boolean updateProduct(ProductInfoBean bean);
	List<ProductInfoBean> getProductByName(String name);
	List<ProductInfoBean> getAllProduct();

}
