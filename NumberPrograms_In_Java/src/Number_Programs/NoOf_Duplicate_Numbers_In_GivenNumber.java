package Number_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoOf_Duplicate_Numbers_In_GivenNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		int count = 0;
		String snum = Integer.toString(num);
		char ch [] = snum.toCharArray();
		for(int i = 0;i<snum.length();i++) {
			for(int j = 0;j<=snum.length();j++)
			if(ch[i] == ch[j]) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	
}