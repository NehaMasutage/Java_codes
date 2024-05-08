package com.java.service;
import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza {

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return "NonVegpizza";
	}
	

}