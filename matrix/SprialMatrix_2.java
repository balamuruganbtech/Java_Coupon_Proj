package com.matrix;

public class SprialMatrix_2 {

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

		System.out.println(":::::::: Spiral Work ::::::::::::::");

		int temp[] = new int[n * n];
		int count = 0;
		// spiral
		for (int i = 0, j = 0, row = n, col = n; (i < row && j < col); row--, col--, i++, j++) {
			for (int k = i; k < col; k++) {
				temp[count++] = ar[i][k];
				// System.out.print(ar[i][k] + ", ");
			}
			for (int k = i + 1; k < row; k++) {
				temp[count++] = ar[k][col - 1];
				// System.out.print(ar[k][col - 1] + ", ");
			}
			for (int k = col - 2; k >= j; k--) {
				temp[count++] = ar[row - 1][k];
				// System.out.print(ar[row - 1][k] + ", ");
			}
			for (int k = row - 2; k > i; k--) {
				temp[count++] = ar[k][j];
				// System.out.print(ar[k][j] + ", ");
			}
		}

		// result printing
		int itr = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = temp[itr++];
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
