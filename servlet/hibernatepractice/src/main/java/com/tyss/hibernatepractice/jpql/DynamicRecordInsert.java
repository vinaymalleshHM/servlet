package com.tyss.hibernatepractice.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class DynamicRecordInsert {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			// jpql is not support insert  
			//1.first way write query
			
//			String sql = "insert into emp_primary_info(emp_id,emp_name,salary,department_id,joining_date,phone_number,official_mail,designation,dob,manager_id,experience) "+
//			"values(?,?,?,?,?,?,?,?,?,?,?)";
			
			//2.way to write query
			
			String sql = "insert into emp_primary_info values(:a,:b,:c,:d,:e,:f,:g,:h,:i,:j,:k)"; // here your not specifying the colomn name explicitly
																								//like as above so u have pass the value according to db table order
			
			Query query = manager.createNativeQuery(sql);
			query.setParameter("a", 6);
			query.setParameter("b", 6);
			query.setParameter("c", "dev");
			query.setParameter("d", "1999-02-02" );
			query.setParameter("e","yantra" );
			query.setParameter("f", 6);
			query.setParameter("g","2019-10-01" );
			query.setParameter("h", 6);
			query.setParameter("i","test@gmail.com");
			query.setParameter("j", 9999);
			query.setParameter("k", 25000);
			int count  = query.executeUpdate();
			System.out.println("Record Updated Succussfuly "+count);
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
