package com.edu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Employee e = new Employee(101,"neha","sangli");
		try {
			FileOutputStream fo = new FileOutputStream("Employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(e);
			fo.close();
			System.out.println("Serialization data saved in Employee.txt");
		
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
}
