package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Card {

	@Id
	private String cno;
	private String ctype;
	private int climit;
	@ManyToOne
	private Account account;
	
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Card(String cno, String ctype, int climit, Account account) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.climit = climit;
		this.account = account;
	}

	public Card(String cno) {
		super();
		this.cno = cno;
	}

	public Card() {
		super();
	}
	
	public Card(String cno, String ctype, int climit) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.climit = climit;
	}
	
	@Override
	public String toString() {
		return "Card [cno=" + cno + ", ctype=" + ctype + ", climit=" + climit + "]";
	}

	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getClimit() {
		return climit;
	}
	public void setClimit(int climit) {
		this.climit = climit;
	}
	
	
	
	
	
}
