package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.controller.PizzaController;

@SpringBootApplication
public class LooseCouplingUsingAnnotationApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LooseCouplingUsingAnnotationApplication.class, args);
      PizzaController obj = context.getBean(PizzaController.class);
      System.out.println(obj.getPizza());
	}

}
