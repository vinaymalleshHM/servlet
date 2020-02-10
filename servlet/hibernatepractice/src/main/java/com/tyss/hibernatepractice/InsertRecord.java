package com.tyss.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmpPrimaryInfo empPrimaryInfo = new EmpPrimaryInfo();
		
		empPrimaryInfo.setEmp_id(4);
		empPrimaryInfo.setDepartment_id(4);
		empPrimaryInfo.setDesignation("dd");
		empPrimaryInfo.setDob("2010-01-02");
		empPrimaryInfo.setEmp_name("Prince");
		empPrimaryInfo.setExperience(2);
		empPrimaryInfo.setJoining_date("2019-10-11");
		empPrimaryInfo.setManager_id(14);
		empPrimaryInfo.setOfficial_mail("Prince@gmail");
		empPrimaryInfo.setPhone_number(55555);
		empPrimaryInfo.setSalary(25000);

		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(empPrimaryInfo);
			System.out.println("Record Inserted Successfully");
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
