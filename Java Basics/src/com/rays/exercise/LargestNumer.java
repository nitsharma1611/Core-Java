package com.rays.exercise;

public class LargestNumer {
	public static void main(String[] args) {
int[] givenNum= {24,99,68,35,47,10};
		largestNumber(givenNum);
		
	}

	static void largestNumber(int[] num) {
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];

			}

		}
		System.out.println("Max number of Array:"+max);
	}

}

