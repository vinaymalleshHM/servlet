package com.tyss.hibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction =  null;
		try {
			 factory = Persistence.createEntityManagerFactory("test");
			 manager = factory.createEntityManager();
			 transaction =  manager.getTransaction();
			transaction.begin();
			String jpql = "delete from  Emp_Primary_Info emp where emp.emp_id=:eid";
			Query query = manager.createQuery(jpql);
			query.setParameter("eid", 5);
			int result = query.executeUpdate();
			System.out.println("No of the count-----"+result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			factory.close();
		}
	}

}
