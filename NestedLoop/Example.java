package com.java;
import java.util.Scanner;

//1/1!+2/2!+3/3!+4/4!+......+n/n!
public class Example {
	public static double factorial(int i) {
		if(i==1) {
			return 1;
		}
		return i*factorial(i-1);
		
	}
	public static double calculateSum(int N) {
		double sum=0;
		for(int i=1;i<=N;i++) {
			sum=sum+((double)i/factorial(i));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Terms: ");
		int N = sc.nextInt();
		
		System.out.println("The Sum of Series upto "+N+" terms is "+calculateSum(N));
	}
}
