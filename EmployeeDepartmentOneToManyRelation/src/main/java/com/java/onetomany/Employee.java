package com.java.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emplyeeid;
	@Column(name="employeename", length=50, nullable=false)
	private String employeename;
	@Column(name="employeeage", nullable=false)
	private int employeeage;
	@Column(name="employeesalary", nullable=false)
	private float employeesalary;
	
	@ManyToOne
	@JoinColumn(name="departmentid")
	private Department dept;//setter and getter
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeename, int employeeage, float employeesalary) {
		super();
		this.employeename = employeename;
		this.employeeage = employeeage;
		this.employeesalary = employeesalary;
	}
	public int getEmplyeeid() {
		return emplyeeid;
	}
	public void setEmplyeeid(int emplyeeid) {
		this.emplyeeid = emplyeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public float getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(float employeesalary) {
		this.employeesalary = employeesalary;
	}
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return "Employee [emplyeeid=" + emplyeeid + ", employeename=" + employeename + ", employeeage=" + employeeage
				+ ", employeesalary=" + employeesalary + ", getEmplyeeid()=" + getEmplyeeid() + ", getEmployeename()="
				+ getEmployeename() + ", getEmployeeage()=" + getEmployeeage() + ", getEmployeesalary()="
				+ getEmployeesalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
