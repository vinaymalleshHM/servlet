import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Primary_Info;
import com.tyss.hibernateapp.onetoone.Emp_Secondary_Info;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class TestOneToOne {
	public static void main(String[] args) {
		
		Emp_Primary_Info emp_Primary_Info = new Emp_Primary_Info();
		emp_Primary_Info.setEmp_id(103);
		emp_Primary_Info.setEmp_name("venki test yantra");
		emp_Primary_Info.setDepartment_id(12);
		emp_Primary_Info.setDesignation("jhgjhg");
		emp_Primary_Info.setDob("1997-02-02");
		emp_Primary_Info.setJoining_date("1998-02-06");
		emp_Primary_Info.setExperience("20.5");
		emp_Primary_Info.setManager_id(20);
		emp_Primary_Info.setOfficial_mail("vhgfhgfhgfhg.com");
		emp_Primary_Info.setPhone_number(854585454l);
		emp_Primary_Info.setSalary(2.3);
		
		
//		Emp_Secondary_info secondary = new Emp_Secondary_info();
        Emp_Secondary_Info secondary = new Emp_Secondary_Info();
		secondary.setPrimary(emp_Primary_Info);
		
		//secondary.setId(3);
		secondary.setBlood_group("A+");
		secondary.setGender("male");
		secondary.setEmargancy_no(252222);
		secondary.setGovt_id("BV346");
		secondary.setGuardian_name("Somthing");
		secondary.setGuardian_number(5555);;
		secondary.setIs_married(true);
		secondary.setIs_phycally_challenged(false);
		secondary.setJob_location("banglore");
		secondary.setNationality("india");
		secondary.setPersonal_email("avcd@gsdh.com");
		
		
		EntityManagerFactory factory = null;
		EntityManager manager =null;
		EntityTransaction transaction = null; 
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
//			manager.persist(secondary);
			Emp_Primary_Info primary_Info = manager.find(Emp_Primary_Info.class, 103);
			System.out.println(primary_Info.getSecondary().getGovt_id());
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
