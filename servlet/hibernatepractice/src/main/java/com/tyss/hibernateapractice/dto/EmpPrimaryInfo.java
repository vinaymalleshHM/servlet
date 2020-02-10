package com.tyss.hibernateapractice.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.tyss.hibernatepractice.manytomany.ProjectInfo;
import com.tyss.hibernatepractice.manytoone.EmpAddressInfo;
import com.tyss.hibernatepractice.onetoone.EmpSecondaryInfo;

import lombok.Data;

@Entity
@Table(name="emp_primary_info")
public class EmpPrimaryInfo implements Serializable{
	@Id
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private double salary;
	@Column
	private int department_id;
	@Column
	private String joining_date;
	@Column
	private int phone_number;
	@Column
	private String official_mail;
	@Column
	private String designation;
	@Column
	private String dob;
	@Column
	private int manager_id;
	@Column
	private double experience;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "primary")
	private EmpSecondaryInfo secondary;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="empPrimaryInfo")
	private List<EmpAddressInfo> empAddressInfo;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "primaryInfo")
//	@JoinTable()
	private List<ProjectInfo> projectInfo;
	
	
	
	public List<ProjectInfo> getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(List<ProjectInfo> projectInfo) {
		this.projectInfo = projectInfo;
	}
	public List<EmpAddressInfo> getEmpAddressInfo() {
		return empAddressInfo;
	}
	public void setEmpAddressInfo(List<EmpAddressInfo> empAddressInfo) {
		this.empAddressInfo = empAddressInfo;
	}
	public EmpSecondaryInfo getSecondary() {
		return secondary;
	}
	public void setSecondary(EmpSecondaryInfo secondary) {
		this.secondary = secondary;
	}
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
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
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
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	
	
}
