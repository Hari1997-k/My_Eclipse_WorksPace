package Com.spring.SpringAutowireUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Employee {
	private int eid;
	private String ename;
	private Address address;
	public Employee() {
		
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Autowired
	public Employee(Address address) {
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	/*
	 * //AUTOWIRE BY PROPERTY:
	 * 
	 * @Autowired private Address address; public int getEid() { return eid; }
	 * public void setEid(int eid) { this.eid = eid; } public String getEname() {
	 * return ename; } public void setEname(String ename) { this.ename = ename; }
	 * 
	 * public Address getAddress() { return address; } //AUTOWIRE BY SEETTER:
	 * 
	 * @Autowired public void setAddress(Address address) { this.address = address;
	 * }
	 */
	public void show() {
		System.out.println("Employee [eid=" + eid + ", ename=" + ename + ", address=" + address);

	}

	
}
