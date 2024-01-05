package com.edu.constmt;

import java.util.Scanner;

public class GradeMain {
	int marks; //instance variable
		
	void inputMarks() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Marks");
		marks = scanner.nextInt();
	}
	/*
	 * marks  (i/p)            Grade(O/P)
		80 - 100             Grade A
		60 - 79               Grade B
		40-59                 Grade C
		0-39                    fail
less than 0 and more than 100 invalid input
	
	 */
	void dispalyGrade() {
		if(marks <0 || marks >100) {
			System.out.println("Invlaid input (marks should be in range 0 to 100");
		}
		else if(marks>=80 && marks<=100) {
			System.out.println("Grade A");
		}else if(marks>=60 && marks<=79) {
			System.out.println("Grade B");
		}else if(marks>=40 && marks<=50) {
			System.out.println("Garde C");
		}else if(marks>=0 && marks<=39) {
			System.out.println("Fail");
		}
		
	}
public static void main(String[] args) {
		GradeMain gradeobj = new GradeMain();
		gradeobj.inputMarks();
		gradeobj.dispalyGrade();
	}

}
