package com.edu.array;

import java.util.Scanner;

public class AddElementLastPosition {
 public static void main(String[] args) {
	
	 int a[];
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter size of an array");
	 int size = sc.nextInt(); //5
	 
	 a = new int[size+1]; //6
	 
	 System.out.println("Enter "+(a.length-1)+" array Elements");
	 
	 for(int i=0;i<a.length-1;i++) {
		 a[i] = sc.nextInt();
	 }
	 
	 System.out.println("Enter the number to be added in an array at last");
	 int num = sc.nextInt();
	 
	 a[a.length-1]= num;
	 
	 //Display all array elements
	 System.out.println("The final Array is: ");
	 for(int i:a) {
		 System.out.println(i);
	 }
	 
	 
  }
}