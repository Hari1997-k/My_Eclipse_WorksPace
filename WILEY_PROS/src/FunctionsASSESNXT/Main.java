package FunctionsASSESNXT;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		long  num = sc.nextLong();
		System.out.println("Entered Number is :"+num);
		String lng =Long.toString(num);
		long per = 0;
		long even = 0;
		long odd = 0;
		for(long i =0;i<lng.length();i++) {
		per = num%10 ;
		num = num/10;
		if(per%2 ==0) {
			even = even+per ;
		}
		else if(per%2 !=0) {
			odd = odd+per ;
		}
		}
		System.out.println("Even :    "+even );
		System.out.println("Odd  :     "+odd);
		
	}

}
