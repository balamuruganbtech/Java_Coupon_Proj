package com.logics;

public class DecimalToBinary {

	static char KEY_1 = '3';// if zero means it will replace by 3
	static char KEY_2 = '4';// if one means it will replace by 4

	static char ZERO = '0';
	static char ONE = '1';

	public static String convert(String s) {
		int len = s.length();
		char ar[] = s.toCharArray();
		for (int i = 0; i < len; i++) {
			if (ar[i] == ZERO) {
				ar[i] = KEY_1;
			}
			// if (ar[i] == ONE) {
			else {
				ar[i] = KEY_2;
			}
		}
		s = String.valueOf(ar);
		return s;
	}

	public static String toBinary(int n) {
		String result = "";
		while (n > 0) {
			int r = n % 2;
			n = n / 2;
			result = r + result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("BALAMURUGAN".substring(1));
		System.out.println("BALAMURUGAN".substring(2, 7));
		System.out.println("BALAMURUGAN".subSequence(2, 7));

		int n = 100001;
		String ar[] = new String[n];
		ar[0] = "-";
		ar[1] = "-";
		for (int i = 2; i < n; i++) {
			ar[i] = convert(toBinary(i).substring(1));
		}

		System.out.println("Key" + "\t" + "Value");
		for (int i = 0; i < n; i++) {
			System.out.println(i + "\t" + ar[i]);
		}
	}
}
