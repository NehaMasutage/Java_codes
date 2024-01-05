package com.eduLooping;

import java.util.Scanner;

public class PrimeFromOnetoN {

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the limit=");
	int n=sc.nextInt();
	int flag,j;
	
	for(int i=1;i<=n;i++) {
		if(i==1||i==0)
			continue;

		flag=1;
		
		for(j=2;j<=i/2;j++) {

			if(i%j==0) {
				flag=0;
				break;
			}
		}

		if(flag==1)
			System.out.println(i);
	}
}
}