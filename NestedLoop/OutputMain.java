package com.java;

public class OutputMain {

	public static void main(String[] args) {
	  int num=98;
	  int n=0;
	  
//	  for(; num>0; num=num/10,n++);
//	  System.out.println(n);
	  
	  while(num>0) {
		  n++; //n=n+1;
		  num=num/10;
	  }
	  System.out.println("Number of digits "+n);

	}

}