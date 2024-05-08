package com.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	int i = 0;
	int j = 0;
	
	@GetMapping("/xyz")
	public String mymethod() {
		
		System.out.println("Hello I am from MyMethod");
		return "Hello Spring Boot";
	}
	
	@GetMapping("/inc")
	public int Increament() {
		
		i = i + 1;
		return i;
	}
	
	@PostMapping("/add/{j1}")
	public void InsertData(@PathVariable ("j1") Integer j1) {
		System.out.println("j="+j);
		System.out.println("j1="+j1);
		
		j = j + j1;
		 
	}
	
	@GetMapping("/show")
	public int ShowValue() {
		System.out.println("j="+j);
		return j;
	}

}
