package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.dao.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	Employee findByEmployeeemail(String empemail);

	Employee findByEmployeephno(String empphno);

}
