package Number_Programs;
import java.util.Scanner;

public class Reverse_Of_GivenNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Number :");
		int num = sc.nextInt();
		String snum = Integer.toString(num);
		int rev = 0;
		int mod = 0;
		System.out.println("Reverse Of "+num +" is");
		for(int i = 0 ;  i<snum.length();i++) {
			mod = num%10 ;
			rev = mod;
			num = num/10;
			System.out.print(rev);
	
		}
		
	}

}
