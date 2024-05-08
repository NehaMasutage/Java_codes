package com.java.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.service.Pizza;

@Component
public class PizzaController {
   Pizza pizza;

   @Autowired
public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
	super();
	this.pizza = pizza;
}
   
   public String getPizza(){
	   return pizza.getPizza();
   }
   
   
   
}