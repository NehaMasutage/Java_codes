package com.edu;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "hello how are you?";
		
		String[] words = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			words[i] = reverse(words[i]);
		}

		String reversedSentence = String.join(" ", words);
		System.out.println(reversedSentence);
		
	}
	static String reverse(String s) {
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
}