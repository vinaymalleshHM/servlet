import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernate.dto.Emp_Primary_Info;
import com.tyss.hibernateapp.manytoone.EmpAddressPK;
import com.tyss.hibernateapp.manytoone.Emp_Address_Info;
import com.tyss.hibernateapp.onetoone.Emp_Secondary_Info;

public class TestManyToOne {
	public static void main(String[] args) {
		Emp_Primary_Info emp_Primary_Info = new Emp_Primary_Info();
		emp_Primary_Info.setEmp_id(108);
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
		
		EmpAddressPK addressPK = new EmpAddressPK();
		addressPK.setEmp_id(108);
		addressPK.setAddr_type("permanent");
		
		Emp_Address_Info address_Info = new Emp_Address_Info();
		address_Info.setAddress_1("shghgj");
		address_Info.setAddress_2("hjhjhj");
		address_Info.setAddressPK(addressPK);
		address_Info.setCity("bjann");
		address_Info.setHouse_no(12);
		address_Info.setLandmark("bbbb");
		address_Info.setPincode(222);
		address_Info.setPrimary(emp_Primary_Info);

		
		EntityManagerFactory factory = null;
		EntityManager manager =null;
		EntityTransaction transaction = null; 
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
//			manager.persist(address_Info);
//			System.out.println("record saved succusfully");
			
//			Emp_Primary_Info primary_Info = manager.find(Emp_Primary_Info.class, 108);
//			address_Info.setPrimary(primary_Info);
//			manager.persist(address_Info);
			System.out.println("Record updated");
			Emp_Primary_Info primary_Info = manager.find(Emp_Primary_Info.class, 108);
			System.out.println(primary_Info.getAddress_Info().get(0).getAddress_1());
//			System.out.println(primary_Info.getAddress_Info().);
			System.out.println("Record get succuss fully");
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
