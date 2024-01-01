package com.edubridge;

import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		int age;
		String name;
		float salary;
		char gen;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		//name = scanner.next(); //string single word
		name = scanner.nextLine();//with the space more than one word
		
		System.out.println("Enter age");
		age = scanner.nextInt();
		
		System.out.println("Enter salary");
		salary = scanner.nextFloat();
		
		System.out.println("Enter gender (M/F)");
		gen = scanner.next().charAt(0);
		
		System.out.println("Employee Details ");
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("salary= "+salary);
		System.out.println("Gender= "+gen);
	}
}
