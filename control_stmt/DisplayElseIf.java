package com.edu.constmt;

import java.util.Scanner;

public class DisplayElseIf {
	char grade;
	public void inputGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Grade");
		grade=sc.next().toUpperCase().charAt(0);
	
	}
	public void displayGrade() {
		if(grade=='A' || grade=='a') {
			System.out.println("Marks range is in between 80 to 100");
		}else if(grade=='B') {
			System.out.println("Marks range is in between 60 to 79");
		}else if(grade=='c') {
			System.out.println("Marks range is in between 40 to 59");
		}else if(grade=='F') {
			System.out.println("Marks range is in between 0 to 39");
		}else {
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) {
		DisplayElseIf d=new DisplayElseIf();
		d.inputGrade();
		d.displayGrade();
	}

}