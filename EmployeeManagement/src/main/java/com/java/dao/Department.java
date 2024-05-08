package com.java.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentid;
	
	@Column(name="dname")
	@NotBlank(message = "Department name should not be blank, or null")
	private String departmentname;
	
	@NotBlank(message = "Department location should not be null or blank")
	private String departmentlocation;
	
    //one department many employees
	@OneToMany(mappedBy = "dept")
    
    List<Employee> eob=new ArrayList<Employee>();
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departmentname, String departmentlocation) {
		super();
		this.departmentname = departmentname;
		this.departmentlocation = departmentlocation;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentlocation() {
		return departmentlocation;
	}

	public void setDepartmentlocation(String departmentlocation) {
		this.departmentlocation = departmentlocation;
	}
	
	//setter and getter method for Employee list
	public List<Employee> getEob() {
		return eob;
	}

	public void setEob(List<Employee> eob) {
		this.eob = eob;
	}
	

	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", departmentlocation=" + departmentlocation + "]";
	}

	
	
}
