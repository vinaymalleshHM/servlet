package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Demo;
import com.tyss.hibernate.dto.Emp_Primary_Info;

public class Reattach {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
//			factory = Persistence.createEntityManagerFactory("test1");
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
		    transaction = manager.getTransaction();
			transaction.begin();
//			Emp_Primary_Info record = manager.find(Emp_Primary_Info.class,107);
//			manager.detach(record);
//			System.out.println("After deattach "+manager.contains(record));
//			record.setEmp_name("prince");
			
			Emp_Demo record = manager.find(Emp_Demo.class,101);
			System.out.println("before deattach "+manager.contains(record));
//			manager.detach(record);
			System.out.println("After deattach "+manager.contains(record));
//			Emp_Demo rs = manager.merge(record);
//			rs.setEmp_name("prince");
			record.setEmp_name("prince");
			System.out.println("updated");
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
