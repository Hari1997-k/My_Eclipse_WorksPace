import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumRegex {
	public static void main(String[] args) {
		//PhoneNumRegex.phoneChecker();
		PhoneNumRegex.PasswordChecker();
	}
	
	public static  boolean phoneChecker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Phone Number : ");
		String pno = sc.next();
		boolean b = Pattern.matches("[6789]{1}+[0-9]{9}"  , pno);
		System.out.println("Phno pattern is : "+ b);
		sc.close();
		return b;
	}
	public static boolean  PasswordChecker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Password To Validate :");
		String pass = sc.next();
		boolean b1 = Pattern.matches("^[a-zA-Z]+[A-Z]{2,}+[0-9]{2,}+[~!@#%&*]{2,}$" , pass);
		System.out.println("Password validation is : "+b1);
		sc.close();
		return b1 ;
		
	}

}
