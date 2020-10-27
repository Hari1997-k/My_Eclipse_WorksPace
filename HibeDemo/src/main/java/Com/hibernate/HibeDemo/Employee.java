package Com.hibernate.HibeDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
@Id
private int eid ;
private String ename ;
private String erole;

public Employee() {
	// TODO Auto-generated constructor stub
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
