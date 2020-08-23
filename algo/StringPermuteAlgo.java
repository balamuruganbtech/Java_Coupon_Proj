package com.algo;

import java.util.HashSet;

public class StringPermuteAlgo {
	
	static int i=0;
	static HashSet<String> hs = new HashSet<>();

	String swap(String s, int n1, int n2){
		int n = s.length();
		char[] ch = s.toCharArray();
		char temp = ch[n1];
		ch[n1]=ch[n2];
		ch[n2]=temp;
//		System.out.println("Inner Swap ---> "+String.valueOf(ch));
		return String.valueOf(ch);
	}
	void permute(String s, int start, int end) {
		if (start == end) {
			i=i+1;
			hs.add(s);
			System.out.println("Result "+i+" ---> "+s);
		}
		else {
			for (int i = start; i <= end; i++) {
				s=swap(s,start,i);
				permute(s, start+1, end);
				s=swap(s,start,i);
			}
		}

	}

	public static void main(String[] args) {
		String s = "yoyoyoyo";
		int n = s.length();

		StringPermuteAlgo sp = new StringPermuteAlgo();
		sp.permute(s, 0, n - 1);
		
		System.out.println("size ====> "+hs.size());
		System.out.println(hs);
	}

}
