package com.rays.exercise;

import java.util.Scanner;

public class SmallerNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Numbers");
		System.out.println("Enter first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number");
		int num2 = sc.nextInt();
String result=(num1>num2)?"Second Number is Smaller":"First Number is Smaller";

	System.out.println(result);
	sc.close();
	}

}
