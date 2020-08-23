package com.logics;

import java.util.LinkedHashMap;
import java.util.Map;

public class LargestSubSetArray {
	
	public static LinkedHashMap<Integer,Integer[]> largestSubSetMap = new LinkedHashMap<Integer,Integer[]>();
	
	public static Integer[] getSubSetArray(int ar[], int size, int start){
		Integer[] integer = new Integer[size];
		for(int i=0;i<size;i++){
			integer[i]=ar[start];
			start++;
		}
		return integer;
	}
	
	public static void sortArrayASC(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}

		}
	}
	
	public static void sortTwoDimArrayASC(Integer ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i][1] < ar[j][1]) {
					int key = ar[i][0];
					int value= ar[i][1];
					ar[i][0] = ar[j][0];
					ar[i][1] = ar[j][1];
					ar[j] [0]= key;
					ar[j] [1]= value;
				}

			}

		}
	}



	public static void main(String[] args) {
		//200, 1, 2, 3, 4, 56, 54, 53, 55, 70, 60, 61, 62, 63, 65, 66, 67, 90, 88, 81, 100,64
		// 200,201, 1, 2, 3, 60, 61, 62,63
		int ar[] = {200,201, 1, 2, 3,4,5,6,7, 60, 61, 62,63};
		sortArrayASC(ar);
		int count=0;
		int tempCount=0;
		int pass=1;
		for (int i = 0; i < ar.length-1; i++) {
//			System.out.println(ar[i]);
			if(ar[i]==(ar[i+1]-1)){
				tempCount++;
			}else {
				if(tempCount>count){
//					System.out.println("pass- "+pass+"---->"+(tempCount+1));
					largestSubSetMap.put(pass, getSubSetArray(ar,(tempCount+1),(i-tempCount)));
					pass++;
					count = tempCount;
					tempCount=0;
				}
			}
		}
		//System.out.println(largestSubSetMap);
		Integer[][] result = new Integer[largestSubSetMap.size()][2];
		int flag=0;
		for(Map.Entry<Integer,Integer[]> map:largestSubSetMap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue().length);
			result[flag][0]=map.getKey();
			result[flag++][1]=map.getValue().length;
		}
		sortTwoDimArrayASC(result);
		Integer[]  largestSubSet = largestSubSetMap.get(result[0][0]);
		
		System.out.print("[");
		for(Integer iset:largestSubSet){
			System.out.print(iset+", ");
		}
		System.out.print("]");
	}

}
