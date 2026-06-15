package com.rays.arraydemo;

public class MaxNumberOfArray {
public static void main(String[] args) {
	int[] num= {75,98,101,45,68,36,12};

int max=0;

for(int i=0;i<num.length;i++) {
	if(num[i]>max) {
		max=num[i];
	}
}
System.out.println("Max of Array :"+max);
}
}
