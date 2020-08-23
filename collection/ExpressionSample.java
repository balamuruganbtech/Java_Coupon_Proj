package com.collection;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionSample {

	public static void main(String[] args) {

		String s = "{([])}";
		int n = s.length();
		Deque<Character> dq = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				dq.offer(ch);
			}
			if ((dq.peekLast() == '{' && ch == '}') || (dq.peekLast() == '[' && ch == ']') || (dq.peekLast() == '(' && ch == ')')) {
				System.out.println(ch);
				dq.pollLast();
			}
		}
		if(dq.peek()==null){
			System.out.println("balanced");
		}
		else{
			System.out.println("un-balanced");
		}
		System.out.println(dq);
		System.out.println("peek first" + dq.peekFirst());
		System.out.println("peek last" + dq.peekLast());
	}
}
