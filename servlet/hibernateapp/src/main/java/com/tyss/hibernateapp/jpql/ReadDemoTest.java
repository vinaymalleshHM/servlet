package com.tyss.hibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernate.dto.Emp_Primary_Info;

public class ReadDemoTest {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
//		String jpql = "select emp.emp_name from Emp_Primary_Info emp";
//		Query query = manager.createQuery(jpql);
////		TypedQuery<Emp_Primary_Info> query = manager.createQuery( jpql,Emp_Primary_Info.class );
//		List<String> record = query.getResultList(); 
//		for (int i = 0; i < record.size(); i++) {
//			System.out.println("Employee name: "+record.get(i));
//			System.out.println("*****************************");
//		}
		
		String jpql = "select emp.emp_name from Emp_Primary_Info emp";
		TypedQuery<Emp_Primary_Info> query = manager.createQuery( jpql,Emp_Primary_Info.class );
		Emp_Primary_Info emp_Primary_Info = query.getSingleResult();
		System.out.println(emp_Primary_Info.getEmp_name());


	}// end of main methos

}//end of class
