package java_basics;

public class StringPrac {
	public static void main(String[] args) {
		String str="ABCDEFG";
		
		System.out.println(str.substring(0, 2));
		System.out.println(str.equals("Hello"));
		System.out.println(str.equalsIgnoreCase("abcdefg"));
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("CDE"));
		System.out.println(str.lastIndexOf("C"));
	}
}
