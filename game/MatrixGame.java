package com.game;

import java.util.Scanner;

public class MatrixGame {

	int n;
	Scanner scan;
	Character ch[][];
	Character result[][];

	public MatrixGame() {
		n = 3;
		scan = new Scanner(System.in);
		ch = new Character[n][n];
		ch[0][0] = '4';
		ch[0][1] = '7';
		ch[0][2] = 'X';
		ch[1][0] = '3';
		ch[1][1] = '8';
		ch[1][2] = '6';
		ch[2][0] = '1';
		ch[2][1] = '5';
		ch[2][2] = '2';

		result = new Character[n][n];
		result[0][0] = '1';
		result[0][1] = '2';
		result[0][2] = '3';
		result[1][0] = '4';
		result[1][1] = '5';
		result[1][2] = '6';
		result[2][0] = '7';
		result[2][1] = '8';
		result[2][2] = 'X';
	}

	void print() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ch[i][j] + "  ");
			}
			System.out.println();
		}
	}

	void solve() {
		do {
			System.out.println("Enter the Key ");
			String str = scan.next();

		}
		while (true);
	}

	boolean isSafe(char ch) {
		if (ch == 'a' || ch == 'A') {

		}
		else if (ch == 'd' || ch == 'D') {

		}
		else if (ch == 's' || ch == 'S') {

		}
		else if (ch == 'w' || ch == 'W') {

		}
		return true;
	}

	public static void main(String[] args) {
		MatrixGame fg = new MatrixGame();
		fg.print();
		fg.solve();

	}

}
