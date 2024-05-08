package com.edu;

import java.util.HashMap;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		String str ="edubridge";
		
		//occurance of char
		char[] charArray = str.toCharArray();
		
		HashMap<Character, Integer> charOccuranceMap = new HashMap<>();
		
		for(char c: charArray) {
			charOccuranceMap.put(c,charOccuranceMap.getOrDefault(c,0)+1);
		}
		
		System.out.println("Character Occurance");
		for (char c: charOccuranceMap.keySet()) {
			System.out.println(c+" : "+charOccuranceMap.get(c));
		}
	}
}
