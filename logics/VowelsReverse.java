package com.logics;

import java.util.Scanner;

public class VowelsReverse {

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'A' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to vowel reverse ");// BALE, hello
																// world,
																// RANSOMEWARE
		StringBuilder sb = new StringBuilder(scan.nextLine());
		int n = sb.length();
		outer: for (int i = 0, j = n - 1; i < n; i++) {
			char ch = sb.charAt(i);
			if (isVowel(ch)) {
				inner: for (; j > i;j--) {
					char ch2 = sb.charAt(j);
					if (isVowel(ch2)) {
						sb.setCharAt(i, ch2);
						sb.setCharAt(j, ch);
						j--;
						break inner;
					}
				}
			}
		}
		System.out.println(sb);
	}
}
