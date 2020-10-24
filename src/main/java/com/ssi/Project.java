package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private String pcode;
	private String ptitle;
	private String client;
	@ManyToMany(mappedBy = "project")
	private List<Emp> emp;


	public Project() {
		super();
	}

	public Project(String pcode) {
		super();
		this.pcode = pcode;
	}

	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", client=" + client + ", emp=" + emp + "]";
	}
	
	public Project(List<Emp> emp) {
		super();
		this.emp = emp;
	}

	public Project(String pcode, String ptitle, String client) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.client = client;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPtitle() {
		return ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
	
	
	
}
