package Com.spring.SpringQualifierAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.*;

public class Employee {
	private int eid;
	private String ename;
	
	private Address address;

	public Employee() {

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
	@Autowired
	@Qualifier("address1")
	//instead of @autowire and @qualifier we can use resource annoatation which autowire the properties and we can overcome ambiguity of beans also
	//@Resource(name = "address1")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	
	

}
