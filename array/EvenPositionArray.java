package com.edu.array;

import java.util.Scanner;

public class EvenPositionArray {

	public static void main(String[] args) {
		int a[]; //default values of array 0
		int size;
			
		Scanner scanner = new Scanner(System.in);
		//input array elements
		
		System.out.println("Enter size of an Array");
		size = scanner.nextInt();
		a=new int[size];
		
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		
		 System.out.println("Even position numbers are: ");
		for(int i=0;i<a.length;i++) {
			if((i+1)%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}