package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Sorting {
	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(11);
		alist.add(20);
		alist.add(1);
		alist.add(4);
		alist.add(34);
		alist.add(7);
		
		System.out.println("The ELement In The List Are: ");
		System.out.println(" "+alist.toString().replace("]", "").replace("[" , "").replace("," , "\n"));
		System.out.println(alist.toString());
		
		System.out.println("Sorting The Elements In Ascending Order : ");
		Collections.sort(alist);
		System.out.println(alist.toString());
		
		System.out.println("Sorting The ELemnts In Descending Order : ");
		Collections.reverse(alist);
		System.out.println(alist.toString());
		
		
	}

}
