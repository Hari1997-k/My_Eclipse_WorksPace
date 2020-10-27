package Number_Programs;
import java.util.Scanner;

public class No_Of_Zeros_In_GivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Number :");
		int num = sc.nextInt();
		String snum = Integer.toString(num);
		int mod =0;
		int count =0;
		for(int i=0 ; i<snum.length();i++) {
			mod = num%10 ;
			if(mod == 0) {
				count++;
			}
			num = num/10;
		}
		System.out.println("Number Of 0's in "+snum+" Is : "+count);
		
	}

}
