package com.tyss.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class RemoveRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null; 

		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			EmpPrimaryInfo recoEmpPrimaryInfo = manager.find(EmpPrimaryInfo.class, 2);
			transaction.begin();
			manager.remove(recoEmpPrimaryInfo);
			System.out.println("Record Deleted Successfuly");
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
