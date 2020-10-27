package Com.Spring.SpringUsingXml;

public class Address {
	private String  doorNo;
	private String street ;
	private String district;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String doorNo, String street, String district) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.district = district;
	}
	@Override
	public String toString() {
		return "doorNo=" + doorNo + ", street=" + street + ", district=" + district ;
	}
	
	
	
	

}
