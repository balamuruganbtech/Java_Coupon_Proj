package com.misc;

import java.util.LinkedHashMap;

public class FindDistinctValueSingleItr {

	public static void main(String[] args) {
		
		int ar[]={3,2,3,1,2,5};
		int n = ar.length;
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<n;i++){
			if(i==0){
				map.put(ar[i], ar[i]);
				continue;
			}else if(map.get(ar[i])==null){
				map.put(ar[i], ar[i]);
			}else if(map.get(ar[i])!=null){
				System.out.println(map.get(ar[i])+" removed here ");
				map.remove(ar[i]);
			}
		}
		System.out.println("final map --->"+map);
	}

}
