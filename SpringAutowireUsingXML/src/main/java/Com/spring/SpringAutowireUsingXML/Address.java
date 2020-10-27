package Com.spring.SpringAutowireUsingXML;

public class Address {
	private String doorno;
	private String street;
	private String City;
	public Address() {
		
	}
	
	public Address(String doorno, String street, String city) {
		super();
		this.doorno = doorno;
		this.street = street;
		City = city;
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
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", City=" + City + "]";
	}
	
	

}
