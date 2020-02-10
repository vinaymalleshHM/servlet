package com.tyss.hibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernate.dto.Emp_Primary_Info;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
//		String jpql = "select emp from Emp_Primary_Info emp";
//		Query query = manager.createQuery(jpql);
//		List<Emp_Primary_Info> record = query.getResultList();
		String jpql = "select emp from Emp_Primary_Info emp where emp_id=2";
		TypedQuery<Emp_Primary_Info> query = manager.createQuery( jpql,Emp_Primary_Info.class );
		Emp_Primary_Info emp_Primary_Info = query.getSingleResult();

			System.out.println("Emp_id: "+emp_Primary_Info.getEmp_id());
			System.out.println("Emp_name: "+emp_Primary_Info.getEmp_name());
			System.out.println("Dob: "+emp_Primary_Info.getDob());
			System.out.println("Department_id: "+emp_Primary_Info.getDepartment_id());
			System.out.println("Designation: "+emp_Primary_Info.getDesignation());
			System.out.println("Experience: "+emp_Primary_Info.getExperience());
			System.out.println("Joining_date: "+emp_Primary_Info.getJoining_date());
			System.out.println("Manager_id: "+emp_Primary_Info.getManager_id());
			System.out.println("Official_mail: "+emp_Primary_Info.getOfficial_mail());
			System.out.println("Phone_number: "+emp_Primary_Info.getPhone_number());
			System.out.println("Salary: "+emp_Primary_Info.getSalary());
			System.out.println("*****************************");

	}

}
