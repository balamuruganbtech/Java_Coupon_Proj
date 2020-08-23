package com.logics;

public class SortingExample {

	public static void main(String[] args) {
			int ar[]={2,3,1};
			for(int i=0;i<ar.length;i++){
				for(int j=i+1;j<ar.length;j++){
					if(ar[i]>ar[j]){
						int temp= ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
			for(int i=0;i<ar.length;i++){
				System.out.println(ar[i]);
			}
	}

}
