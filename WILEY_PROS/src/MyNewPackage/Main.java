package MyNewPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter Customer Address");
		 * System.out.println("Enter the street"); String street = sc.next();
		 * System.out.println("Enter the city"); String city = sc.next();
		 * System.out.println("Enter the pincode"); int pincode = sc.nextInt();
		 * System.out.println("Enter the country"); String country = sc.next();
		 * 
		 * Address add = new Address(); add.setCity(city); add.setCountry(country);
		 * add.setPincode(pincode); add.setStreet(street);
		 * System.out.println(pincode+1); add.displayAddress();
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Enter the country name"); String name = sc.next();
		 * System.out.println("Enter the country code"); String code = sc.next();
		 * System.out.println("Enter the isd code"); String isd = sc.next();
		 * 
		 * Country ctr = new Country(); ctr.setcountryCode(code); ctr.setIsdCode(isd);
		 * ctr.setName(name);
		 * 
		 * System.out.println("Country Name: "+ctr.getName()+"\nCountry Code"+ctr.
		 * getcountryCode()+"\nISD Code: "+ctr.getIsdCode());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	
	
	
		
		System.out.println("Name:");
		String name = sc.next();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Mobile:");
		String mobile = sc.next();
		Person prs = new Person();
		prs.setEmailId(email);
		prs.setMobileNumber(mobile);
		prs.setName(name);
		System.out.println(prs.toString());
			
			
			
			
			
	
	
	
	}
	

}
