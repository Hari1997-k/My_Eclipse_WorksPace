
public class BuyAlbum {
	
	public void makePayment(String phoneNumber , Double amount) {
		
		System.out.println("Paid Successfully!!");
		System.out.println("PhoneNumber :"+phoneNumber);
		System.out.println("Amount :"+amount);
	}
	
	public void makePayement(String phoneNumber  , String CVV , Double amount) {
		System.out.println("Paid Successfully!!");
		System.out.println("PhoneNumber :"+phoneNumber);
		System.out.println("CVV :"+ CVV);
		System.out.println("Amount :"+amount);
		
	}

}
