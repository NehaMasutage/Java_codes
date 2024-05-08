package com.edu;

import java.io.Serializable;

public class Employee implements Serializable{
	
    String name,address;
    int id;
    public Employee(int id, String name,String address) {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
	 
}
