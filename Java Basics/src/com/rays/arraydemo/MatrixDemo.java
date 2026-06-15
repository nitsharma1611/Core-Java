package com.rays.arraydemo;

public class MatrixDemo {
public static void main(String[] args) {
	int[][] matrix=new int[3][3];
	
	
	/*
	 * System.out.println(matrix.length); System.out.println(matrix[0].length);
	 * System.out.println(matrix[0][0].length);
	 */	
	for(int i=0;i<matrix.length;i++){
		for( int j=0;j<matrix[0].length;j++)  
		{
			
				
				System.out.print(i+j+"\t");
			
			
		}
		System.out.println();
		
	}
	
}
}
