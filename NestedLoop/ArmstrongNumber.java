package com.java;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num,d,result=0,n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		
		int orgnum = num; 
				
		//to calculate number of digits
		while(num>0) {
			n++;
			num=num/10;
		}
		
		//to check number is armstrong number
		num = orgnum;
		
		while(num>0) {
			d=num%10;
			result=(int) (result+Math.pow(d, n));
			num = num/10;
		}
		
		if(orgnum == result) {
			System.out.println(orgnum+" is armstrong number");
		}else {
			System.out.println(orgnum+" is not armstrong number");
		}
		
	}
}
