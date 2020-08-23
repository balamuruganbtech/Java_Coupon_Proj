package com.exsist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class LuckyNumber {
	static int NUM_1=3;
	static int NUM_2=4;
	
	public static ArrayList<Integer> formNumberSystem(ArrayList<Integer> al){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++){
			list.add(al.get(i)*10+NUM_1);
			list.add(al.get(i)*10+NUM_2);
		}
		return list;
	}

	public static void main(String[] args) {
			int n = 15;
			Map<Integer,ArrayList<Integer>> map = new LinkedHashMap<>();
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(NUM_1);
			al.add(NUM_2);
			map.put(1, al);
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for(int i=2;i<=n;i++){
				int key = i-1;
				map.put(i, formNumberSystem(map.get(key)));
			}
			
			for(Map.Entry<Integer,ArrayList<Integer>> ma:map.entrySet()){
//				System.out.println(ma.getKey()+" "+ma.getValue());
				numList.addAll(ma.getValue());
			}
			System.out.println(numList);
	}

}
