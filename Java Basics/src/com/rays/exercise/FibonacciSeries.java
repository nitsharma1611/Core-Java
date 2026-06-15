package com.rays.exercise;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		/* The Fibonacci sequence is a type series where each number
		is the sum of the two that precede it. */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");

		int num = sc.nextInt();
		FibonacciSeriesnumber(num);
		sc.close();
	}

	static void FibonacciSeriesnumber(int num) {
		int num1 = 0;
		int num2 = 1;

		for(int i=0;i<num;i++) {
			System.out.print(num1+" ");
			int num3=num2+num1;
			num1=num2;
			num2=num3;
			
		}
	}

}
