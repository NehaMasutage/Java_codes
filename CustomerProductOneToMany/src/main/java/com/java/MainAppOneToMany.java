package com.java;

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
		  config.addAnnotatedClass(Product.class);
		  config.addAnnotatedClass(Customer.class);
		  
		  SessionFactory sf = config.buildSessionFactory();
		  Session session = sf.openSession();
		  Transaction tx = session.beginTransaction();
		  
		  Product p = new Product("Laptop", 60000);
		  
		  Customer c1 = new Customer("Neha");
		  Customer c2 = new Customer("Shreya");
		  Customer c3 = new Customer("Snehal");
		  Customer c4 = new Customer("Joya");
		  
		  List<Customer>clist = new ArrayList<Customer>();
		  clist.add(c1);
		  clist.add(c2);
		  clist.add(c3);
		  clist.add(c4);
		  
          p.setCustomerlist(clist);
		  
		  session.save(p);		  
		  
		  tx.commit();
		  session.close();
		  
		  

	}

}
