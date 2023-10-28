package Assignments;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = s.nextInt();
		System.out.println("Enter no of columns");
		int columns = s.nextInt();
		int[][] matrix = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter the value for position "+ i+", "+j);
				int a=s.nextInt();
				matrix[i][j] = a;
			}
		}
		for(int[] r:matrix) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
