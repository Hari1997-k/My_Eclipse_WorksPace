package Number_Programs;

import java.util.Scanner;

public class SumOf_Digits_OfNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number :");
	int num = sc.nextInt();
	String snum = Integer.toString(num);
	int mod = 0 ;
	int sum =  0;
	for(int i = 0;i<snum.length();i++) {
		mod = num%10 ;
		sum = sum+mod ;
		num =  num/10 ;
		}
	System.out.println("SUm oF Digits Of Number "+num+ "Is  :"+sum);
	
	
}
}
