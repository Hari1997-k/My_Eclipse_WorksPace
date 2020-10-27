package FunctionsASSESNXT;

import java.util.Scanner;

public class ExpressionPro {
	int y =0;
	public int Caluculate(int x , int n) {
	for(int i = 0;i<=n;i++) {
		y =y+(x+(x^i));
	
		
		System.out.println(y);
	}
		
		return y;
	}
	public static void main(String[] args) {
		ExpressionPro ep = new ExpressionPro();
		int result = ep.Caluculate(2, 4);
		System.out.println("RESULT "+result);
		
		
		
		
	}

}
