package com.eduLooping;

import java.util.Scanner;

public class ArmstrongFromOnetoHundred {

	public static void main(String[] args) {
		int i,n,temp,rem,sum;
		for(i=1;i<=1000;i++) {
			temp=i;
			sum=0;
			while(temp!=0) {

				rem=temp%10;
				sum=sum+rem*rem*rem;
				temp=temp/10;
			}

			if(sum==i)
				System.out.println(i);
		}
	}
}