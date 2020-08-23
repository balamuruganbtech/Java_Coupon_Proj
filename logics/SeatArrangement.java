package com.logics;

public class SeatArrangement {

	public static void main(String[] args) {
		int ar[][]={{1,5,9,13,17,21},{2,6,10,14,18,22},{0,0,0,0,0,23},{3,7,11,15,19,24},{4,8,12,16,20,25}};
		for(int i=0;i<ar.length;i++){
			int n = ar[i].length;
			for(int j=0;j<n;j++){
				System.out.print(ar[i][j]!=0?(ar[i][j]+"\t"):"========");
			}
			System.out.println();
			System.out.println();
		}

	}

}
