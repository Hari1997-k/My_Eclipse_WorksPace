package com.java.pojo;

public class Employee {

	private int eid ;
	private String ename ;
	private String designation ;
	
	public Employee () {
		
	}
	
	public Employee(int eid, String ename, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
