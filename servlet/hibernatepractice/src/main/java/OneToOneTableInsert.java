import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jboss.jandex.Main;

import com.tyss.hibernateapractice.dto.EmpPrimaryInfo;
import com.tyss.hibernatepractice.onetoone.EmpSecondaryInfo;

public class OneToOneTableInsert {
	public static void main(String[] args) {
		//		System.out.println((int)5.5/0.0001);

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmpPrimaryInfo empPrimaryInfo = new EmpPrimaryInfo();
		EmpSecondaryInfo empSecondaryInfo = new EmpSecondaryInfo();

		//1. EmpPrimaryInfo via persist by EmpSecondaryInfo 

		//				empPrimaryInfo.setEmp_id(1);
		//				empPrimaryInfo.setEmp_name("venki test yantra");
		//				empPrimaryInfo.setDepartment_id(11);
		//				empPrimaryInfo.setDesignation("software");
		//				empPrimaryInfo.setDob("1997-02-02");
		//				empPrimaryInfo.setJoining_date("1998-02-06");
		//				empPrimaryInfo.setExperience(2.5);
		//				empPrimaryInfo.setManager_id(20);
		//				empPrimaryInfo.setOfficial_mail("venkitestyantra@gmail.com");
		//				empPrimaryInfo.setPhone_number(55555);
		//				empPrimaryInfo.setSalary(2.3);
		//				
		//				empSecondaryInfo.setPrimary(empPrimaryInfo);
		//				empSecondaryInfo.setBlood_group("A+");
		//				empSecondaryInfo.setGender("male");
		//				empSecondaryInfo.setEmargancy_no(252222);
		//				empSecondaryInfo.setGovt_id("BV346");
		//				empSecondaryInfo.setGuardian_name("Somthing");
		//				empSecondaryInfo.setGuardian_number(5555);;
		//				empSecondaryInfo.setIs_married(true);
		//				empSecondaryInfo.setIs_phycally_challenged(false);
		//				empSecondaryInfo.setJob_location("banglore");
		//				empSecondaryInfo.setNationality("india");
		//				empSecondaryInfo.setPersonal_email("venki@gmail.com");
		//				empSecondaryInfo.setIs_phycally_challenged(false);



		//     2. EmpSecondaryInfo via persist by  EmpPrimaryInfo

		//				empPrimaryInfo.setEmp_id(2);
		//				empPrimaryInfo.setEmp_name("test yantra");
		//				empPrimaryInfo.setDepartment_id(12);
		//				empPrimaryInfo.setDesignation("software");
		//				empPrimaryInfo.setDob("1997-02-02");
		//				empPrimaryInfo.setJoining_date("1998-02-06");
		//				empPrimaryInfo.setExperience(2.5);
		//				empPrimaryInfo.setManager_id(20);
		//				empPrimaryInfo.setOfficial_mail("testyantra@gmail.com");
		//				empPrimaryInfo.setPhone_number(55555);
		//				empPrimaryInfo.setSalary(2.3);
		//				
		//				empSecondaryInfo.setPrimary(empPrimaryInfo);
		//				empSecondaryInfo.setBlood_group("A+");
		//				empSecondaryInfo.setGender("male");
		//				empSecondaryInfo.setEmargancy_no(252222);
		//				empSecondaryInfo.setGovt_id("BV346");
		//				empSecondaryInfo.setGuardian_name("Somthing");
		//				empSecondaryInfo.setGuardian_number(5555);;
		//				empSecondaryInfo.setIs_married(true);
		//				empSecondaryInfo.setIs_phycally_challenged(false);
		//				empSecondaryInfo.setJob_location("banglore");
		//				empSecondaryInfo.setNationality("india");
		//				empSecondaryInfo.setPersonal_email("test@gmail.com");
		//				empSecondaryInfo.setIs_phycally_challenged(false);




		//3. we can persist like this also before persist we must set setPrimary(empPrimaryInfo) other wise it don't know how to connect
		//the this two table and  persist and also it's invoke the exception persistence.PersistenceException: org.hibernate.PropertyAccessException: 
		//Null value was assigned to a property

		empPrimaryInfo.setEmp_id(4);
		empPrimaryInfo.setEmp_name("prince");
		empPrimaryInfo.setDepartment_id(14);
		empPrimaryInfo.setDesignation("software");
		empPrimaryInfo.setDob("1997-02-02");
		empPrimaryInfo.setJoining_date("1998-02-06");
		empPrimaryInfo.setExperience(2.5);
		empPrimaryInfo.setManager_id(20);
		empPrimaryInfo.setOfficial_mail("princet@gmail.com");
		empPrimaryInfo.setPhone_number(55555);
		empPrimaryInfo.setSalary(2.3);

		empSecondaryInfo.setPrimary(empPrimaryInfo);
		empSecondaryInfo.setEmp_id(4);
		empSecondaryInfo.setBlood_group("A+");
		empSecondaryInfo.setGender("male");
		empSecondaryInfo.setEmargancy_no(252222);
		empSecondaryInfo.setGovt_id("BV346");
		empSecondaryInfo.setGuardian_name("Somthing");
		empSecondaryInfo.setGuardian_number(5555);;
		empSecondaryInfo.setIs_married(true);
		empSecondaryInfo.setIs_phycally_challenged(false);
		empSecondaryInfo.setJob_location("banglore");
		empSecondaryInfo.setNationality("india");
		empSecondaryInfo.setPersonal_email("prince@gmail.com");
		empSecondaryInfo.setIs_phycally_challenged(false);

		empPrimaryInfo.setSecondary(empSecondaryInfo);



		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager  = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			//1. EmpPrimaryInfo via persist by EmpSecondaryInfo 

			//			manager.persist(empSecondaryInfo);


			//2. EmpSecondaryInfo via persist by EmpPrimaryInfo 

			//			manager.persist(empPrimaryInfo);

			//3. another way of persist ex.
			//			manager.persist(empPrimaryInfo);

			//			System.out.println("Record Inserted Successfully");
			//			transaction.commit();

			EmpPrimaryInfo recoEmpPrimaryInfo = manager.find(EmpPrimaryInfo.class, 2);
			System.out.println("emp id "+recoEmpPrimaryInfo.getEmp_id());
			System.out.println("emp name "+recoEmpPrimaryInfo.getEmp_name());

			System.out.println("emp Govt id "+recoEmpPrimaryInfo.getSecondary().getGovt_id());
			System.out.println("emp Personal email "+recoEmpPrimaryInfo.getSecondary().getPersonal_email());




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
