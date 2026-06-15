package com.rays.arraydemo;

public class TwoDArrayDemo {
public static void main(String[] args) {
	int table[][]=new int[9][10];

	/*
	 * System.out.println(table.length); System.out.println(table[0].length);
	 */
for(int i=0;i<table.length;i++) {
	for(int j=0;j<table[0].length;j++) {
	table[i][j]=(i+2)*(j+1);
		System.out.print(table[i][j]+"\t");
	}
	System.out.println();
}

}
}
