import java.util.Scanner;
import java.util.regex.Pattern;

public class BasicRegex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome To Regex Demo");
//USING PATTERN CLASS & MATCHER CLASS: 
	/*Pattern pt = Pattern.compile(".*Hari.*");
	Matcher mt = pt.matcher("ABVCDHarliEFGH");
	boolean b = mt.matches();
	if(b) {
		System.out.println("Pattern Matched");
	}
	else {
		System.out.println("Pattern Not Matched");
	}
//USING PATTERN.MATCHES;
	boolean b1 = Pattern.matches("[a-zA-z]{1,2}", "an");//true
	boolean b2 = Pattern.matches("[a-zA-z]{1,2}", "ABCDE");//false bcoz it have more than 2 characters		
	System.out.println(b1);
	System.out.println(b2);
//
	System.out.println("Enter The Email To Check the Pattern :");
	String email = sc.next();
	boolean  b3 = Pattern.compile("[a-zA-Z0-9]+@+[a-zA-Z/.]+[a-z]{2,3}").matcher(email).matches();
	System.out.println("Email Pattern is :  "+ b3);*/
	
	
	boolean pp0 = Pattern.matches("[a-b[p-t]]", "a");//allows  1  character from a - d (or) p - t
	System.out.println("RESULT IS :"+pp0);

	boolean pp1 = Pattern.matches("[[a-z]&&[def]]" , "a" );
	System.out.println("RESULT IS :"+(pp1));
}
	
}
