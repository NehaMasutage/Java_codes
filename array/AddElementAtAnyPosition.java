package com.edu.array;

import java.util.Scanner;

public class AddElementAtAnyPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size+1];
		System.out.println("Enter thr array Element");
		for ( int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element Position ");
		int p=sc.nextInt();
		System.out.println("Enter the element Element ");
		int e=sc.nextInt();
		
		
		for ( int i=size-1;i>=p-1;i--) {
				arr[i+1]=arr[i];	
		}
		arr[p-1]=e;
		for ( int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}