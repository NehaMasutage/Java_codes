package com.java1;

import com.java.HR;

public class Employee1 extends HR{
private int eid;
private String ename;

public void empDisplay() {
	
	HR obj = new HR();
	System.out.println("HID = "+obj.hid); //hid is public, can access the package through creating an object
	System.out.println("HNAME = "+obj.hname);
	
	System.out.println("HR age = "+hage);//protected data cannot be accessed
}
}
