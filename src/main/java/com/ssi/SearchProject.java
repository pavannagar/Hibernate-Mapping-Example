package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchProject {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Project p=(Project) session.get(Project.class, "p6");
		List<Emp> emp=p.getEmp();
		System.out.println(p);
		System.out.println("________________");
		System.out.println(emp);
		
		session.close();
	}

}
