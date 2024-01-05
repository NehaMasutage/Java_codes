package com.edu.pack1;

import com.edu.pack2.Employee;

public class MainApp {
	public static void main(String[] args) {
		Student sob = new Student(10,"Neha");
		
		System.out.println(sob);
		sob.display();
		
		Employee eob = new Employee(23, "Sanika");
		System.out.println(eob);
	}
}
