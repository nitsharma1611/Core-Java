package com.rays.exercise;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int input = sc.nextInt();
		int num = input;
		int num1 = 0;
		while (num > 0) {

			num1 = num1 * 10 + num % 10;
			num = num / 10;
		}

		if (input == num1) {
			System.out.println("This is Palindrome Number");
		} else {
			System.out.println("This is not Palindrome Number");
		}
		sc.close();
	}
}
