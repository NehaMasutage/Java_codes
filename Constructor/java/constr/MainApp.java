package com.java.constr;

class Parent1{
private int i;
	public Parent1(int i) {
		super();
		System.out.println("Parent1 constructor i="+i); //i=10
	}
}

class Child1 extends Parent1{

	public Child1(int i) {
		super(i);
		System.out.println("Child1 class constructor");
	}
	
//	public Child1(String s) {
//		System.out.println("One arg constr");
//	}
}

class Child2 extends Child1{

	public Child2(int i) {
		super(i);
		System.out.println("Child2 class constructor");
	}
	
}

public class MainApp {
public static void main(String[] args) {
	Child2 cob= new Child2(10);
	
	//Parent1 pob = new Parent1(10); // dont do this
}
}