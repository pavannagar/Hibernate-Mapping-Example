package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountEntry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		/*
		     When Unidirectional-----this code ----
		     
		List<Card> list1=new ArrayList<Card>();
		list1.add(new Card("c1"));list1.add(new Card("c3"));list1.add(new Card("c2"));
		List<Card> list2=new ArrayList<Card>();
		list2.add(new Card("c4"));list2.add(new Card("c5"));list2.add(new Card("c6"));
				
		Account a1=new Account(111, 6000, "Pavan", list1);
		Account a2=new Account(112, 6000, "Pavan", list2);
		
		*/
		
		Account a1=new Account(111, 6000, "Pavan");
		Account a2=new Account(112, 7000, "nagar");
		
		
		Transaction tr=session.beginTransaction();
			
		session.save(a1);
		session.save(a2);
		
		tr.commit();
		session.close();

		System.out.print("saved");
	}

}
