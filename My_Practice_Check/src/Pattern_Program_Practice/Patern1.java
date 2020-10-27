package Pattern_Program_Practice;

import java.util.Scanner;

public class Patern1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size OF The Pattern - 1: ");
		int size = sc.nextInt();
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();

		}
		sc.close();

	}

}
