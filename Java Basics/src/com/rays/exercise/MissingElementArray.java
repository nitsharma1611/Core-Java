package com.rays.exercise;

public class MissingElementArray {
public static void main(String[] args) {
	int[] a= {24,35,74,85,97};
	int[] b= {24,35,85,97};

	missingElement(a, b);
}

static void missingElement(int[] num1,int[] num2) {
	
	for(int i=0;i<num1.length;i++) {
		boolean missNumber=false;
		
		for(int j=0;j<num2.length;j++) {
		 if(num1[i]==num2[j]) {
			missNumber=true;
	break;
		 }
			
		}
	if(!missNumber) {
		System.out.println("Missing Number: "+num1[i]);
	}	
	
	}
}




}
