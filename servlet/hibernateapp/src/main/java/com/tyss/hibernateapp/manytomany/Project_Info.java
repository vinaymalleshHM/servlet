package com.tyss.hibernateapp.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tyss.hibernate.dto.Emp_Primary_Info;
@Entity
@Table(name="Project_Info")
public class Project_Info implements Serializable{
	@Id
	@Column
	private int Project_id;
	@Column
	private String Project_name;
	@Column
	private String technology;
	@Column
	private String location;
	@Column
	private String start_date;
	@Column
	private String end_date;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Emp_Project_Info",joinColumns = @JoinColumn(name="Project_id"),inverseJoinColumns = @JoinColumn(name="emp_id"))
	private List<Emp_Primary_Info> primary;
	
	
	public List<Emp_Primary_Info> getPrimary() {
		return primary;
	}
	public void setPrimary(List<Emp_Primary_Info> primary) {
		this.primary = primary;
	}
	public int getProject_id() {
		return Project_id;
	}
	public void setProject_id(int project_id) {
		Project_id = project_id;
	}
	public String getProject_name() {
		return Project_name;
	}
	public void setProject_name(String project_name) {
		Project_name = project_name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	

}
