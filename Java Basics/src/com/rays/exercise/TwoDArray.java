package com.rays.exercise;



public class TwoDArray {
public static void main(String[] args) {
	
int[][] table=new int[10][9];
	
	for(int i=0;i<table.length;i++) {
		for(int j=0;j<table[0].length;j++) {
		table[i][j]=(i+1)*(j+2);
			System.out.print(table[i][j]+"\t");
		}
		
		System.out.println("\n");
	}
	
	
	
}
}
