package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppOneToOne {

	public static void main(String[] args) {
		 
  Configuration config = new Configuration();
  config.configure();
  config.addAnnotatedClass(Course.class);
  config.addAnnotatedClass(Student.class);
  
  SessionFactory sf = config.buildSessionFactory();
  Session session = sf.openSession();
  
  Transaction tx = session.beginTransaction();
  
  //insert records into the table
  
  Course cobj = new Course("AWS" , 30000);
  session.save(cobj);
  
  Student sobj = new Student("Shreya", 21);
  sobj.setCourse(cobj);
  session.save(sobj);
  
  tx.commit();
  session.close();
	}

}
