 package com.eduLooping;
 
import java.util.Scanner;

public class Palindrome {

	 public static void main(String args[]){
	
		 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the number : ");
		 int n = sc.nextInt();
		
		  int r,sum=0,temp;    
		  temp=n;		  
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }
		  
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}  
}  
