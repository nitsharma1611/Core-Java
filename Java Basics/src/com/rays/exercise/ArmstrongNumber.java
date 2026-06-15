package com.rays.exercise;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter Any Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int givenNumber=num;
		int sum = 0;

		int digit = String.valueOf(num).length();

		while (num > 0) {
			int n = num % 10;

			sum += (int) Math.pow(n, digit);

			num /= 10;

		}

		if (givenNumber==sum) {
			System.out.println("Number is Armstrong Number " + sum);
		} else {
			System.out.println("Number is not Armstrong Number " + sum);
		}
		sc.close();
	}
}
