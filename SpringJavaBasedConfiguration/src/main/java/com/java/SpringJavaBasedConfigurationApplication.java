package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.controller.Student;

@SpringBootApplication
public class SpringJavaBasedConfigurationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringJavaBasedConfigurationApplication.class, args);
	
	   Student sobj = (Student)context.getBean("stobj");
	   System.out.println(sobj);
	   sobj.displayDetails();
	}

}
