package com.tyss.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;

public class FindRecord {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();

			EmpPrimaryInfo recoEmpPrimaryInfo = manager.find(EmpPrimaryInfo.class, 1);

			System.out.println("emp id : "+recoEmpPrimaryInfo.getEmp_id());
			System.out.println("emp name : "+recoEmpPrimaryInfo.getEmp_name());
			System.out.println("emp Department_id : "+recoEmpPrimaryInfo.getDepartment_id());
			System.out.println("emp Designation : "+recoEmpPrimaryInfo.getDesignation());
			System.out.println("emp dob : "+recoEmpPrimaryInfo.getDob());
			System.out.println("emp Experience : "+recoEmpPrimaryInfo.getExperience());
			System.out.println("emp Joining_date : "+recoEmpPrimaryInfo.getJoining_date());
			System.out.println("emp Manager_id : "+recoEmpPrimaryInfo.getManager_id());
			System.out.println("emp Official_mail : "+recoEmpPrimaryInfo.getOfficial_mail());
			System.out.println("emp Official_mail : "+recoEmpPrimaryInfo.getOfficial_mail());
			System.out.println("emp Phone_number : "+recoEmpPrimaryInfo.getPhone_number());
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			factory.close();
		}
	}

}
