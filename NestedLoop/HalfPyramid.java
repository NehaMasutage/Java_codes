package com.java;

public class HalfPyramid {
	public static void main(String[] args) {
		 
		int n=4;
		 
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(i); // 1 22 333 4444
//				System.out.print(j); 1 12 123 1234
			}
			System.out.println();
		}
	}
}
