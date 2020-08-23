package com.logics;

import java.util.ArrayList;

public class PrintLettersBasedOnNumericValue {
	
	public static void printCharcter(char ch, int n){
		for(int i=0;i<n;i++){
			System.out.print(ch);
		}
	}
	
	public static void main(String[] args) {
//		String s="s1000a4b3";
		String s="15B3A2L";
		
		ArrayList<Character> characterList = new ArrayList<Character>(); 
		ArrayList<Integer> integerList = new ArrayList<Integer>(); 

		int num=0;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(Character.isDigit(ch)){
				if(num==0){
					num=Integer.parseInt(String.valueOf(ch));
					integerList.add(num);
				}else{
					num = (num*10)+Integer.parseInt(String.valueOf(ch));
					integerList.set(integerList.size()-1, num);
				}
			}else{
				characterList.add(ch);
				num=0;
			}
		}
		
		for(int i=0;i<characterList.size();i++){
			char ch = characterList.get(i);
			int size = integerList.get(i);
			printCharcter(ch,size);
		}

	}

}
