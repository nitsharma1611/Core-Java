package com.rays.exercise;

public class SecondLargestNumber {
	static void SecondLargestOfArray(int[] num) {
		int max = 0;
		int secondLarge=0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				secondLarge =max;
				max = num[i];

			} else if (num[i] > secondLarge && num[i] != max) {
                secondLarge = num[i];
            }
			
		}
		System.out.println("Larged Number is: " + max);
		System.out.println("Second Larged Number is: " + secondLarge);

	}

	public static void main(String[] args) {
		int[] num = { 24, 99, 68, 35, 47, 10 };
		SecondLargestOfArray(num);
	}
}
