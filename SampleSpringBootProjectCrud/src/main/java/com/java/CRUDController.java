package com.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {

	@Autowired
	MyCrudRepository crudRepository;
	
	@GetMapping("/testme")
	public String sampleMethod() {
		System.out.println("This is my spring boot prj");
		return "Hello Neha";
	}
	
	@GetMapping("/show")
	public List GetData() {
//		crudRepository.findAll();
		System.out.println("I am in a getdata method");
		System.out.println("I am in getdata method-> "+crudRepository.findAll().toString());
		return (List) crudRepository.findAll();
	}
	
	
	@PostMapping("/insert")
	public String AddData (@RequestBody MyCrudEntity crudEntity) {
		
		System.out.println("i am in AddData method");
		System.out.println("i am in AddData method"+crudEntity.toString());
		crudRepository.save(crudEntity);
		return "Data update successfully";
	}
	

}
