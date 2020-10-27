package Com.spring.SpringComponentAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class Employee {
	@Value(value = "123456")
	private int eid;
	
	@Value(value = "HARI_KUNTRAPAKAM")
	private String ename;
	//@Value (value = "address")
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

	//@Autowired
	//@Qualifier("address1")
	@Resource
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return " Employee ; eid=" + eid + ", ename=" + ename + "\n address" + address;
	}

}
