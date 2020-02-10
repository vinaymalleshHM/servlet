package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Primary_Info;

public class GetReference {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		//		Emp_Primary_Info result = manager.find(Emp_Primary_Info.class, 101);  //it will it hit the DB
		//		System.out.println(result.getClass());
		
				Emp_Primary_Info result = manager.getReference(Emp_Primary_Info.class, 101);  //it will it not hit the DB
				System.out.println(result.getClass());
				//		 System.out.println(result.getEmp_id());
		//		 System.out.println(result.getEmp_name());
		//		 System.out.println(result.getDob());
		//		 System.out.println(result.getDepartment_id());
		//		 System.out.println(result.getDesignation());
		//		 System.out.println(result.getExperience());
		//		 System.out.println(result.getJoining_date());
		//		 System.out.println(result.getManager_id());
		//		 System.out.println(result.getOfficial_mail());
		//		 System.out.println(result.getPhone_number());
		//		 System.out.println(result.getSalary());
				 factory.close();
		manager.close();
	}

}
