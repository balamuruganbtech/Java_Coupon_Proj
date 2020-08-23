package com.exsist;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSequentialArraySubSet {
	
	public static Scanner scan = new Scanner(System.in);

	//public static int ar[] = { 20, 21, 22, 1, 5, 6, 7, 8, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 9, 40, 41, 42, 43, 44, 45, 46, 47 };
	public static int ar[];
	public static LinkedHashMap<Integer, Integer[]> map = new LinkedHashMap<Integer, Integer[]>();

	public static Integer[] createIntegerArray(int size, int start) {
		Integer[] in = new Integer[size];
		for (int i = 0; i < size; i++) {
			in[i] = ar[start];
			System.out.println(ar[start]);
			start++;
		}
		System.out.println();
		return in;
	}
	
	public static Integer[][] sortTwoDimArray(Integer[][] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i][1]>ar[j][1]){
					int key = ar[i][0];
					int value = ar[i][1];
					ar[i][0]=ar[j][0];
					ar[i][1]=ar[j][1];
					ar[j][0]=key;
					ar[j][1]=value;
				}
			}
		}
		return ar;
	}
	
	public static void input(){
		System.out.println("Enter the Array Size");
		int size = scan.nextInt();
		System.out.println("Array Size is "+size);
		System.out.println("Enter Array Value is ");
		ar = new int[size];
		for(int i=0;i<size;i++){
			ar[i]=scan.nextInt();
		}
		System.out.println();
		System.out.print
		("int ar[]={");
		for(int i=0;i<size;i++){
			System.out.print(ar[i]+", ");
		}
		System.out.print("};");
		System.out.println();
		
	}
	public static void main(String[] args) {
		input();
		int n = ar.length;
		int start = 0;
		int count = 0;
		int key = 1;
		for (int i = 0; i < n - 1; i++) {
			if (ar[i] == ar[i + 1] - 1) {
				count++;
			}
			else {
				map.put(key, createIntegerArray(count + 1, start));
				key++;
				// createIntegerArray(count+1, start);
				start = i + 1;
				count = 0;
			}
			if (i == n - 2) {
				map.put(key, createIntegerArray(count + 1, start));
				key++;
				// createIntegerArray(count+1, start);
				start = i + 1;
				count = 0;
			}
		}
		Integer sizeSubSet[][] = new Integer[map.size()][2];
		int flag=0;
		for (Map.Entry<Integer, Integer[]> m : map.entrySet()) {
			sizeSubSet[flag][0]=m.getKey();
			sizeSubSet[flag][1]=m.getValue().length;
			flag++;
		}
		sortTwoDimArray(sizeSubSet);
		
		// maximum subset of value is 
		Integer[] finalArray =  map.get(sizeSubSet[map.size()-1][0]);
		System.out.print("[");
		for(Integer i:finalArray){
			System.out.print(i+(i==finalArray.length-1?" ":", "));
		}
		System.out.print("]");
	}
}
