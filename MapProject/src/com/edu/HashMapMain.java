//unique key
//value can repeat
//HashMap will not maintain the order
package com.edu;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<Integer,String> hob= new HashMap<Integer,String>();

		hob.put(6,"neha");
		hob.put(4,"sanika");
		hob.put(1,"sofiya");
		hob.put(8,"swetha");

		System.out.println(hob);

		//create a HashMap which stores Phone(mob 10 digit) no and names
		
		HashMap<Long,String> hp1 = new HashMap<Long, String>();
		hp1.put(8932314562l, "purva");
		hp1.put(8232314562l, "harshada");
		hp1.put(9932314562l, "shreya");
		hp1.put(2932314562l, "swati");
		
		System.out.println(hp1);
		
		

	}

}