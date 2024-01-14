package com.java;

public class HR {
public int hid;
public String hname;
private float hsalary;
protected int hage;
}

class Employee2{
private int eid;
private String ename;

public void empDisplay() {
	
	HR obj = new HR();
	System.out.println("HID = "+obj.hid); //hid is public, can access the package through creating an object
	System.out.println("HNAME = "+obj.hname);
	
//	System.out.println("HR age = "+hage);//protected data cannot be accessed
}
}
