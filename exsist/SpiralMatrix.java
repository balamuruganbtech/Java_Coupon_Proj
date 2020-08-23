package com.exsist;

import java.util.Scanner;

public class SpiralMatrix {

	static Scanner scan = new Scanner(System.in);

	static int ar[][];

	static void printArray() {
		int size = ar.length;
		System.out.println("==============MATRIX ARRAY CAN BE=============");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void input() {
		System.out.println("enter the matrix row and column size");
		int size = scan.nextInt();
		ar = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				ar[i][j] = scan.nextInt();
			}
		}
		scan.close();
		printArray();
	}

	static void spiral() {
		int size = ar.length;
		int row = size;
		int column = size;
		int val = size*size;
		for (int i = 0, j = 0; i < row && j < column; i++, j++) {
			// print asc row
			for (int k = i; k < column - i; k++) {
				System.out.print(ar[i][k]+"   ");
				ar[i][k] = val;
				val--;
			}
			System.out.println();

			// print desc column
			for (int k = i + 1; k < row - i; k++) {
				System.out.print(ar[k][column - i - 1]+"   ");
				ar[k][column - i - 1] = val;
				val--;
			}
			System.out.println();

			// print desc row
			for (int k = column - i - 2; k >= i; k--) {
				System.out.print(ar[row - i - 1][k]+"   ");
				ar[row - i - 1][k] = val;
				val--;
				
			}
			System.out.println();
			
			// print asc column
			for (int k = row - i - 2; k > i; k--) {
				System.out.print(ar[k][j]+"   ");
				ar[k][j] = val;
				val--;
			}
			System.out.println();
		}

		printArray();

	}

	public static void main(String[] args) {
		input();
		spiral();
	}

}
