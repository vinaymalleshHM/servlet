package com.tyss.hibernatepractice.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class DynamicRecordSelect {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			
			String jpql = "select emp from EmpPrimaryInfo emp where emp_id=:id";
			
			//1.first way to fetch the data
//			Query query = manager.createQuery(jpql);
//			query.setParameter("id", 3);
//			List<EmpPrimaryInfo> recoEmpPrimaryInfo = query.getResultList();
//			for (EmpPrimaryInfo empPrimaryInfo : recoEmpPrimaryInfo) {
//				
//				System.out.println("Emp_id: "+empPrimaryInfo.getEmp_id());
//				System.out.println("Emp_name: "+empPrimaryInfo.getEmp_name());
//				System.out.println("Dob: "+empPrimaryInfo.getDob());
//				System.out.println("Department_id: "+empPrimaryInfo.getDepartment_id());
//				System.out.println("Designation: "+empPrimaryInfo.getDesignation());
//				System.out.println("Experience: "+empPrimaryInfo.getExperience());
//				System.out.println("Joining_date: "+empPrimaryInfo.getJoining_date());
//				System.out.println("Manager_id: "+empPrimaryInfo.getManager_id());
//				System.out.println("Official_mail: "+empPrimaryInfo.getOfficial_mail());
//				System.out.println("Phone_number: "+empPrimaryInfo.getPhone_number());
//				System.out.println("Salary: "+empPrimaryInfo.getSalary());
//				System.out.println("*****************************");
//			}
			
			
			//2.way to fetch 
			TypedQuery<EmpPrimaryInfo> typedQuery = manager.createQuery(jpql, EmpPrimaryInfo.class);
			typedQuery.setParameter("id", 6);
			EmpPrimaryInfo recoEmpPrimaryInfo = typedQuery.getSingleResult();
			System.out.println("Emp_id: "+recoEmpPrimaryInfo.getEmp_id());
			System.out.println("Emp_name: "+recoEmpPrimaryInfo.getEmp_name());
			System.out.println("Dob: "+recoEmpPrimaryInfo.getDob());
			System.out.println("Department_id: "+recoEmpPrimaryInfo.getDepartment_id());
			System.out.println("Designation: "+recoEmpPrimaryInfo.getDesignation());
			System.out.println("Experience: "+recoEmpPrimaryInfo.getExperience());
			System.out.println("Joining_date: "+recoEmpPrimaryInfo.getJoining_date());
			System.out.println("Manager_id: "+recoEmpPrimaryInfo.getManager_id());
			System.out.println("Official_mail: "+recoEmpPrimaryInfo.getOfficial_mail());
			System.out.println("Phone_number: "+recoEmpPrimaryInfo.getPhone_number());
			System.out.println("Salary: "+recoEmpPrimaryInfo.getSalary());
			System.out.println("*****************************");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			factory.close();
		}
	}

}
