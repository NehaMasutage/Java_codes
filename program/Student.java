package com.edu.pack1;

public class Student {
private int sid;
String sname;

public Student(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}

private void studentData() {
	System.out.println("Student information");
}

public void display() {
	studentData();
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
}
