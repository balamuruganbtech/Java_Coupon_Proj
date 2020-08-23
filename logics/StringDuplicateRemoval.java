package com.logics;

import java.util.Arrays;

public class StringDuplicateRemoval {
	
	public static char[] sortArray(String s){
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return ch;
	}
	
	public static char[] duplicateCharRemove(char[] ch ){
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' ')
				continue;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					ch[j]=' ';
				}
			}
		}
		return ch;
	}
	
	public static void main(String[] args) {
		String s ="aaccttaabbbass";
		System.out.println("=========== BEFORE DUPLICATE REMOVAL ============");
		System.out.println(s);
		char[] ch =sortArray(s);
		ch =duplicateCharRemove(ch);
		System.out.println("=========== AFTER DUPLICATE REMOVAL ============");
		loop:for(int i=0;i<ch.length;i++){
			if(ch[i]==' ')
				continue loop;
			System.out.print(""+ch[i]+", ");
		}
		System.out.println();
	}
}
