 package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainAppEmployee {

	public static void main(String[] args) {
		
		//step 1
		Configuration config = new Configuration();
		config.configure("hibernatelab1.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		
		//step2
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		//step3
		
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();

		emp.setEmpId(3);
		emp.setEmpName("Swati");
		emp.setEmpSalary(80000);
		session.save(emp); 
		tx.commit();
		session.close();
		
	}

}