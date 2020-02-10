import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Primary_Info;
import com.tyss.hibernateapp.manytomany.Project_Info;
import com.tyss.hibernateapp.onetoone.Emp_Secondary_Info;

public class TestManyToMany {
	public static void main(String[] args) {
//		Emp_Primary_Info emp_Primary_Info1 = new Emp_Primary_Info();
//		emp_Primary_Info1.setEmp_id(201);
//		emp_Primary_Info1.setEmp_name("venki test yantra");
//		emp_Primary_Info1.setDepartment_id(12);
//		emp_Primary_Info1.setDesignation("jhgjhg");
//		emp_Primary_Info1.setDob("1997-02-02");
//		emp_Primary_Info1.setJoining_date("1998-02-06");
//		emp_Primary_Info1.setExperience("20.5");
//		emp_Primary_Info1.setManager_id(20);
//		emp_Primary_Info1.setOfficial_mail("vhgfhgfhgfhg.com");
//		emp_Primary_Info1.setPhone_number(854585454l);
//		emp_Primary_Info1.setSalary(2.3);
		
//		Emp_Primary_Info emp_Primary_Info2 = new Emp_Primary_Info();
//		emp_Primary_Info2.setEmp_id(202);
//		emp_Primary_Info2.setEmp_name("venkkatesh test yantra");
//		emp_Primary_Info2.setDepartment_id(12);
//		emp_Primary_Info2.setDesignation("jhgjhg");
//		emp_Primary_Info2.setDob("1997-02-02");
//		emp_Primary_Info2.setJoining_date("1998-02-06");
//		emp_Primary_Info2.setExperience("20.5");
//		emp_Primary_Info2.setManager_id(20);
//		emp_Primary_Info2.setOfficial_mail("vhgfhgfhgfhg.com");
//		emp_Primary_Info2.setPhone_number(854585454l);
//		emp_Primary_Info2.setSalary(2.3);
		
//		ArrayList<Emp_Primary_Info> arrayList = new ArrayList<Emp_Primary_Info>();
//		arrayList.add(emp_Primary_Info1);
//		arrayList.add(emp_Primary_Info2);
		
//		Project_Info project_Info = new Project_Info();
//		project_Info.setEnd_date("2018-10-04");
//		project_Info.setLocation("ggg");
//		project_Info.setProject_id(1);
//		project_Info.setProject_name("venki test yantra");
//		project_Info.setStart_date("2019-01-01");
//		project_Info.setTechnology("java");
//		project_Info.setPrimary(arrayList);
		
		
		
		Emp_Primary_Info emp_Primary_Info = new Emp_Primary_Info();
		Project_Info project_Info1 = new Project_Info();
		Project_Info project_Info2 = new Project_Info();
		ArrayList<Project_Info> arrayListPro = new ArrayList<Project_Info>();

		
		emp_Primary_Info.setEmp_id(206);
		emp_Primary_Info.setEmp_name("venkkatesh test yantra");
		emp_Primary_Info.setDepartment_id(12);
		emp_Primary_Info.setDesignation("jhgjhg");
		emp_Primary_Info.setDob("1997-02-02");
		emp_Primary_Info.setJoining_date("1998-02-06");
		emp_Primary_Info.setExperience("20.5");
		emp_Primary_Info.setManager_id(20);
		emp_Primary_Info.setOfficial_mail("vhgfhgfhgfhg.com");
		emp_Primary_Info.setPhone_number(854585454l);
		emp_Primary_Info.setSalary(2.3); 
		emp_Primary_Info.setProject_Info(arrayListPro);
		
		project_Info1.setEnd_date("2018-10-04");
		project_Info1.setLocation("ggg");
		project_Info1.setProject_id(8);
		project_Info1.setProject_name("test");
		project_Info1.setStart_date("2019-01-01");
		project_Info1.setTechnology("java");
//		project_Info1.setPrimary(emp_Primary_Info1);
		
		project_Info2.setEnd_date("2018-10-04");
		project_Info2.setLocation("ggg");
		project_Info2.setProject_id(9);
		project_Info2.setProject_name("yantra");
		project_Info2.setStart_date("2019-01-01");
		project_Info2.setTechnology("java");
//		project_Info2.setPrimary(arrayList);
		
		arrayListPro.add(project_Info1);
		arrayListPro.add(project_Info2);
		
		
		
		
		EntityManagerFactory factory = null;
		EntityManager manager =null;
		EntityTransaction transaction = null; 
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp_Primary_Info);
//			Emp_Primary_Info primary_Info = manager.find(Emp_Primary_Info.class, 103);
//			System.out.println(primary_Info.getSecondary().getGovt_id());
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
