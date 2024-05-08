package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringBootProjectApplication {

	public static void main(String[] args) {
		System.out.println("This is Start");
		SpringApplication.run(SampleSpringBootProjectApplication.class, args);
		System.out.println("This is End");
	}

}
