package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurranceOfCharacter1 {

	public static void main(String[] args) {
		String s="edubridge";
		//occurrence of a char
		
		//convert String to list of char
		
		ArrayList<Character> clist = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			clist.add(s.charAt(i));
		}
		
		System.out.println(clist);
		
		HashMap<Character, Integer>hp1= new HashMap<Character, Integer>();
		
		for(int i=0;i<clist.size();i++) {
		   hp1.putIfAbsent(clist.get(i),Collections.frequency(clist, clist.get(i)));
		}
		
	  //display occurrence
		
	for(Map.Entry<Character, Integer> mpobj:hp1.entrySet()) {
		System.out.println(mpobj.getKey()+"--->"+mpobj.getValue());
	}
		
	}

}