package Searching_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The SIze Of The Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enterc" + size + "Elements :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Elmenets In the array : ");
		System.out.println(Arrays.toString(a));
		System.out.println("TO Perform Binary Search The Array Should Be Sorted :");
		Arrays.parallelSort(a);
		System.out.println("The Sorted Array :");
		System.out.println(Arrays.toString(a));
		int start = 0;
		int end = a.length - 1;
		int mid = Math.round((start + end) / 2);
		System.out.println("Enter The Element To Search : ");
		int ele = sc.nextInt();
		for(int i = 0; i<size;i++) {
			
			if (a[mid] == ele) {
				System.out.println("The ELement " + ele + " Found At Index : " + mid);
				break;
			} 
			
			else if (a[mid] != ele) {
				System.out.println(ele + " Not FOund In The Gievn Array  ");
				break;
			}
			
			
			else if (a[mid] < ele) {
				mid = mid + 1;
			} 
			
			else {
				mid = mid - 1;
			}
		
	}

}
}