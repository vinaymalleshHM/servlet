package com.tyess.productrestapi.dao;

import java.util.List;

import com.tyess.productrestapi.dto.ProductInfoBean;

public interface ProductDAO {
	boolean addProduct(ProductInfoBean bean);
	boolean removeProduct(int id);
	boolean updateProduct(ProductInfoBean bean);
	List<ProductInfoBean> getProductByName(String name);
	List<ProductInfoBean> getAllProduct();

}
