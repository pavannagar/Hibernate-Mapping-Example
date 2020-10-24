package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		
		Project p11=new Project("p5", "Ecomerce", "amazon");
		Project p12=new Project("p6", "ecom", "amazon");
		Project p13=new Project("p7", "ecom", "amazon");
				
		Transaction tr=session.beginTransaction();
		session.save(p11); session.save(p12);session.save(p13); 
		
		tr.commit();
		session.close();

		System.out.print("Data saved ");
		
	}

}
