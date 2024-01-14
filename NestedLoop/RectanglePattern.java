package com.java;

import java.util.Scanner;

public class RectanglePattern {
	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				//System.out.print(i+ " ");// 11111 22222 33333 44444
				System.out.print(j+ " "); //12345 12345 12345 12345
			}
			System.out.println();
		}
	}
}
