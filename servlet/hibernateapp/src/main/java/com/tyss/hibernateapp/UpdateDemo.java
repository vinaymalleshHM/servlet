package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Primary_Info;

public class UpdateDemo {
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
		    transaction = manager.getTransaction();
			transaction.begin();
			Emp_Primary_Info record = manager.find(Emp_Primary_Info.class, 101);
			record.setEmp_name("prince");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
		finally {
			manager.close();
			factory.close();
		}
	}

}
