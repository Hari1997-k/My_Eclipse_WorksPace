package MyNewPackage;

public class Address {
	private String street ;
	private String city ;
	private int pincode ;
	private String country ;
	
	public Address() {
		
	}
	public Address(String street, String city, int pincode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void displayAddress() {
		System.out.println("street:"+street+"\ncity:"+city+"\npincode:"+pincode+"\ncountry:"+country);
	}
	

}
