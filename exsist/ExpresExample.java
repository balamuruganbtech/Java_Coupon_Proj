package com.exsist;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

public class ExpresExample {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the expression to validate ");
		String exp = dis.readLine();
		int n = exp.length();
		Deque<Character> dq = new LinkedList();
		dis.close();
		int counter=0;
		for(int i=0;i<n;i++){
			char ch = exp.charAt(i);
			if(ch=='(' || ch=='{' || ch=='['){
				dq.offer(ch);
				counter++;
			}
			if(ch==')' || ch=='}' || ch==']'){
				counter--;
			}
			if(counter<0){
				break;
			}
			if(dq.peek()!=null && ((ch==')' && dq.peekLast()=='(') || (ch==']' && dq.peekLast()=='[') || (ch=='}' && dq.peekLast()=='{'))){
				dq.pollLast();
			}
		}
		
		if(dq.peek()==null && counter==0){
			System.out.println("Balanced");
		}else{
			System.out.println("Un-Balanced");
		}
		
	}

}
