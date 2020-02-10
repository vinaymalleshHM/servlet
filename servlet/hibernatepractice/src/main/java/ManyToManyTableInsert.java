import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;
import com.tyss.hibernatepractice.manytomany.ProjectInfo;

public class ManyToManyTableInsert {

	public static void main(String[] args) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
				//1.
		//		EmpPrimaryInfo empPrimaryInfo = new EmpPrimaryInfo();
		//		ProjectInfo projectInfo = new ProjectInfo();
		//		ArrayList<EmpPrimaryInfo> al = new ArrayList<EmpPrimaryInfo>();
		
		EmpPrimaryInfo empPrimaryInfo1 = new EmpPrimaryInfo();
		EmpPrimaryInfo empPrimaryInfo2 = new EmpPrimaryInfo();
		ProjectInfo projectInfo1 = new ProjectInfo();
		ProjectInfo projectInfo2 = new ProjectInfo();
		ArrayList<ProjectInfo> al1 = new ArrayList<ProjectInfo>();
		ArrayList<EmpPrimaryInfo> al2 = new ArrayList<EmpPrimaryInfo>();

				//1.EmpPrimaryInfo persist via ProjectInfo and u have to use  ArrayList and store EmpPrimaryInfo in that
		//		empPrimaryInfo.setEmp_id(14);
		//		empPrimaryInfo.setEmp_name("prince2");
		//		empPrimaryInfo.setDepartment_id(18);
		//		empPrimaryInfo.setDesignation("software");
		//		empPrimaryInfo.setDob("1997-02-02");
		//		empPrimaryInfo.setJoining_date("1998-02-06");
		//		empPrimaryInfo.setExperience(2.5);
		//		empPrimaryInfo.setManager_id(19);
		//		empPrimaryInfo.setOfficial_mail("prince2testyantra@gmail.com");
		//		empPrimaryInfo.setPhone_number(55555);
		//		empPrimaryInfo.setSalary(2.3);
		//		empPrimaryInfo.setProjectInfo(al1);


		//		al.add(empPrimaryInfo);

		//		projectInfo.setPrimaryInfo(al);


		//		projectInfo.setProject_id(3);
		//		projectInfo.setProject_name("java proj");
		//		projectInfo.setTechnology("java");
		//		projectInfo.setLocation("banglore");
		//		projectInfo.setStart_date("2018-10-3");
		//		projectInfo.setEnd_date("2019-08-08");

		
		//2.//1.ProjectInfo persist via EmpPrimaryInfo or vice versa and u have to use  ArrayList and store EmpPrimaryInfo in that and also do vice versa 

//		empPrimaryInfo1.setEmp_id(20);
//		empPrimaryInfo1.setEmp_name("prince2");
//		empPrimaryInfo1.setDepartment_id(18);
//		empPrimaryInfo1.setDesignation("software");
//		empPrimaryInfo1.setDob("1997-02-02");
//		empPrimaryInfo1.setJoining_date("1998-02-06");
//		empPrimaryInfo1.setExperience(2.5);
//		empPrimaryInfo1.setManager_id(19);
//		empPrimaryInfo1.setOfficial_mail("prince2testyantra@gmail.com");
//		empPrimaryInfo1.setPhone_number(55555);
//		empPrimaryInfo1.setSalary(2.3);
////		empPrimaryInfo1.setProjectInfo(al1);
//		
//		empPrimaryInfo2.setEmp_id(21);
//		empPrimaryInfo2.setEmp_name("prince2");
//		empPrimaryInfo2.setDepartment_id(18);
//		empPrimaryInfo2.setDesignation("software");
//		empPrimaryInfo2.setDob("1997-02-02");
//		empPrimaryInfo2.setJoining_date("1998-02-06");
//		empPrimaryInfo2.setExperience(2.5);
//		empPrimaryInfo2.setManager_id(19);
//		empPrimaryInfo2.setOfficial_mail("prince2testyantra@gmail.com");
//		empPrimaryInfo2.setPhone_number(55555);
//		empPrimaryInfo2.setSalary(2.3);
////		empPrimaryInfo2.setProjectInfo(al1);
//		
//		al2.add(empPrimaryInfo1);
//		al2.add(empPrimaryInfo2);
//
//		projectInfo1.setProject_id(23);
//		projectInfo1.setProject_name("java proj");
//		projectInfo1.setTechnology("java");
//		projectInfo1.setLocation("banglore");
//		projectInfo1.setStart_date("2018-10-3");
//		projectInfo1.setEnd_date("2019-08-08");
//		projectInfo1.setPrimaryInfo(al2);
//
//		projectInfo2.setProject_id(24);
//		projectInfo2.setProject_name("java proj");
//		projectInfo2.setTechnology("java");
//		projectInfo2.setLocation("banglore");
//		projectInfo2.setStart_date("2018-10-3");
//		projectInfo2.setEnd_date("2019-08-08");
//		projectInfo2.setPrimaryInfo(al2);
////		al1.add(projectInfo1);
////		al1.add(projectInfo2);
//


		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction(); 
			transaction.begin();
			
			//1.follow first comment
//						manager.persist(projectInfo);
			
			//follow second comment and vice versa
//			manager.persist(empPrimaryInfo1);
			manager.persist(projectInfo1);
			manager.persist(projectInfo2);
			
			System.out.println("Record Inserted");
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback(); 
		}

		finally {
			factory.close();
			manager.close();
		}
	} 

}
