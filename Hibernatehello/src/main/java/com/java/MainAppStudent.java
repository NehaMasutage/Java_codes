package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainAppStudent {

	public static void main(String[] args) {
		
		//step 1
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		
		//step2
		SessionFactory sf=config.buildSessionFactory();
		Session session = sf.openSession();
		
		//step3
		
		Transaction tx= session.beginTransaction();
		Student st=new Student();
		//For Create
		//st.setStudentId(1);
		//st.setStudentName("Neha");
		//For Update
		st.setStudentId(2);
		st.setStudentName("Shreya");
		session.save(st); 
		tx.commit();
		session.close();
		
	}

}