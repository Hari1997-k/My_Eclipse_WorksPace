package com.SpringHibe.SpringHibeIntegration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
public class Employee {
	@Id
	private int eid ;
	private String ename ;
	private String erole ;
	
	public Employee () {
		
	}

	public Employee(int eid, String ename, String erole) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.erole = erole;
	}

	public  int getEid() {
		return eid;
	}

	public  void setEid(int eid) {
		this.eid = eid;
	}

	public  String getEname() {
		return ename;
	}

	public  void setEname(String ename) {
		this.ename = ename;
	}

	public  String getErole() {
		return erole;
	}

	public  void setErole(String erole) {
		this.erole = erole;
	}
	
	
	
	
	

}
