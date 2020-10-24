package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Emp {

	@Id
	private int ecode;
	private String ename;
	private int sal;
	@ManyToMany
	private List<Project> project;

	@OneToOne
	private Laptop laptop;

	
	
	public Emp(List<Project> project) {
		super();
		this.project = project;
	}

	public Emp(int ecode, String ename, int sal, List<Project> project) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
		this.project = project;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	public Emp(int ecode) {
		super();
		this.ecode = ecode;
	}

	

	@Override
	public String toString() {
		return "Emp [ecode=" + ecode + ", ename=" + ename + ", sal=" + sal + ", project=" + project + "]";
	}

	public Emp() {
		super();
	}

	public Emp(int ecode, String ename, int sal, Laptop laptop) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}

	public int getEcode() {
		return ecode;
	}

	public void setEcode(int ecode) {
		this.ecode = ecode;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	
	
	
}
