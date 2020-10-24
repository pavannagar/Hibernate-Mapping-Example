package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchAccount {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Account ac=(Account) session.get(Account.class, 111);
		
		System.out.print(ac);
	}

}
