package Pattern_Program_Practice;

import java.util.Scanner;

public class Pattern_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The PAttern - 2 : ");
		int size= sc.nextInt();
		int r = 1;
		for(int i = size; i>0 ; i--) {
			for(int j = 0 ; j<=i ; j++) {
				System.out.print(" ");
			}
		}
		for(int i = 0 ; i<=r; i ++) {
			System.out.print("* ");
		}
			System.out.println();
			r++;
		
	}

}

/*
 * 1
 *1 3
 1 2 2
1 2 3 4

 */ 
