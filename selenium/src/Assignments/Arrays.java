package Assignments;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = s.nextInt();
		int[] array = new int[size];
		for (int i = 0;i<size;i++) {
			System.out.println("Enter the integer");
			int a = s.nextInt();
			array[i]= a;
		}
		
		for(int a:array) {
			System.out.print(a);
		}

	}

}
