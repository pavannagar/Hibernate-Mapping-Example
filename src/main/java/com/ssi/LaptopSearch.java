package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopSearch {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Laptop laptop=(Laptop) session.get(Laptop.class, "l1");
		
		System.out.print(laptop);
		System.out.print(laptop.getEmp().getEcode());
		System.out.print(laptop.getEmp().getEname());
		System.out.print(laptop.getEmp().getSal());
		
		session.close();
		
	}

}
