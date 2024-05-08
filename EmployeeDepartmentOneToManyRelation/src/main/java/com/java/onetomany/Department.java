package com.java.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 

@Entity
@Table
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentid;
	@Column(name="departmentname", length = 50, nullable = false)
	private String departmentname;
	@Column(name="departmentlocation", length = 25, nullable = false)
	private String departmentlocation;
	
	//one department many employee
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="departmentid")
	private List<Employee> emplist;//setter and getter method for this
	
	//super class
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor using fields
	public Department(String departmentname, String departmentlocation) {
		super();
		this.departmentname = departmentname;
		this.departmentlocation = departmentlocation;
	}

	//getter and setter method
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
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
	
	
	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	//tostring()
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", departmentlocation=" + departmentlocation + ", getDepartmentid()=" + getDepartmentid()
				+ ", getDepartmentname()=" + getDepartmentname() + ", getDepartmentlocation()="
				+ getDepartmentlocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
