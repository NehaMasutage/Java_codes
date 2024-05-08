package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNo {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8,9,3,4,5};
		
		//add all the array element to list
		ArrayList<Integer> nlist = new ArrayList<Integer>();
		
		for(int i:a) {
			nlist.add(i);
		}
		
		System.out.println(nlist);
		
		//occurance
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nlist.size();i++) {
			hp.putIfAbsent(nlist.get(i),Collections.frequency(nlist,nlist.get(i)));
		}
		
		System.out.println(hp);
		
		for(Map.Entry<Integer, Integer> m: hp.entrySet()) {
			System.out.println(m.getKey()+"->"+m.getValue());
		}
	}

}
