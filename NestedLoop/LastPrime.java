package com.java;

public class LastPrime {
 
		public static void main(String[] args) {
	 int c=0, pc=0;
		for(int num=100;num>=1;num--) { //1 2 3 ............100
		   c=0;
			for(int i=1;i<=num;i++) {
	    	if(num%i==0) {
	    		c++;
	    	}
	    }
	    if(c==2) {
	    	System.out.print(num+ " ");
	    	pc++;
	    	if(pc==5)
	    		break;
	    	
	    }

		}
	  }
	}