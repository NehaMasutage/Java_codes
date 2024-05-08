package com.java.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class MainAppOneToMany {

	public static void main(String[] args) {
		 
		  Configuration config = new Configuration();
		  config.configure("hibernate.cfg.xml");
		  config.addAnnotatedClass(Department.class);
		  config.addAnnotatedClass(Employee.class);
		  
		  SessionFactory sf = config.buildSessionFactory();
		  Session session = sf.openSession();
		  Transaction tx = session.beginTransaction();
		  
//		  Department dept = new Department("cse","pune");
		  Department dept = new Department("E&tc","banglore");
		  
		  Employee e1 = new Employee("Neha",21,60000);
		  Employee e2 = new Employee("Shreya",22,50000);
		  Employee e3 = new Employee("Komal",21,60090);
		  Employee e4 = new Employee("Snehal",23,7000);
		  Employee e5 = new Employee("Joya",24,45400);
		  
		  List<Employee>elist = new ArrayList<Employee>();
		  elist.add(e1);
		  elist.add(e2);
		  elist.add(e3);
		  elist.add(e4);
		  elist.add(e5);
		  
		  dept.setEmplist(elist);
		  
		  session.save(dept);		  
		  
		  tx.commit();
		  session.close();
		  
	}

}
