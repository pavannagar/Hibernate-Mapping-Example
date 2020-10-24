package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CardEntry {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		/*
		 *			When unidirectional 
		 * 
		 * Card c1=new Card("c1", "P-D", 2023);
		*  Card c2=new Card("c2", "P-C", 2022);
		*  Card c3=new Card("c3", "G-D", 2024);
		*  Card c4=new Card("c4", "G-C", 2023);
		*  Card c5=new Card("c5", "S-D", 2022);
		*  Card c6=new Card("c6", "S-C", 2025);
		 
		*/
		
		
		Card c1=new Card("c1", "P-D", 2023,new Account(111));
		Card c2=new Card("c2", "P-C", 2022,new Account(112));
		Card c3=new Card("c3", "G-D", 2024,new Account(112));
		Card c4=new Card("c4", "G-C", 2023,new Account(111));
		Card c5=new Card("c5", "S-D", 2022,new Account(112));
		Card c6=new Card("c6", "S-C", 2025,new Account(111));
		
		Transaction tr=session.beginTransaction();
		
		session.save(c1); session.save(c2); session.save(c3); session.save(c4);session.save(c5);
		session.save(c6);
		
		tr.commit();
		session.close();
		System.out.print("saved");
		
	}

}
