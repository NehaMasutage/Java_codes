package com.edu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapMain {

	public static void main(String[] args) {
		//it maintains the order
		LinkedHashMap<Long, String> lmp = new LinkedHashMap<Long,String>();
		lmp.put(8932314562l, "Juber");
		lmp.put(8232314562l, "Pronti");
		lmp.put(9932314562l, "Amit");
		lmp.put(2932314562l, "Rutuja");
		


		System.out.println(lmp);
		
		//using forEach
		
		for(Map.Entry<Long, String> mobj :lmp.entrySet()) {
			System.out.println(mobj.getKey()+"\t"+mobj.getValue());
		}
		
		//input phone number check if it exists, display the name
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone no");
		long ph = sc.nextLong();
		int fl=1;
		for(Map.Entry<Long, String> mobj :lmp.entrySet()) {
			  long phone=mobj.getKey();
			  if(ph==phone) {
				  System.out.println("This phone no belongs to :"+mobj.getValue());
				  fl=0;
				  break;
			  }
			  
			}
			if(fl==1) {
				System.out.println("phone no not exists");
			}
			
		}

	}