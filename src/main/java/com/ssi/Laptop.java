package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private String lcode;
	private String brand;
	private int price;
	
	@OneToOne(mappedBy = "laptop")//bi-directional
								//if unidirectional then remove this @oneToOne
	private Emp emp;

	
	
	public Laptop() {
		super();
	}



	public Laptop(String lcode) {
		super();
		this.lcode = lcode;
	}



	@Override
	public String toString() {
		return "Laptop [lcode=" + lcode + ", brand=" + brand + ", price=" + price + "]";
	}



	public Laptop(String lcode, String brand, int price, Emp emp) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.price = price;
		this.emp = emp;
	}



	public String getLcode() {
		return lcode;
	}



	public void setLcode(String lcode) {
		this.lcode = lcode;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Emp getEmp() {
		return emp;
	}



	public void setEmp(Emp emp) {
		this.emp = emp;
	}



	
	
	
	
	
	
	
	
}
