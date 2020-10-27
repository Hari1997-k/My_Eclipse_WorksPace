package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_Sorting {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(0);
		set.add(88);
		set.add(-9);
		set.add(12);

		System.out.println("Elemnts in Random order\n==========================");
		System.out.println(set.toString());
		;
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.addAll(set);

		Collections.sort(alist);
		System.out.println("Elements In Ascending Order \n=========================");
		System.out.println(alist.toString());
		
		Collections.reverse(alist);
		System.out.println("Elements In Descending Order \n==========================");
		System.out.println(alist.toString());

	}

}
