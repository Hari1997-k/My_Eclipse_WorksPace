package Com.spring.SpringQualifierAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Address {
	private String doorno;
	private String street;
	private String city;
	
	public Address() {
		
	}

	public Address(String doorno, String street, String city) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.city = city;
	}
	
	
	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + "]";
	}
	
	

}
