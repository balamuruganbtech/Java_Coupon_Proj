package com.logics;

public class BTPatternPrint {
	public static String s = "BALA";
	public static int n = s.length();

	public static void iterator(int val) {
		for (int k = 0; k < n; k++) {
			int count = 0;
			for (int i = k; i < n; i++) {
				for (int j = k; j <= count; j++) {
					System.out.print(s.charAt(j));
				}
				count++;
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j <n; j++) {
				System.out.print(s.charAt(j));
			}
			count++;
			System.out.println();
		}
		//iterator(5);
	}

}
