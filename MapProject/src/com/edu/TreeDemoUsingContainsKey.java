package com.edu;

//it maintian the order ..
//it acceept the doubplicate value but not Key..
//sorted by key ..
 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeDemoUsingContainsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	 TreeMap<Integer, String> obj = new TreeMap<Integer ,String>	();
		
		obj.put(101,"Amit");
		obj.put(105,"Samir");
		obj.put(104,"juber");
		obj.put(103,"Sanket");
		obj.put(102,"Sourabh");

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(obj.containsKey(n)) {
			System.out.println("This id belong to :"+obj.get(n));
		}else {
			System.out.println("it is not valid");
		}
		
		
		
	}

}