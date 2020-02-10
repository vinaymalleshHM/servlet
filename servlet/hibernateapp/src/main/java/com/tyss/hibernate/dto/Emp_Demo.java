package com.tyss.hibernate.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tyss.hibernateapp.manytomany.Project_Info;
import com.tyss.hibernateapp.manytoone.Emp_Address_Info;
import com.tyss.hibernateapp.onetoone.Emp_Secondary_Info;
@Entity
@Table(name="emp_primary_info")
public class Emp_Demo {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)// to generate automatically
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private double salary;
	@Column
	private int department_id;
	@Column
	private  String joining_date ;
	@Column
	private  long phone_number;
	@Column
	private String official_mail;
	@Column
	private String designation;
	@Column
	private String dob;
	@Column
	private int manager_id;
	@Column
	private String experience;
	

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getOfficial_mail() {
		return official_mail;
	}
	public void setOfficial_mail(String official_mail) {
		this.official_mail = official_mail;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}

}
