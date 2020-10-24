package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Account {

	@Id
	private int ano;
	private int balance;
	private String name;
	@OneToMany(mappedBy = "account")
	private List<Card> card;

	
	
	public Account() {
		super();
	}



	public Account(int ano) {
		super();
		this.ano = ano;
	}



	public Account(int ano, int balance, String name) {
		super();
		this.ano = ano;
		this.balance = balance;
		this.name = name;
	}



	public Account(int ano, int balance, String name, List<Card> card) {
		super();
		this.ano = ano;
		this.balance = balance;
		this.name = name;
		this.card = card;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Card> getCard() {
		return card;
	}



	public void setCard(List<Card> card) {
		this.card = card;
	}



	@Override
	public String toString() {
		return "Account [ano=" + ano + ", balance=" + balance + ", name=" + name + ", card=" + card + "]";
	}
	
	
	
}
