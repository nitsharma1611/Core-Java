package com.rays.exercise;




public class TwoDArray1 {
public static void main(String[] args) {
	
int[][] table=new int[9][10];
	
	for(int i=0;i<table.length;i++) {
		for(int j=0;j<table[0].length;j++) {
		table[i][j]=(i+2)*(j+1);
			System.out.print(table[i][j]+"\t");
		}
		
		System.out.println("\n");
	}
	
	
	
}
}
