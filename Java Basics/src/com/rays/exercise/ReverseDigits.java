package com.rays.exercise;

import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Digit");
		
		int num=sc.nextInt();
		reverseDigits(num);
		sc.close();
	}
	static void reverseDigits(int num){
		
		int rev=0;
		while(num>0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Digit "+rev);
	}
	
}
