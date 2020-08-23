package com.logics;

import java.util.LinkedHashMap;

public class LargestSubSetArray1 {
	
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
	
	public static void main(String[] args) {
		//200, 1, 2, 3, 4, 56, 54, 53, 55, 70, 60, 61, 62, 63, 65, 66, 67, 90, 88, 81, 100,64
		// 200,201, 1, 2, 3, 60, 61, 62,63
//					largestSubSetMap.put(pass, getSubSetArray(ar,(tempCount+1),(i-tempCount)));
		int ar[] = {200,201, 1, 2, 3, 60, 61, 62,63,270};
		sortArrayASC(ar);
		int count=0;
		int tempCount=0;
		int pass=1;
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==(ar[i+1]-1)){
				tempCount++;
			}else {
				if(tempCount>count){
					System.out.println(pass +" "+(tempCount+1));
					pass++;
					count = tempCount;
					tempCount=0;
				}else{
					System.out.println(pass +" "+(tempCount+1));
					pass++;
				}
			}
		}
		if(tempCount>count){
			System.out.println(pass +" "+(tempCount+1));
			pass++;
			count = tempCount;
			tempCount=0;
		}else{
			System.out.println(pass +" "+(tempCount+1));
			pass++;
		}
	}

}
