package com.rays.string;

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("Sunrays ");
	
str.append("NCS");
System.out.println("");
System.out.println("length "+str.length());
System.out.println("Capacity "+str.capacity());
System.out.println("Char at "+str.charAt(10));
System.out.println(" index of "+str.indexOf("NCS"));
System.out.println(" Reverse:"+str.reverse());
System.out.println("Repalce"+str.replace(9, 11, "ncs"));






}
}
