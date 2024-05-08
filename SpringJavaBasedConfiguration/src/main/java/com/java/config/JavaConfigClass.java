package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.controller.Student;

@Configuration
public class JavaConfigClass {

	@Bean(name="stobj")  //<bean id = "stobj" class=" com.java.Student">
	public Student getStudent() {
		return new Student();
	}
}
