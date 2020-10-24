package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchEmp {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Emp emp=(Emp) session.get(Emp.class, 113);
		
		System.out.print(emp);
		
		session.close();
		
		
	}

}
