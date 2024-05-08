package com.edu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException {
	 //reading byte as character
		Employee e1 = null;
		try {
			FileInputStream fi = new FileInputStream("Employee.txt");
			ObjectInputStream inp = new ObjectInputStream(fi);
			e1=(Employee)inp.readObject();
			inp.close();
		}catch(ClassNotFoundException c){
			c.printStackTrace();
		}
		System.out.println("Deserialization data of Employee is: ");
		System.out.println("Id:"+e1.id);
		System.out.println("name:"+e1.name);
		System.out.println("address:"+e1.address);
	}

}
