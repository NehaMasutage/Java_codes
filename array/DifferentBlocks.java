package com.edu.array;

public class DifferentBlocks {
	
	static {
		System.out.println("static block1");
	}

	static {
		System.out.println("static block2");
	}
	
	DifferentBlocks(){
		System.out.println("Constructor is called on object creation");
	}
	
	{
		System.out.println("annonymous block1");
	
	}
	{
		System.out.println("annonymous block2");
	
	}
	public static void main(String[] args) {
		System.out.println("Main Block");
		DifferentBlocks obj = new DifferentBlocks(); //call Object constructor
	}

}