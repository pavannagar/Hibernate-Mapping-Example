package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp_Laptop_Entry {

	public static void main(String[] args) {
		
		//Save data In Two tables at a one click
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Laptop l1=new Laptop(); 
		l1.setLcode("l1");
		l1.setBrand("hp");
		l1.setPrice(50000);
		
		Laptop l2=new Laptop(); 
		l2.setLcode("l2");
		l2.setBrand("dell");
		l2.setPrice(60000);
		
		
		Emp emp1=new Emp(111, "A", 50000,new Laptop("l1") );//for this you need to create a constructor // In laptop jo sirf laptop ko initialize kr rha he
		Emp emp2 =new Emp(112, "B", 60000, new Laptop("l2"));
		
		
		Transaction tr=session.beginTransaction();
		session.save(emp1); session.save(emp2); 
		session.save(l1);
		session.save(l2);
		tr.commit();
		session.close();

		System.out.print("Data saved ");
		
		
	}

}
