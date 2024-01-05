package com.edu.array;

import java.util.Scanner;

public class SecondLargestArray {

	public static void main(String[] args) {
		//int a[]= {5,7,1,9,4,2,89,23};
		
        int a[];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int size = scanner.nextInt();
		
		a = new int[size];
		
		System.out.println("Enter "+ size +" array elements ");
		
		for(int i=0;i<size;i++) {
			a[i] = scanner.nextInt();
		}
		
		//Largest element
		int max1,max2;
		
		max1=max2=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			
			//Do not use for Largest element
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		
		//add +max1 for largest element
		
		System.out.print("Second Largest element in an array = "+max2);
		
	}
	
	

}