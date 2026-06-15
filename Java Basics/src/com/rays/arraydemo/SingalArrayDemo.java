package com.rays.arraydemo;

public class SingalArrayDemo {
	public static void main(String[] args) {
		int[] table = new int[5];
		table[0] = 5;
		table[1] = 10;
		table[2] = 15;
		table[3] = 20;
		table[4] = 25;
		System.out.println(table.length);
		System.out.println(table.toString());
		System.out.println(table);
		System.out.println(table.getClass().getName());
		System.out.println(table.hashCode());
		System.out.println(table.getClass());
		System.out.println("====================");

		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
	}
}
