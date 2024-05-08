package com.java.service;

import java.util.List;

import com.java.dao.Employee;
import com.java.error.GlobalExceptionHandling;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(Integer employeeId) throws GlobalExceptionHandling;

	public void deleteEmployeeById(Integer employeeId) throws GlobalExceptionHandling;

	public Employee updateEmployeeById(Integer employeeId, Employee employee) throws GlobalExceptionHandling;

	public Employee getEmployeeByEmail(String empemail);

	public Employee getEmployeeByPhno(String empphno);

	public Employee assignEmployeeToDepartment(Integer departmentid, Integer employeeid);

}
