package com.java.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.dao.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
     
	@Query(value="select * from department where departmentname=?1" ,nativeQuery = true)
	Department getDepartmentByQuery(String dname);


//*************************************************************************************************
//*************************************************************************************************
	
//	@Modifying
//	@Transactional
//	@Query(value="select * from department where departmentname=?1" ,nativeQuery = true)
//	Department deleteRecordByDname(String dname);
//
//	@Query(value="select * from department where departmentname=?1 departmentlocation=?2" ,nativeQuery = true)
//	Department getDepartmentByNameAndLocation(String dname, String dlocation);
//
//	@Modifying
//	@Transactional
//	@Query(value="update department set departmentname=?2 where departmentid=?1")
//	String updateDepartmentName(Integer did, String dname);
//

}
