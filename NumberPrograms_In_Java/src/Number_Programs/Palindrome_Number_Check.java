package Number_Programs;

import java.util.Scanner;

public class Palindrome_Number_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num = sc.nextInt();
		int temp = num;
		int mod = 0;
		int rev = 0;
		String snum = Integer.toString(num);
		
		
		for(int i = 0;i<snum.length();i++) {
			mod = num%10;
			rev = (rev*10)+mod;
			num = num/10;
		}
		if(temp == rev) {
			System.out.println("Given Number "+temp+" Is A Palindrome Number ");
		}
		else {
			System.out.println("Given Number "+temp+" Is Not  A Palindrome Number ");

		}
		
	}

}
