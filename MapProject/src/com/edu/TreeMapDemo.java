package com.edu;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//sorts the elements in ascending based on key
				TreeMap<Long, String> lmp = new TreeMap<Long,String>();
				lmp.put(8932314562l, "Sadiya");
				lmp.put(8232314562l, "Revati");
				lmp.put(9932314562l, "Anuja");
				lmp.put(2932314562l, "Anjali");
				System.out.println(lmp);
				
	  //using forEach to iterate Map elements
			//Syntax
				//for(Map.Entry<K,V> obj:mapobj.entrySet()){}
			System.out.println("Name\tPhoneNo.");
			for(Map.Entry<Long, String> mpi:lmp.entrySet()) {
				System.out.println(mpi.getValue()+"\t"+mpi.getKey());
			}
	}

}