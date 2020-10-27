package MyNewPackage;

public class Country {
	private String name ;
	private String countryCode ;
	private String isdCode ;
	
	public Country (){
		
	}
	public Country(String name, String countryCode, String isdCode) {
		super();
		this.name = name;
		this.countryCode = countryCode;
		this.isdCode = isdCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcountryCode() {
		return countryCode;
	}
	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getIsdCode() {
		return isdCode;
	}
	public void setIsdCode(String isdCode) {
		this.isdCode = isdCode;
	}
	
	

}
