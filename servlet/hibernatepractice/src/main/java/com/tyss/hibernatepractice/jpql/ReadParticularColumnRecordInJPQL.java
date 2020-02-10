package com.tyss.hibernatepractice.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class ReadParticularColumnRecordInJPQL {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		 try {
			 factory = Persistence.createEntityManagerFactory("test");
			 manager = factory.createEntityManager();
//			 String jpql = "select emp.department_id from EmpPrimaryInfo emp";
//			 Query query = manager.createQuery(jpql);
//			 List<EmpPrimaryInfo > recoEmpPrimaryInfo = query.getResultList();
//			 System.out.println(recoEmpPrimaryInfo);
//			 for (int i = 0; i < recoEmpPrimaryInfo.size() ; i++) {
//				 System.out.println("emp department_id : "+recoEmpPrimaryInfo.get(i));
//				
//			}
			 
			 //here we can't use bcz in query we are selecting all names so we get exception
			
//			 String jpql = "select emp.emp_name from EmpPrimaryInfo emp";
//			 TypedQuery<EmpPrimaryInfo> recoTypedQuery = manager.createQuery(jpql, EmpPrimaryInfo.class);
//			 EmpPrimaryInfo recoEmpPrimaryInfo = recoTypedQuery.getSingleResult();
//			 System.out.println(recoEmpPrimaryInfo.getEmp_name());
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
