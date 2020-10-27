package OOPS_Concept_Practice;

public class Address {

	private String city;
	private String State;
	private String Country;
	private int Zip;

	public Address() {

	}

	public Address(String city, String state, String country, int zip) {
		super();
		this.city = city;
		State = state;
		Country = country;
		Zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

}
