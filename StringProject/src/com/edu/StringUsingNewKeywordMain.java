package com.edu;

public class StringUsingNewKeywordMain {

	public static void main(String[] args) {
		String s1=new String("Hello"); //heap
		String s2=new String("Hello");
		
		if(s1==s2) {
			System.out.println("have same memory");
		}else {
			System.out.println("does not have same memory");
		}
		
		//to check contents
		if(s1.equals(s2)) {
			System.out.println("contents are same");
		}else {
			System.out.println("Contents are different");
		}

	}

}