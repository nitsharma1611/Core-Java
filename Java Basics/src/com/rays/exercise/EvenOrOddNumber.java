package com.rays.exercise;

import java.util.Scanner;

public class EvenOrOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		
		int num=sc.nextInt();
		evenOROddNumber(num);
		sc.close();
	}
	static void evenOROddNumber(int num){
		if(num%2==0) {
			System.out.println("Given Number "+num+" is even");
		}else {
			System.out.println("Given Number "+num+" is odd");
		}
		
		
	}
}
