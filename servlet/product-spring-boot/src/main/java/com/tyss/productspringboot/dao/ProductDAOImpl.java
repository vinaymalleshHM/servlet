package com.tyss.productspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.productspringboot.dto.ProductInfoBean;
@Repository
public class ProductDAOImpl implements ProductDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(bean);
		transaction.commit();
		return true;

	}

	@Override
	public boolean removeProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductInfoBean bean = manager.find(ProductInfoBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateProduct(ProductInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductInfoBean infobean = manager.find(ProductInfoBean.class, bean.getId());
		infobean.setpName(bean.getpName());
		infobean.setPrice(bean.getPrice());
		infobean.setQty(bean.getQty());
		infobean.setDescription(bean.getDescription());
		infobean.setProImg(bean.getProImg());
		try {
			manager.persist(infobean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			for (StackTraceElement element : e.getStackTrace()) {
				System.out.println(element.toString());
			}
			return false;
		}
	}

	@Override
	public List<ProductInfoBean> getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from ProductInfoBean e where e.name=:name";
		TypedQuery<ProductInfoBean > query = manager.createQuery(jpql,ProductInfoBean.class);
		query.setParameter("name", name);
		return query.getResultList();
	}

	@Override
	public List<ProductInfoBean> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from ProductInfoBean e";
		TypedQuery<ProductInfoBean > query = manager.createQuery(jpql,ProductInfoBean.class);
		return query.getResultList();
	}

}
