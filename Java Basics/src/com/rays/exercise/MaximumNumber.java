package com.rays.exercise;

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two Numbers");
		System.out.println("Enter first Number");
		int num1=sc.nextInt();
		System.out.println("Enter second Number");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("First number '"+num1 +"' is maximum number");
		}else {
			System.out.println("Second number '"+num2 +"' is maximum number");
		}
		sc.close();
	}
}
