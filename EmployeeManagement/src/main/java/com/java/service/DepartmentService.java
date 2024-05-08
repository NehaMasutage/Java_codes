package com.java.service;

import java.util.List;

import com.java.dao.Department;

import com.java.error.GlobalExceptionHandling;


public interface DepartmentService {

public	Department saveDepartment(Department department);

public List<Department> getAllDepartments();

public Department getDepartmentById(Integer departmentid) throws GlobalExceptionHandling;

public void deleteDepartmentById(Integer departmentid) throws GlobalExceptionHandling;

public Department updateDepartmentById(Integer departmentid, Department department) throws GlobalExceptionHandling;

public Department getDepartmentByQuery(String dname);

Department deleteRecordByDname(String dname);

//public void getDepartmentByNameAndLocation();

public Department getDepartmentByNameAndLocation(String dname, String dlocation);

public String updateDepartmentName(Integer did, String dname);

}
