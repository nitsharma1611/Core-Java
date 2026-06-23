package com.rays.exceptionhanding;

public class Demo1 {
	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		mom();
	}

	public static void mom() {

		try {
			son();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Hello");
		}	son();

	}

	public static void son() throws ArithmeticException {

		int total = 5 / 0;
		System.out.println(total);

		System.out.println("Hello");

	}
}
