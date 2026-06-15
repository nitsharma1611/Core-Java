package com.rays;

import java.util.Scanner;

public class DemoStaticVariable {
	final static  double PI =3.14;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle and Given area of circle");
		int radius=sc.nextInt();
		double area=PI*radius*radius;
		System.out.println("area of circle is "+area );
sc.close();
	}
}
