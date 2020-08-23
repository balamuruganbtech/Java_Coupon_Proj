package com.exsist;

public class Test {
	static char charUtil(char c) {
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		loop: for (int i = 0; i < 26; i++) {
			if (ch[i] == c) {
				if (i == 25) {
					c = ch[0];
					break loop;
				}
				else {
					c = ch[i + 1];
					break loop;
				}
			}
		}
		return c;
	}

	static String rollTheString(String s, int ar[]) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < ar.length; i++) {
			int num = ar[i];
			for (int j = 0; j < num; j++) {
				char ch = sb.charAt(j);
				char ch1 = Test.charUtil(ch);
				sb.setCharAt(j, ch1);
			}
		}
		s = sb.toString();
		return s;
	}

	public static void main(String[] args) {
		String s = "vwxyz";
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println("hello---->" + rollTheString(s, ar));
		// rollTheString(s,ar);
	}

}
