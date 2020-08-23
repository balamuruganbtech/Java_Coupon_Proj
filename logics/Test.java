package com.logics;

public class Test {

	public static void main(String[] args) {
		Character[] ch= new Character[7];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='1';
		ch[4]='2';
		ch[5]='d';
		ch[6]='3';
		
		int n = ch.length;
		for(int i=0;i<n;i++){
			char c = ch[i];
			
			if(Character.isAlphabetic(c)){
				System.out.println("This is alphabetic "+c);
			}
			if(Character.isDigit(c)){
				System.out.println("This is numeric "+c);
				
			}
		}
	}
}
