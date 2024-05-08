package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.Department;
import com.java.dao.Employee;
import com.java.error.GlobalExceptionHandling;
import com.java.repository.DepartmentRepository;
import com.java.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
//Inject the object of EmployeeRepositoty
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) throws GlobalExceptionHandling {
		// TODO Auto-generated method stub
	Optional<Employee> empobj =	employeeRepository.findById(employeeId);
		
	if(empobj.isPresent()) {
		return employeeRepository.findById(employeeId).get();
	}
	throw new GlobalExceptionHandling("Employee with id = "+employeeId+"not exists");
	
//		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) throws GlobalExceptionHandling {
		Optional<Employee> empobj = employeeRepository.findById(employeeId);
		
		if(empobj.isPresent()) {
		  employeeRepository.deleteById(employeeId);
		}
		else {
		throw new GlobalExceptionHandling("Employee with id = "+employeeId+"not exists");
		}
	}

	@Override
	public Employee updateEmployeeById(Integer employeeId, Employee employee) throws GlobalExceptionHandling {
		
		Optional<Employee> empexistobj =employeeRepository.findById(employeeId);
//		System.out.println(empexistobj);
		Employee emp=null;
		if(empexistobj.isPresent()) {
			emp = employeeRepository.findById(employeeId).get();
			emp.setEmployeename(employee.getEmployeename());
			emp.setEmployeeemail(employee.getEmployeeemail());
			emp.setEmployeejoiningdate(employee.getEmployeejoiningdate());
			emp.setEmployeephno(employee.getEmployeephno());
			emp.setEmployeesalary(employee.getEmployeesalary());
			return employeeRepository.save(emp);
		}
		throw new GlobalExceptionHandling("Employee with id = "+employeeId+"not exists");
	}

	@Override
	public Employee getEmployeeByEmail(String empemail) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmployeeemail(empemail);
	}

	@Override
	public Employee getEmployeeByPhno(String empphno) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEmployeephno(empphno);
	}
	
	@Override
    public Employee assignEmployeeToDepartment(Integer departmentid, Integer employeeid) {
        
		//get department by id
		//get employee by id
		
        Employee emp=employeeRepository.findById(employeeid).get();
        Department dept=departmentRepository.findById(departmentid).get();
        
        emp.assignEmployeeToDepartment(dept);
        
        return employeeRepository.save(emp);
    }
	
	

}
