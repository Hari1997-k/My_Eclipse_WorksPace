import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailRegex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email to check :");
		String email = sc.next();
		boolean result = Pattern.matches("^[a-zA-Z0-9]+@+[a-zA-Z]+.+[a-zA-Z]{2,3}$"
				, email);
		System.out.println("Email Pattern is : "+result);
	}

}

