package com.java.pojo;

public class Student {
private int sid ;
private String sname ;
private String sbranch ;
private String saddress ;
public Student() {
	
}


public Student(int sid, String sname, String sbranch, String saddress) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sbranch = sbranch;
	this.saddress = saddress;
}


public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSbranch() {
	return sbranch;
}
public void setSbranch(String sbranch) {
	this.sbranch = sbranch;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}


}
