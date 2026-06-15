package com.rays.arraydemo;

public class ShortingArray {
	public static void main(String[] args) {
		int[] num = { 10, 128, 24, 95, 87, 351 };
		int[] num1 = { 10, 128, 24, 95, 87, 351 };
		// Ascending order
		System.out.println("Ascending order");
		for (int i = 0; i < num.length - 1; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					int temp = num[i];

					num[i] = num[j];

					num[j] = temp;

				}
			}

		}
		for (int n : num) {
			System.out.println(n);
		}

		System.out.println("=================="); // descending order
		System.out.println("Descending order");
		for (int a = 0; a < num1.length - 1; a++) {
			for (int b = a + 1; b < num1.length; b++) {
				if (num1[a] < num1[b]) {
					int temp1 = num1[a];
					num1[a] = num1[b];
					num1[b] = temp1;

				}
			}
		}
		for (int c : num1) {
			System.out.println(c);
		}

	}
}
