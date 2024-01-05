 package com.eduLooping;

import java.util.Scanner;

public class Armstrong {

	    public static void main(String[] args) {

	    			Scanner sc = new Scanner(System.in);
	    			System.out.print("Enter number : ");
	    			int n = sc.nextInt();

	    			int temp = n;
	    			int sum = 0;	    			
	    			while(temp > 0) {
	    				int rem = temp % 10;
	    				sum = sum + rem * rem * rem;
	    				temp /= 10;
	    			}	    			
	    			if(n == sum) {
	    				System.out.println(n  + " is Armstrong number");
	    			}
	    			else {
	    				System.out.println(n  + " is not a Armstrong number");	
	    			}
	   			}
	    	}