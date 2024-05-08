package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.Department;

import com.java.error.GlobalExceptionHandling;
import com.java.repository.DepartmentRepository;

@Service
public class DepartmentSeriveImpl implements DepartmentService{
	@Autowired
private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	@Override
	public Department getDepartmentById(Integer departmentid) throws GlobalExceptionHandling {
		Optional<Department> dept = departmentRepository.findById(departmentid);
		if(dept.isPresent()) {
			
		  return departmentRepository.findById(departmentid).get();
		}
		else {
		   throw new GlobalExceptionHandling("Department with id="+departmentid+" not found");
		}
		}
	@Override
	public void deleteDepartmentById(Integer departmentid) throws GlobalExceptionHandling {
		Optional<Department> dept = departmentRepository.findById(departmentid);
		if(dept.isPresent()) {
		departmentRepository.deleteById(departmentid);
		}
		else {
			   throw new GlobalExceptionHandling("Department with id="+departmentid+" not found");
			}
		
	}
	@Override
	public Department updateDepartmentById(Integer departmentid, Department newdeptobj) throws GlobalExceptionHandling {
		Optional<Department> olddeptobj = departmentRepository.findById(departmentid);
//		Department olddeptobj=departmentRepository.findById(departmentid).get();
		Department dept = null;
		if(olddeptobj.isPresent()) {
			dept = departmentRepository.findById(departmentid).get();
		    dept.setDepartmentname(newdeptobj.getDepartmentname());
			dept.setDepartmentlocation(newdeptobj.getDepartmentlocation());
			return departmentRepository.save(dept);
		}
		throw new GlobalExceptionHandling("Department with id="+departmentid+" not found");
		
	}
	
	@Override
	public Department getDepartmentByQuery(String dname) {
		// TODO Auto-generated method stub
		return departmentRepository.getDepartmentByQuery(dname);
	}
	@Override
	public Department deleteRecordByDname(String dname) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Department getDepartmentByNameAndLocation(String dname, String dlocation) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateDepartmentName(Integer did, String dname) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//****************************************************************************
//****************************************************************************
//	@Override
//	public Department deleteRecordByDname(String dname) {
//		// TODO Auto-generated method stub
//		return departmentRepository.deleteRecordByDname(dname);
//	}
//	@Override
//	public Department getDepartmentByNameAndLocation(String dname, String dlocation) {
//		// TODO Auto-generated method stub
//		return departmentRepository.getDepartmentByNameAndLocation(dname, dlocation);
//	}
//	@Override
//	public String updateDepartmentName(Integer did, String dname) {
//		// TODO Auto-generated method stub
//		return departmentRepository.updateDepartmentName(did,dname);
//	}
//	
//	

}
