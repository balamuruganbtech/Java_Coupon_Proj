package com.matrix;

public class SprialMatrix_4 {

	public static void main(String[] args) {
		int n = 4;
		int ar[][] = new int[n][n];
		int num = 10;

		// pushing val
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = ++num;
			}
		}

		// printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println(":::::::: Spiral Work Outer to Inner ::::::::::::::");
		// spiral
		for (int i = 0, j = 0, row = n, col = n, number = 1; (i < row && j < col); row--, col--, i++, j++, number++) {
			for (int k = i; k < col; k++) {
				ar[i][k] = number;
				// System.out.print(ar[i][k] + ", ");
			}
			for (int k = i + 1; k < row; k++) {
				ar[k][col - 1] = number;
				// System.out.print(ar[k][col - 1] + ", ");
			}
			for (int k = col - 2; k >= j; k--) {
				ar[row - 1][k] = number;
				// System.out.print(ar[row - 1][k] + ", ");
			}
			for (int k = row - 2; k > i; k--) {
				ar[k][j] = number;
				// System.out.print(ar[k][j] + ", ");
			}
		}

		// result printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

		// ASC spiral print
		int count_asc = 10;
		// spiral
		for (int i = 0, j = 0, row = n, col = n, number = 2; (i < row && j < col); row--, col--, i++, j++, number--) {
			for (int k = i; k < col; k++) {
				ar[i][k] = number;
			}
			for (int k = i + 1; k < row; k++) {
				ar[k][col - 1] = number;
			}
			for (int k = col - 2; k >= j; k--) {
				ar[row - 1][k] = number;
			}
			for (int k = row - 2; k > i; k--) {
				ar[k][j] = number;
			}
		}

		System.out.println(":::::::: Spiral Work Inner to Outer ::::::::::::::");

		// result printing
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
