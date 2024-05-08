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
		  config.addAnnotatedClass(Course.class);
		  config.addAnnotatedClass(Student.class);
		  
		  SessionFactory sf = config.buildSessionFactory();
		  Session session = sf.openSession();
		  Transaction tx = session.beginTransaction();
		  
		  Course c = new Course("Java Full Stack", 5000);
		  
		  Student s1 = new Student("Neha");
		  Student s2 = new Student("Shreya");
		  Student s3 = new Student("Snehal");
		  Student s4 = new Student("Joya");
		  
		  List<Student>slist = new ArrayList<Student>();
		  slist.add(s1);
		  slist.add(s2);
		  slist.add(s3);
		  slist.add(s4);
		  
          c.setStdlist(slist);
		  
		  session.save(c);		  
		  
		  tx.commit();
		  session.close();
		  
		  

	}

}
