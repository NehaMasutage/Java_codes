package com.edu;

public class CountVowelsEx {
	public static void main(String[] args) {
		String s ="hello how are you?";
		int countV = 0;
		int countW = 1;//initially assume at least 1 word is present
		int countL = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countV++;
			}
		}
		System.out.println("Number of vowels are: "+countV);
		
		
		for(int j = 0; j< s.length();j++) {
			if(Character.isWhitespace(s.charAt(j))) {
				countW++;
			}
		}
		System.out.println("Number of Words are: "+countW);
		

		for(int k = 0; k< s.length();k++) {
			if(Character.isLetter(s.charAt(k))) {
				countL++;
			}
		}
		System.out.println("Number of Letters are: "+countL);
	}
}
