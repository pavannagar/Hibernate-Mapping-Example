package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchCards {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Card c=(Card) session.get(Card.class, "c1");
		System.out.print(c);
		System.out.print(c.getAccount().getAno());
		System.out.print(c.getAccount().getBalance());
		System.out.print(c.getAccount().getName());
		
		session.close();
	}

}
