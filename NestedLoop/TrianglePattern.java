package com.java;

public class TrianglePattern {

	public static void main(String[] args) {
     	int r1 = 3, r2 = 2, r3 = 4;
     	
     	for(int i=1;i<=r1;i++) {
     		//no of blanks
     		for(int b=1;b<=r1-i;b++) {
     			System.out.print(" ");
     		}
     		
     		//print digits of triangle
     		for(int j=1;j<=i;j++) {
     			System.out.print(i+" ");
     		}
     		
     		System.out.println();
     	}
     	
     	//second Triangle
     	for(int i=1;i<=r2;i++) {
     		//no of blanks
     		for(int b=1;b<=r2-i;b++) {
     			System.out.print(" ");
     		}
     		
     		//print digits of triangle
     		for(int j=1;j<=i;j++) {
     			System.out.print(i+" ");
     		}
     		
     		System.out.println();
     	}
//third triangle
     	for(int i=1;i<=r3;i++) {
     		//no of blanks
     		for(int b=1;b<=r3-i;b++) {
     			System.out.print(" ");
     		}
     		
     		//print digits of triangle
     		for(int j=1;j<=i;j++) {
     			System.out.print(i+" ");
     		}
     		
     		System.out.println();
     	}

	}

}