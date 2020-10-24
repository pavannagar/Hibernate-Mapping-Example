package com.ssi;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp_Entry {

	public static void main(String[] args) {
		
		
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Project p1=new Project("p5"); 
		Project p2=new Project("p6");
		Project p3=new Project("p7");
		
		
		List<Project> list1=new ArrayList<Project>(); list1.add(p1);list1.add(p2);
		List<Project> list2=new ArrayList<Project>(); list2.add(p2);list2.add(p3);
		
		
		Laptop laptop=new Laptop();
		
		Emp emp1=new Emp(111, "C", 50000,new Laptop("l3") );//for this you need to create a constructor 
		emp1.setProject(list1);											// In laptop jo sirf laptop ko initialize kr rha he
		Emp emp2 =new Emp(112, "D", 60000, new Laptop("l4"));
		emp2.setProject(list2);
		
		Transaction tr=session.beginTransaction();
		session.save(emp1); session.save(emp2); 
		
		tr.commit();
		session.close();

		System.out.print("Data saved ");
		
	}

}
