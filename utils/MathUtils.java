package com.utils;

public class MathUtils {
	public static boolean isPerfectSquare(int num) {
		int n = num / 2;
		for (int i = 1; i <= n; i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}

	public static boolean isDivisibleByFourAndSix(int num) {
		if (num % 4 == 0 && num % 6 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	
}
