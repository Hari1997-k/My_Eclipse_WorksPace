package MyNewPackage;

public class Person {

	   private String name ;
	 private String emailId ;
	 private String mobileNumber;
	 
	 
	 public Person() {
		 
	 }
	public Person(String name, String emailId, String mobileNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "name : " + name + "emailId : " + emailId + "mobileNumber : " + mobileNumber ;
	}
	 
	 
}
