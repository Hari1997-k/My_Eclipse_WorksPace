package com.spring.model;

import java.util.List;

public class Employee {
	private int eid ;
	private String ename ;
	private String erole ;
	private Address EmpAddress ;
	public void setEmpAddress(Address empAddress) {
		EmpAddress = empAddress;
	}
	public Address getEmpAddress() {
		return EmpAddress;
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
	
	

}
