package com.rays.exercise;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number");
	
	int num=sc.nextInt();
	factorial(num);
	sc.close();
}

static void factorial(int a) {
	int temp=1;
	for(int i=2;i<=a;i++) {
		temp=temp*i;
	}
	System.out.println(temp);
}
}
