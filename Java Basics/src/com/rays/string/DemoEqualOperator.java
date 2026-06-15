package com.rays.string;

public class DemoEqualOperator {
public static void main(String[] args) {
	String s1="sunrays";
	String s2="sunrays";
	String s3=new String("welcome");
	String s4=new String("welcome");
	
	System.out.println(s1==s2);
	System.out.println(s3.equals(s4));
	
	System.out.println("===================");
	
	System.out.println(s3==s4);
	System.out.println(s1.equals(s2));
	
}
}
