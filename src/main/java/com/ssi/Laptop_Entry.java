package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Laptop_Entry {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Laptop l1=new Laptop(); 
		l1.setLcode("l3");
		l1.setBrand("hp");
		 l1.setPrice(50000);
		
		Laptop l2=new Laptop(); 
		l2.setLcode("l4");
		l2.setBrand("dell");
		l2.setPrice(60000);
		
		
		Transaction tr=session.beginTransaction();
		session.save(l1);
		session.save(l2);

	
		tr.commit();
		session.close();

		System.out.print("Data saved ");	
		
	}

}
