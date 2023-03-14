package org.stringchapter;

public class StrChap {
public static void main(String[] args) {

	String s = "      hello world   ";
	String g = "Hello World";
	
	//length of string
	int length = s.length();
	System.out.println(length);

	//to upper case
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	//to lower case
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	//equals
	boolean equals = s.equals(s);
	System.out.println(equals);
	
	//equals ignore
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s);
	System.out.println(equalsIgnoreCase);
	
	//index of
	int indexOf = s.indexOf('l');
	System.out.println(indexOf);
	
	//last index of
	int lastIndexOf = s.lastIndexOf('l');
	System.out.println(lastIndexOf);
	
	//char at
	char charAt = s.charAt(8);
	System.out.println(charAt);
	
	//contains
	boolean contains = s.contains("ha");
	System.out.println(contains);
	
	//replace
	String replace = s.replace("ld", "d");
	System.out.println(replace);
	
	//replaceall
	String replaceAll = s.replaceAll("d", "+");
	System.out.println(replaceAll);
	
	//startswith
	boolean startsWith = s.startsWith("he");
	System.out.println(startsWith);
	
	
	//endswith
	boolean endsWith = s.endsWith("ld");
	System.out.println(endsWith);
	
	//isempty
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	//trim
	String trim = s.trim();
	System.out.println(trim);
	
	// substring
	String substring = s.substring(10);
	System.out.println(substring);
	
	//substring2
	String substring2 = g.substring(5, 10);
	System.out.println(substring2);
	
	System.out.println("End......................");
	System.out.println("muthu............");
	System.out.println("sandal..........");
	System.out.println("jeni...........");
	System.out.println("mannandho..........");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
