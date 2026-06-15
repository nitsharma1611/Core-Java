package com.rays.arraydemo;

import java.util.Scanner;

public class GivenNumberoOfArray {
public static void main(String[] args) {
	System.out.println("Enter any Number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
			int[] notes= {500,200,100,50,20,10,5,2,1};
int count=0;
			
	for(int i=0;i<notes.length;i++) {
	count=	num/notes[i]; 
		if(count>0) {
		System.out.println(notes[i]+" notes "+count);
	}	
		num=num%notes[i];
		}
	sc.close();		
}
}
