package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		configure.addAnnotatedClass(Product.class);
		
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		Product p = new Product(); //transiant state obj in heap memory
//		p.setProductId(1);
//		p.setProductName("cloths");
//		p.setProductPrice(500f);
//		session.save(p); //persistant state

System.out.println(p);
		Product p1 = session.get(Product.class,1);
		System.out.println(p1);
		if(p1!=null) {
			session.delete(p1);
			
		}else {
			System.out.println("Record not exist");
		}
		tx.commit();
		session.close();
		
//		Product product=session.get(Product.class,1);
//		System.out.println(product.getProductName()+"\n"+product.getProductPrice());
//		session.close();
	}

}