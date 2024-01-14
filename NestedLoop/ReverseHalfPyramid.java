package com.java;

public class ReverseHalfPyramid {
	public static void main(String[] args) {
		int n=4;
			 
		//outer loop
		for(int i=n; i>=1; i--) {
		//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(i); // 4444 333 22 1
//				System.out.print(j); 1234 123 12 1
			}
			System.out.println();
		}
	}
}


