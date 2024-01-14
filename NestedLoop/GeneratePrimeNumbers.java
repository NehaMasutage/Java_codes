package com.java;

public class GeneratePrimeNumbers {
	public static void main(String[] args) {
		
		int c=0;
		for(int num=1;num<=100;num++) {
			c=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(num+ " ");
			}
		}
	}
}
