package com.logics;

public class PrintXCrossPattern {
 
	public static void main(String[] args) {
			String s="ABC";
			int n = s.length();
			for(int i=0,j=n-1;i<s.length();i++,j--){
				int splitLen=s.length()/2;
				if(i<splitLen){
					for(int k=0;k<i;k++){
						System.out.print(" ");
					}
					System.out.print(s.charAt(i));
					
					for(int l=0;l<(j-i-1);l++){
						System.out.print(" ");
					}
					System.out.print(s.charAt(j));
					System.out.println();
				}else if(i==splitLen){
					for(int k=0;k<i;k++){
						System.out.print(" ");
					}
					System.out.println(s.charAt(i));
				}else if(i>splitLen){
					for(int k=j;k>0;k--){
						System.out.print(" ");
					}
					System.out.print(s.charAt(j));
					
					for(int l=0;l<(i-j-1);l++){
						System.out.print(" ");
					}
					System.out.print(s.charAt(i));
					System.out.println();
				}
			}
	}

}
