package com.rays.arraydemo;

import java.util.Scanner;

public class TestFindNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		char[] name = { 'N', 'I', 'T', 'I', 'N', 'S', 'H', 'A', 'R', 'M', 'A' };
		char givName = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < name.length; i++) {

			if (givName == name[i]) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println("Given Character is not Found");
		} else {
			System.out.println("Given Character is Found");
		}
		sc.close();
	}

}
