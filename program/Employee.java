package com.edu.pack2;

public class Employee {
private int eid;
private String ename;

public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
@Override
public String toString() {
	return "Student [eid=" + eid + ", ename=" + ename + "]";
}
}

