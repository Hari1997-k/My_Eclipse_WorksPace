package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int size = sc.nextInt();
		Integer[] a = new Integer[size];
		System.out.println("Enter "+size+" Elements :");
		for(int i = 0 ; i<size;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Elements In The Given Array Are : ");
		System.out.println(Arrays.toString(a)) ;
		
		System.out.println("Sorting AN Array Vy Converting it into list : ");
		List<Integer> aa = Arrays.asList(a);		
		
		
		
	}
	

}
