package com.tyss.hibernatepractice.jpql;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class ReadRecordInJPQL {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			
			//using jpql query with createQuery
			
			String jpql = "select emp from EmpPrimaryInfo emp where emp_id=4";
			Query query = manager.createQuery(jpql);
			System.out.println("hjhjj "+query);
			List<EmpPrimaryInfo> recoEmpPrimaryInfo = query.getResultList();
			for (EmpPrimaryInfo empPrimaryInfo : recoEmpPrimaryInfo) {
				System.out.println("emp id : "+empPrimaryInfo.getEmp_id());
				System.out.println("emp name : "+empPrimaryInfo.getEmp_name());
				System.out.println("emp Department_id : "+empPrimaryInfo.getDepartment_id());
				System.out.println("emp Designation : "+empPrimaryInfo.getDesignation());
				System.out.println("emp dob : "+empPrimaryInfo.getDob());
				System.out.println("emp Experience : "+empPrimaryInfo.getExperience());
				System.out.println("emp Joining_date : "+empPrimaryInfo.getJoining_date());
				System.out.println("emp Manager_id : "+empPrimaryInfo.getManager_id());
				System.out.println("emp Official_mail : "+empPrimaryInfo.getOfficial_mail());
				System.out.println("emp Phone_number : "+empPrimaryInfo.getPhone_number());
			}
			
			// using typed query here we are not using to store the list
			
//			String jpql = "select emp from EmpPrimaryInfo emp where emp_id=1";
//			TypedQuery<EmpPrimaryInfo> recoEmpTypedQuery = manager.createQuery(jpql, EmpPrimaryInfo.class);
//			
//			EmpPrimaryInfo recoEmpPrimaryInfo = recoEmpTypedQuery.getSingleResult();
//			
//			System.out.println("emp id : "+recoEmpPrimaryInfo.getEmp_id());
//			System.out.println("emp name : "+recoEmpPrimaryInfo.getEmp_name());
//			System.out.println("emp Department_id : "+recoEmpPrimaryInfo.getDepartment_id());
//			System.out.println("emp Designation : "+recoEmpPrimaryInfo.getDesignation());
//			System.out.println("emp dob : "+recoEmpPrimaryInfo.getDob());
//			System.out.println("emp Experience : "+recoEmpPrimaryInfo.getExperience());
//			System.out.println("emp Joining_date : "+recoEmpPrimaryInfo.getJoining_date());
//			System.out.println("emp Manager_id : "+recoEmpPrimaryInfo.getManager_id());
//			System.out.println("emp Official_mail : "+recoEmpPrimaryInfo.getOfficial_mail());
//			System.out.println("emp Official_mail : "+recoEmpPrimaryInfo.getOfficial_mail());
//			System.out.println("emp Phone_number : "+recoEmpPrimaryInfo.getPhone_number());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			factory.close();
		}
	}

}
