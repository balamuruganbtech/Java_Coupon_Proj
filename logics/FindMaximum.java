package com.logics;

public class FindMaximum {
	public static void sortArray(int ar[]){
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]<ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
	}
	
	public static int findMaximumArray(int ar[]){
		return ar[0];
	}
	public static void main(String[] args) {
		int ar[]={100,1,3,6,7,99,108,19990};
		sortArray(ar);
		System.out.println(findMaximumArray(ar));
		
	}
}
