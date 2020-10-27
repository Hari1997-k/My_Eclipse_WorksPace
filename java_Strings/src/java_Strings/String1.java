package java_Strings;

public class String1 {
	
	public static void main(String[] args) {
		String s = "Hari";
		System.out.println(s.hashCode());
		s.concat("Kuntrapakam");
		System.out.println(s);
		
		String s1 = new String("Hari");
		s1.concat(">K");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer sb = new StringBuffer("Buffer");
		System.out.println(sb.hashCode());
		sb.append("Kutrapakam@1");
		System.out.println(sb.hashCode());
		
		s = s.concat("Kuntrapakam@@");
		System.out.println(s);
		
		s1 = s1.concat("Kuntrapakam@@@");
		System.out.println(s1);
		
		StringBuilder builder  = new StringBuilder("Hey BUilder");
		System.out.println(builder);
		builder.append("Kuntrapaka@@@@@@");
		System.out.println(builder);
		System.out.println("============================================================");
		System.out.println("***********STRING API'S:***********");
		System.out.println(s);
	System.out.println("CHarAT	: "+s.charAt(0));
	System.out.println("CODEPOINTAT	:	"+s.codePointAt(0));
	System.out.println("CODEPOINTBEFORE	:	"+s.codePointBefore(1));
	System.out.println("contains	:	"+s.contains("Hari"));
	//System.out.println("CONTENTEQUALS	:	"+s.contentEquals("Hari"));
	System.out.println("ENDSWITH	:	"+s.endsWith("A"));
System.out.println("STARTSWITH	:	"+s.startsWith("A"));
System.out.println("INDEXOF	:	"+s.indexOf("a"));
System.out.println(s.intern());
System.out.println(s.toCharArray());
s= s.concat(" Ab cd");
System.out.println("	BEFORE Trim :       "+s);
System.out.println(s.trim());
	
		
		
	
	}

	
	
	
	
	
	


}
	
	
	
