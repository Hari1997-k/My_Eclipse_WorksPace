package java_Strings;

import java.util.HashSet;
import java.util.Scanner;

public class String_Programs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//NO OF WORDS IN A GIVEN STRING USING SPLIT() ;		
		/*System.out.println("Enter THe String :");
		String str = sc.nextLine();
		System.out.println(" "+str);
		String sray [] = str.split(" ");
		System.out.println("SPlitting words by space :");
		for(int i =0;i<sray.length;i++) {
			System.out.println(sray[i]);
		}
		System.out.println("Total No Of Wordss :"+sray.length);*/

//FINDING NIO OF DUPLICATE WORDS AND ITS OCCURENCES : IN GIVEN STRING :
		/*System.out.println("Enter The STring :");
		
		String s = sc.nextLine();
		System.out.println("GIVEN STRING :  \n"+s);
		String a[] = s.split(" ");
		HashMap<String , Integer> map = new HashMap<String  , Integer>();
		System.out.println("NO OF WORDS IN GIVEN STRING  : "+a.length );
		for(String  ss : a) {
			if(map.containsKey(ss)) {
	//IF U WANT TO CHECK LOWER CASE LETTERS THE USE MAP.CONTAINS(SS.TOLOWERCASE());
				map.put(ss , map.get(ss)+1);
			}
			else {
				map.put(ss , 1);
			}
		}
		System.out.println("UNIQUE  KEY VALUE PAIRS IN GIVEN MAP :");
		for(Map.Entry<String , Integer> mm: map.entrySet()) {
			if(mm.getValue()==1)
			System.out.println(mm.getKey()+"    "+mm.getValue()+" time");
			
			
		}
		
		System.out.println("REPEATED KEY VALUE PAIRS  AND ITS OCCURENCE :");
		for(Map.Entry<String , Integer> mm: map.entrySet()) {
			if(mm.getValue()>1)
			System.out.println(mm.getKey()+"    "+mm.getValue()+" times");
			
			
		}*/
//NO OF OCCURENCES OF GIVEN CHAR USING FOR LOOP ;
		
		/*System.out.println("Enter The String ;");
		String s = sc.nextLine();
		System.out.println("Enter The Character To Search :");
		char ch = sc.next().charAt(0);
		int count  =0;
		char aa [] = s.toCharArray();
		for(int i =0;i<aa.length;i++) {
			if(aa[i] == ch) {
				count ++;
			}
		}
		
		System.out.println("Occurences of Character '"+ch +"' in the Given STring Are : "+count );*/
		
//NO OF OCCURENCES OF GIVEN CHAR USING REPLACE METHOD :;
		
		/*System.out.println("Enter The STring :");
		String s = sc.nextLine();
		int count = s.length() - s.replace("a" , "").length();
		System.out.println("COunt  of 'a' is : "+ count );*/
		
		
// REVERSE OF A GIVEN stRING :
		
		/*System.out.println("ENTER THE STRING :");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		ArrayList<Character> alist = new  ArrayList<Character>();
		for(int i = c.length-1 ; i>=0;i--) {
			alist.add(c[i]);
		}
		System.out.println("REVERSE OF GIVEN STRING IS :");
		alist.forEach((d)->System.out.print(d+"  "));*/

//REVERSE OF AS STRING USING STRING BUFFER :
		
		/*System.out.println("ENTER THE STRING :");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		System.out.println("REVERSE OF GUVEN STRING IS  :");
		System.out.println(reverse);*/
		
// REMOVING WHITESPACE SFROM GIVEN STRING :
	
		/*System.out.println("ENTTER THE STRING :");
	String s =sc.nextLine();
	String result = s.replace(" " , "");
	System.out.println("AFTER REMOVING WHITESPACES : "+ result);*/
		
//ALTERNATE CODE CHECK :	
		
		/*System.out.println("Enter The String ");
		String s = sc.next();
		boolean r = false ;
		 for (int i = 0; i < s.length() - 2; i++) 
		    { 
		        if (s.charAt(i) != s.charAt(i + 2)) 
		        { 
		            r= true; 
		            if (s.charAt(0) == s.charAt(1)) 
				        r =  false; 
		        } 
		    } 
		  
		   
	if(r)
		System.out.println("YES");
	else
		System.out.println("NO");*/
		
		
// INSERTING *  AT TRHE MIDDLE OF THE TWO SAME CHARACTERS :		
		/*System.out.println("ENTER THE STRING :");
		String s = sc.next();
		char ch [] = s.toCharArray();
		String op = "";
		for(int i =0;i<ch.length;i++) {
			op = op+ch[i];
			for(int j =i+1;j<ch.length;j++) {
			if(ch[i] == ch[j]) {
				op=op+"*";
			}
			}	
		}*/
// CHECK WHETHER THE STRING S2 CONTAINS S2 ARE NOT  :
		/*System.out.println("ENTERV THE STRING 1 :");
		    String s1 = sc.next();
		System.out.println("ENTER THE STRING 2 :");
			String s2 = sc.next();
			if(s2.contentEquals(s1)) {
				System.out.println("S2 IS THE ROTATIONARY STRING OF S1 ");
			}
			else {
				System.out.println("SOORRRYYY");
			}*/
			
//REVESING EACH WORD OF A STRING :
	/*System.out.println("Enter The STring :");
	String s = sc.nextLine();
	String words [] = s.split("");
	String word ;
	String reverse = "";
	String reverseSTring = "";
	for(int i =0;i<words.length;i++) {
		word = words[i];
	for(int j = word.length()-1;j>=0;j--) {
		reverse = reverse+word.charAt(j);
	}
	reverseSTring = reverseSTring+reverse ;
	}
	
	System.out.println("reverseSTring :  "+reverseSTring);
	*/
		
//WILEY STRING  PRCTC-05 :
		/*System.out.println("Enter The String :");
		String str = sc.next();
		int count1 =0;
		int count2 = 0 ;
		char ch [] = str.toCharArray();
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a') {
				count1++;
				if(str.charAt(i) == 'b')
					count2++;
			}
		
		}
		if(count1>count2) {
			System.out.println(count1);
		}
		else {
			System.out.println(count2);
		}*/
		
		
		/*System.out.println("ENTER THE STRING :");
		String s1 = sc.next();
		System.out.println("ENTER THE SECOND STRING :");
		String s2 = sc.next();
		boolean result = false ;
		if(s1.length() == s2.length()) {
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i) == s2.charAt(i) || s1.charAt(i)=='?'||s1.charAt(i)=='?') {
				result = true;
				}
			else 
				result = false ;
		}
	
}
		else {
			System.exit(0);
		}
		if(result) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}*/
		
// SORTING A STRING  USING COLLECTIONS.SORT():
		/*System.out.println("Enter String :");
		String s = sc.next();
		System.out.println("GIVEN STRING IS :\n"+s);
		char ch [] = s.toCharArray();
		ArrayList<Character> alist = new ArrayList<Character>();
		for(char ss: ch) {
			alist.add(ss);
			
		}
		Collections.sort(alist);
		System.out.println("THE SORTED ORDER OF THE GIVEN STRING IS :");
		alist.forEach((d)->System.out.print(d));*/
		
//EQUALITY OF TWO STRINGS :
		
		/*System.out.println("nter String -1 :");
		String s1 = sc.next();
		System.out.println("Enter String -2 :");
		String s2 = sc.next();
		boolean result = false ;
		if(s1.length() == s2.length()) {
			for(int i =0; i<s1.length() ; i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					result = true ;
				}
				else {
					result = false;
				}
			}
		}
		else {
			System.out.println("WE CANNOT COMPARE TWO STRINGS OF INEQUAL LENGHT :");
		}
		
		if(result) {
			System.out.println("TWO STRINGS ARE EQUAL ");
		}
		else {
			System.out.println("TWO STRING S ARE UNEQUAL ");
		}*/
		
//PRINTING $ INBETWEEN TWO EQUAL ADJACENT CHARACTERS OF A STRING :		

	}	}
