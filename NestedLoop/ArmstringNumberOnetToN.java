package com.java;

public class ArmstringNumberOnetToN {
	
		public static void main(String[] args) {
			for(int i=1;i<=1000;i++) {
			int num=i,d,result=0;
		 
			int orgnum=num,n=0;
			
			while(num>0) {
				n++;
				num /=10;
			}
	        
			num=orgnum;
			
			while(num>0) {
				d=num%10;
				result=(int)(result+Math.pow(d, n));
				num /=10;
				
			}
			
			if(orgnum==result) {
				System.out.println(orgnum);
			 
		      }
			
			}
		}
	}

/*package com.edu.nestedloop;

import java.util.Scanner;

public class PrintArmstrongNumbers {

	public static void main(String[] args) {
		
		System.out.println("All Armstrong numbers between 1 to 1000");
		for(int i=1;i<=1000;i++) {
			int num = i,d,result=0, n=0;
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("Enter number");
//			num = scanner.nextInt();
			//int num = i;
			int orgnum = num;
			
			//to calculate number of digits
			
			while(num>0) {
				n++;
				num = num/10;
			}
			
			//To Check number is armstrong number
			
			num = orgnum;
			
			while(num>0) {  //123>0
				d = num%10; //123%10=3
				result = (int) (result+Math.pow(d, n));
				num = num/10;
			}
			
			if(orgnum == result)
				//System.out.println(orgnum+" is Armstrong num");
				System.out.print(orgnum+" ");
				
//			else
//				System.out.println(orgnum+" is not Armstrong num");

		}

		}

	}
	*/
