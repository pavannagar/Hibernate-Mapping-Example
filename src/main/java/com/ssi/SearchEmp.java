package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchEmp {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Emp emp=(Emp) session.get(Emp.class, 112);
		List<Project> project=emp.getProject();
		for(Project p:project) {
		
			//System.out.print(p.getClient());
			//System.out.print(p.getPtitle());
			System.out.println(p.getPcode());
		}
		
		System.out.println(emp);
		
		session.close();
		
		
	}

}
