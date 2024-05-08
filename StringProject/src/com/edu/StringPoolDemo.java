package com.edu;

public class StringPoolDemo {

	public static void main(String[] args) {
		String s1 = "hello"; //SCP
		String s2 = "hello";
		String s3 ="hello";
		
		if(s1==s2) {
			System.out.println("Both memory locations are same");
		}
		else {
			System.out.println("locations are not same");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Both strings are same");
		}
		else {
			System.out.println("They are not same");
		}
		

	}

}