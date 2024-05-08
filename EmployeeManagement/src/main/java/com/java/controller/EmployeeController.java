package com.java.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.dao.Employee;
import com.java.error.GlobalExceptionHandling;
import com.java.service.EmployeeService;

@RestController
public class EmployeeController {
//inject an object reference EmployeeService interface
	
	@Autowired
	private EmployeeService employeeService;
	
	/*
	  http://localhost:8990/saveEmployee
	   
	 */
	//"insert record"//
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
     }
	
	//getAllEmployee 
	//getEmployeeById
	//deleteEmployeeById
	//updateEmployeeById
	
	//select * from employee
	/*
	 http://localhost:8990/getAllEmployee
	 */
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
		
	}
	/*
	 http://localhost:8990/getEmployeeById/1
	 
	 select * from employee where employeeid=1;
	 */
	@GetMapping("/getEmployeeById/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") Integer employeeId) throws GlobalExceptionHandling {
		return employeeService.getEmployeeById(employeeId);
		
	}
	
	//delete record by id
	
	@DeleteMapping("/deleteEmployeeById/{eid}")
	public String deleteEmployeeById(@PathVariable("eid") Integer employeeId) throws GlobalExceptionHandling {
		employeeService.deleteEmployeeById(employeeId);
		return "Employee with id="+employeeId+" is deleted";
		
	}
	
	//update employee by id
	
	// http://localhost:8990/updateEmployeeById/1
	@PutMapping("/updateEmployeeById/{eid}")
	public Employee updateEmployeeById(@PathVariable("eid") Integer employeeId, @RequestBody Employee employee) throws GlobalExceptionHandling {
		return employeeService.updateEmployeeById(employeeId,employee);
		
	}
	
	
	//based on email id
	// http://localhost:8990/getEmployeeByEmail/shreya@gmail.com
	@GetMapping("/getEmployeeByEmail/{email}")
	public Employee getEmployeeByEmail(@PathVariable("email") String empemail) {
		return employeeService.getEmployeeByEmail(empemail);
	}
	
	
	//based on phone no
	// http://localhost:8990/getEmployeeByPhno/9876543201
	@GetMapping("/getEmployeeByPhno/{phno}")
	public Employee getEmployeeByPhno(@PathVariable("phno") String empphno) {
		return employeeService.getEmployeeByPhno(empphno);
	}
	
//	/////////////////////////////////////////////////////////////////////////////////////////////
////Assign employee to particular department
//    
//    /* http://localhost:8890/assignemployee/1/department/2  */
//    
//    @PutMapping("/assignemployee/{eid}/department/{deptid}")
//    public Employee assignEmployeeToDepartment(@PathVariable("eid") Integer employeeid, @PathVariable("deptid") Integer departmentid) {
////        System.out.println("assignEmployeeToDepartment");
//        return employeeService.assignEmployeeToDepartment(departmentid,employeeid);
//    }
//	
	
	
}
