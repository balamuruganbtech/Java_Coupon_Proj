package com.misc;

import java.util.Random;

public class RandomNumberGenerate {

	static int n = 9;
	static int ar[][] = new int[n][n];
	static Random r = new Random();

	static int generateRandom() {
		return r.nextInt(n) + 1;
	}

	static void print() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + "   ");
			}
			System.out.println();
		}
	}

	// first step
	static boolean solve(int row, int col, int count) {
		if ((col / n) == 1) {
			row += 1;
			col = 0;
		}
		for (int num = 1; num < n + 1; num++) {
			// second step
			if (isSafety(row, col, num)) {
				ar[row][col] = num;

				// final and last step terminated here
				if (row == n - 1 && col == n - 1) {
					return true;
				}
				// instead of fourth step follow directly fifth step for
				// terminate column
				if (solve(row, col + 1, count + 1)) {
					return true;
				}
			}
		}
//		ar[row][col] = 0;
		return false;
	}

	// third step
	static boolean isSafety(int r, int c, int num) {
		// row and col checks
		for (int i = 0; i < n; i++) {
			if (ar[r][i] == num || ar[i][c] == num) {
				return false;
			}
		}
		int rowStarts = ((r / 3) * 3);
		int rowEnds = rowStarts + 3;
		int colStarts = ((c / 3) * 3);
		int colEnds = colStarts + 3;
		for (int i = rowStarts; i < rowEnds; i++) {
			for (int j = colStarts; j < colEnds; j++) {
				if (ar[i][j] == num) {
					return false;
				}

			}
		}
		return true;
	}

	static void fillFirstRow() {
		outer: for (int i = 0; i < n; i++) {
			int num = generateRandom();
			inner: for (int j = 0; j <= i; j++) {
				if (ar[0][j] == num) {
					i--;
					continue outer;
				}
			}
			ar[0][i] = num;
		}
	}

	public static void main(String[] args) {
		fillFirstRow();
		print();
		solve(1, 0, 0);
		System.out.println("================ Second Row ================");
		print();
	}

}
