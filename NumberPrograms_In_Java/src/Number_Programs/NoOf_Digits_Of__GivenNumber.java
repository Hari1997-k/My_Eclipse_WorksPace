package Number_Programs;
import java.util.Scanner;

public class NoOf_Digits_Of__GivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Number :");
		int num = sc.nextInt();
		String snum = Integer.toString(num);
		System.out.println("No Of Digits In "+num+" Is :"+snum.length());
	}

}
