package com.rays.exercise;

import java.util.Scanner;

public class AverageOddAndEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		int count = 0;
		int count1 = 0;
		int avg, avg1;
		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0) {
				count++;
				
				odd += i;

			} else {
				count1++;
			
				even += i;

			}

		}
		
		
		avg1 = even / count1;
		avg = odd / count;
		System.out.println("Even Number avg " + avg1 );
		System.out.println("Odd Number " + avg );

		sc.close();
	}
}
