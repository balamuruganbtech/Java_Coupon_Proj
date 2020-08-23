package com.logics;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Parenthisis {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Expression");
		String expr =scan.nextLine();
		Deque<Character> dq= new LinkedList<>();
		int counter=0;
		for(int i=0;i<expr.length();i++) {

			char ch = expr.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				dq.offer(ch);
				counter++;
			}
			
			if(ch==')' || ch=='}' || ch==']') {

				counter--;
				
			}
			
			if(dq.peek()!=null && ((ch==')' && dq.peekLast()=='(')|| (ch==']' && dq.peekLast()=='[') || (ch=='}' && dq.peekLast()=='{'))) {
				dq.pollLast();
			}
			
			if(counter<0) {
				break;
			}
			
		}
		
		if(dq.peek()==null && counter==0) {
			System.out.println("balanced");
		}else {
			System.out.println("un-balanced");
		}
	}
}
