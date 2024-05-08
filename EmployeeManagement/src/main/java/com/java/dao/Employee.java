package com.java.dao;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeid;
	
	@Column(name="employeename",length=50,nullable=false)
	@NotBlank(message="Employeename cannot be blank or null")
	private String employeename;
	
	@Column(name="employeemail",length=50,nullable=false,unique=false)
	@NotBlank(message="email cannot be blank or null")
	@Email(message="Enter valid email")//will check for @ and . symol
	@Email(message = "Invalid Email", regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	private String employeeemail;
	
	@NotBlank(message="employeeno cannot be blank or null")
	@Pattern(message = "Invalid Phone Number", regexp = "^[6-9]\\d{9}$") 
	private String employeephno;
	
	@Min(value=1000,message="Minimum salary is 1000")
	@Max(value=100000,message="maximum salary is 100000")
	private float employeesalary;
	
	@FutureOrPresent(message="Date must be todays date or future date")
	private Date employeejoiningdate;
	
//	@Past
//	private Date employeedob;
	
	//Many employees one work under department
	@JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentid",referencedColumnName = "departmentid")
    Department dept;
    

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeename, String employeeemail, String employeephno, float employeesalary,
			Date employeejoiningdate) {
		super();
		this.employeename = employeename;
		this.employeeemail = employeeemail;
		this.employeephno = employeephno;
		this.employeesalary = employeesalary;
		this.employeejoiningdate = employeejoiningdate;
	}

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeeemail() {
		return employeeemail;
	}

	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}

	public String getEmployeephno() {
		return employeephno;
	}

	public void setEmployeephno(String employeephno) {
		this.employeephno = employeephno;
	}

	public float getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(float employeesalary) {
		this.employeesalary = employeesalary;
	}

	public Date getEmployeejoiningdate() {
		return employeejoiningdate;
	}

	public void setEmployeejoiningdate(Date employeejoiningdate) {
		this.employeejoiningdate = employeejoiningdate;
	}
	
	//setter and getter method for deparment list
	//when we want to create a reference
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeemail="
				+ employeeemail + ", employeephno=" + employeephno + ", employeesalary=" + employeesalary
				+ ", employeejoiningdate=" + employeejoiningdate + "]";
	}

	public void assignEmployeeToDepartment(Department dept2) {
		this.dept=dept2;
		
	}

	
	
}
