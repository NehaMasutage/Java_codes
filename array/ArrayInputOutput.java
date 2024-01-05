package com.edu.array;

import java.util.Scanner;

public class ArrayInputOutput {

	public static void main(String[] args) {
		//int a[] = new int[5];
		int a[]; //default values of array 0
		int size;
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		Scanner scanner = new Scanner(System.in);
		//input array elements
		
		System.out.println("Enter size of an Array");
		size = scanner.nextInt();
		a=new int[size];
		
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		
		//Display
		System.out.println("Array elements are ");
		//for(int i =0; i<a.length;i++) {
		for(int i:a) { //for each
			//System.out.println(a[i]);
			System.out.println(i);
		}
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("minimum number is "+min);
	
	}
	
	
	

}