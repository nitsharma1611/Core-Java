package com.rays.exercise;

public class SecondLargestNumberNew {
	public static void main(String[] args) {
		int[] num = { 25, 87, 46, 98, 64, 39 };
		int largestNum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largestNum) {
				largestNum = num[i];

			}

		}
		System.out.println("Largest Number is "+largestNum);
		int secondLargest = num[0];

		for (int j = 0; j < num.length; j++) {

			if (num[j] < largestNum && num[j] > secondLargest) {

				secondLargest=num[j];
			}
		}
		System.out.println("Second Largest Number is "+secondLargest);
		
	}
}
