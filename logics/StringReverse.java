package com.logics;

public class StringReverse {
	static int flag=0;
	static String[] s1 =null;
	
	public static void copyArray(int size, int start, int end, String s){
		char ar[] = new char[size];
		for(int i=0;i<size;i++){
			ar[i]=s.charAt(start);
			start++;
		}
		s1[flag]=String.copyValueOf(ar);
		flag++;
	}
	
	public static int findSpaceOccurence(String s){
		int flag=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				flag++;
			}
		}
		return flag+1;
	}
	
	public static void test(char ar[], String s){
		int start=0;
		int end=0;
		int size=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]==' ' || (ar.length-1)==i){
				//System.out.println();
				//System.out.print("("+start+","+(end-1)+")"+" ");
				copyArray((ar.length-1)==i?size+1:size, start, end, s);
				start=end+1;
				 end++;
				 size=0;
				continue;
			}
			end++;
			size++;
		}
	}
	
	public static void main(String[] args) {
		String s="alpha beta gamma comma ";
		s=s.trim();
		s1=new String[findSpaceOccurence(s)];
		test(s.toCharArray(), s);
		s="";
		for(int i=s1.length-1;i>=0;i--){
			s=s+s1[i]+" ";
		}
		System.out.print(s);
		
	}
}
