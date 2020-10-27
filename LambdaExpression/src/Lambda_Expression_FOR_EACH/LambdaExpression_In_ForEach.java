package Lambda_Expression_FOR_EACH;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression_In_ForEach{
public static void main(String[] args) {

// FETCHING USING NORMAL CONSUMER CLASS :
		ArrayList<Integer> alst = new ArrayList<Integer>();
		alst.add(1);
		alst.add(2);
		alst.add(3);

		Consumer<Integer> con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

		};
		alst.forEach(con);
		System.out.println("\n=======================");

// FETCHING USING ANNONYMOUS CONSUMER CLASS :

		ArrayList<Integer> blst = new ArrayList<Integer>();
		blst.add(1);
		blst.add(2);
		blst.add(3);
		alst.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		});
		System.out.println("\n=======================");

// FETCHING USING LAMBDA EXPRESSION  :
		ArrayList<Integer> clst = new ArrayList<Integer>();
		clst.add(1);
		clst.add(2);
		clst.add(3);
		clst.forEach((t) -> System.out.println(t));

	}
}
