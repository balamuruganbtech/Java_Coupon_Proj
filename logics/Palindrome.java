package com.logics;

public class Palindrome {
	public static void main(String[] args) {
		String s = "racecar";
		char[] ar = new char[s.length()];
		for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
			ar[j] = s.charAt(i);
		}
		String t = String.valueOf(ar);
		if (s.equals(t)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not-palindrome");
		}
	}
}
