package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Primary_Info;

public class InsertDemo {

	public static void main(String[] args) {
		Emp_Primary_Info emp_Primary_Info = new Emp_Primary_Info();
		emp_Primary_Info.setEmp_id(101);
		emp_Primary_Info.setEmp_id(101);
		emp_Primary_Info.setEmp_name("venki");
		emp_Primary_Info.setDepartment_id(12);
		emp_Primary_Info.setDesignation("jhgjhg");
		emp_Primary_Info.setDob("1997-02-02");
		emp_Primary_Info.setJoining_date("1998-02-06");
		emp_Primary_Info.setExperience("20.5");
		emp_Primary_Info.setManager_id(20);
		emp_Primary_Info.setOfficial_mail("vhgfhgfhgfhg.com");
		emp_Primary_Info.setPhone_number(854585454l);
		emp_Primary_Info.setSalary(2.3);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
		    transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp_Primary_Info);
			System.out.println("Record saved");
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
