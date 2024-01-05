package com.edu.array;

class Student{
	int sid;
	String sname;
		
	public Student(int sid, String sname) {
//		super();    //calls object class constructor
		this();     //should be first line
		this.sid = sid;
		this.sname = sname;
		System.out.println("Present Object "+this);
	}

	public Student() {
		System.out.println("No argument constructor");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
}
public class ConstuctorDemoMain {

	public static void main(String[] args) {
		Student sob= new Student(10,"Manoj");
		
		Student sob1= new Student(11,"Sakshi");
		
		Student sob3 = new Student();
		
		
		System.out.println("Object of student sob="+sob);
		System.out.println("Object of student sob1="+sob1);
		
		System.out.println("Object of student sob3="+sob3);
		
		
		
		System.out.println("sid="+sob.sid);
		System.out.println("sname="+sob.sname);

	}

}