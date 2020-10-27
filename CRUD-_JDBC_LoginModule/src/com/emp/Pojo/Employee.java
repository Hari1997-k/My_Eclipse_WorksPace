package com.emp.Pojo;

import java.util.Date;

public class Employee {
	
	private int eid ;
	private String ename ;
	private String erole ;
	private String email;
	private String password ;
	private Date jdate ;
	private Date rdate ;
	
	public Employee () {
		
	}

	public Employee(int eid, String ename, String erole, String email, String password, Date jdate, Date rdate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.erole = erole;
		this.email = email;
		this.password = password;
		this.jdate = jdate;
		this.rdate = rdate;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getErole() {
		return erole;
	}

	public void setErole(String erole) {
		this.erole = erole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getJdate() {
		return jdate;
	}

	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	

	
	
	

}
