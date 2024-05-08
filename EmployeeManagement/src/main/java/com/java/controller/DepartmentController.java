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

import com.java.dao.Department;
import com.java.dao.Employee;
import com.java.error.GlobalExceptionHandling;
import com.java.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	/*  saveRecord
	http://localhost:8990/saveDepartment
	*/
	@PostMapping("/saveDepartment")
    public Department saveDepartment(@Valid @RequestBody Department department) {
		return departmentService.saveDepartment(department);
    	
    }
	
	
	/*
	 * get records
	 * 
	 * http://localhost:8990/getAllDepartments
	 */
	
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
		
	}
	
	
	/*
	 * get records
	 * 
	 * http://localhost:8990/getDepartmentById/1
	 */
	
	@GetMapping("/getDepartmentById/{deptid}")
	public Department getDepartmentById(@PathVariable("deptid") Integer departmentid) throws GlobalExceptionHandling{
		return departmentService.getDepartmentById(departmentid);
		
	}
	
	/*
	 * delete departmentby id
	 * 
	 * http://localhost:8990/deleteDepartmentById/1
	 */
	
	@DeleteMapping("/deleteDepartmentById/{deptid}")
	public String deleteDepartmentById(@PathVariable("deptid") Integer departmentid) throws GlobalExceptionHandling{
		 departmentService.deleteDepartmentById(departmentid);
		return "Department is deleted";
	}
	
	
	/*
	 * update departmentById
	 * 
	 * http://localhost:8990/updateDepartmentById/1
	 */
	
	@PutMapping("/updateDepartmentById/{deptid}")
	public Department updateDepartmentById(@PathVariable("deptid") Integer departmentid,@RequestBody Department department) throws GlobalExceptionHandling{
		return departmentService.updateDepartmentById(departmentid,department);
		
	}
	
//	//based on departmentname
//	@GetMapping("/getDepartmentByName/{name}")
//	public Department getDepartmentByName(@PathVariable("name") String empemail) {
//		return departmentService.getDepartmentByName(deptname);
//	}
//	
//	*************************************************************************
//	*************************************************************************
//	
//	//Native Query
//	@GetMapping("/getDepartmentByQuery/{dname}")
//	public Department getDepartmentByQuery(@PathVariable("dname") String dname) {
//		return departmentService.getDepartmentByQuery(dname);
//	}
//	
//	//delete record
//	@DeleteMapping("/deleteRecordByDname/{dname")
//	public Department deleteRecordByDname(@PathVariable("dname") String dname) {
//		return departmentService.deleteRecordByDname(dname);
//	}
//	
//	//fetch record by department name and location
//	@GetMapping("/getDepartmentByNameAndLocation/{dname}/{dlocation}")
//	public Department getDepartmentByNameAndLocation(@PathVariable("dname") String dname, @PathVariable("dlocation") String dlocation) {
//		return departmentService.getDepartmentByNameAndLocation(dname,dlocation);
//	}
//	
//	//update record by query method
//	@PutMapping("/updateDepartmentName/{did/{dname")
//	public String updateDepartmentName(@PathVariable("did") Integer did, @PathVariable("dname") String dname) {
//		departmentService.updateDepartmentName(did,dname);
//		return "update query";
//		
//	}
}