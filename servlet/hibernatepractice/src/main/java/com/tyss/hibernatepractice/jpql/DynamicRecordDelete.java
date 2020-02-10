package com.tyss.hibernatepractice.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class DynamicRecordDelete {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			// here we can't use typed query its throws  exception 
			String jpql = "delete from EmpPrimaryInfo emp where emp.emp_id=:id";
			Query query = manager.createQuery(jpql);
			query.setParameter("id", 4);
			int count = query.executeUpdate();
			
			if (count>0) {
				System.out.println("Record Deleted Succussfuly");
			}else {
				System.out.println("Record can't Delete");
			}
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		finally {
			factory.close();
			manager.close();
		}
	}

}
