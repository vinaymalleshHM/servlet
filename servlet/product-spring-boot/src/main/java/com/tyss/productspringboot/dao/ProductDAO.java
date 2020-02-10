package com.tyss.productspringboot.dao;

import java.util.List;

import com.tyss.productspringboot.dto.ProductInfoBean;

public interface ProductDAO {
	boolean addProduct(ProductInfoBean bean);
	boolean removeProduct(int id);
	boolean updateProduct(ProductInfoBean bean);
	List<ProductInfoBean> getProductByName(String name);
	List<ProductInfoBean> getAllProduct();

}
