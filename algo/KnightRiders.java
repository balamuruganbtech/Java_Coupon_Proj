package com.algo;

public class KnightRiders {

	static int N = 8;

	static int row = 0;
	static int column = 0;
	static int solv = 0;

	static int[] xMove = { 1, 2, 1, 2, -1, -1, -2, -2 };
	static int[] yMove = { 2, 1, -2, -1, 2, -2, -1, 1 };

	static int[][] grid = new int[N][N];

	static void gridFormation() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				grid[i][j] = -1;
			}
		}

		grid[row][column] = solv;
		printGrid();
		if (solve(row, column, 1)) {
			System.out.println("=============== SOLVED =================");
			System.out.println();
			printGrid();
		}
		else {
			System.out.println("=============== unable to solve =================");
		}

	}

	static boolean isValid(int r, int c) {
		return r < N && c < N && r >= 0 && c >= 0 && grid[r][c] == -1;
	}

	static boolean solve(int r, int c, int m) {
		int nextX, nextY;
		if (m == N * N)
			return true;
		for (int i = 0; i < N; i++) {
			nextX = r + xMove[i];
			nextY = c + yMove[i];
			if (isValid(nextX, nextY)) {
				grid[nextX][nextY] = m;
				if (solve(nextX, nextY, m + 1)) {
					return true;
				}
				else {
					grid[nextX][nextY] = -1;
				}
			}

		}
		return false;
	}

	static void printGrid() {
		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("| " + grid[i][j] + "   " + (j == N - 1 ? "|" : ""));
			}
			System.out.println();
			System.out.println("--------------------------------------------------------");
		}
	}

	public static void main(String[] args) {
		gridFormation();
	}

}
