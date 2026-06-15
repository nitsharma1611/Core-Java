package com.rays.string;

public class TestString {
	
	public static void main(String[] args) {
		String name ="Vijay Dinanath chauhan";
		String name2=" From";
		System.out.println("String Length "+name.length());
		System.out.println("7th character: "+name.charAt(6));
		System.out.println("index of Dina:"+name.indexOf("Dina"));
		System.out.println("First 'i' position "+name.indexOf("i"));
		System.out.println("last 'i' position "+name.lastIndexOf("i"));
		System.out.println("'a' is replaced by 'b'-"+name.replace('a', 'b'));
		System.out.println("Lowercase-"+name.toLowerCase());
		System.out.println("Uppercase-"+name.toUpperCase());
		System.out.println("Starts with 'Vijay'-"+name.startsWith("Vijay"));
		System.out.println("Ends with 'han'-"+name.endsWith("han"));
		System.out.println("Substring from index 6-"+name.substring(6));
		System.out.println(name.concat(name2));
		System.out.println(name.substring(15));
		System.out.println(name.substring(8,12));
	}

}
