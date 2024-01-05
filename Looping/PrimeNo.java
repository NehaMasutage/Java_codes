package com.eduLooping;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scanner.nextInt();

		int flag=0;
		for(int i=2;i<a;i++) {

			if(a%i==0) {
				flag=1;
			}}

		if(flag==1) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
		}
	}