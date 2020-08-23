package com.logics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NthNumberSystem {

	public static ArrayList<Integer> getList(ArrayList<Integer> al) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			list.add(al.get(i) * 10 + 4);
			list.add(al.get(i) * 10 + 7);
		}
		return list;
	}

	public static void main(String[] args) {
		int n = 3;
		Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al.add(4);
		al.add(7);
		map.put(1, al);
		for (int i = 2; i <= n; i++) {
			al = getList(map.get(i - 1));
			map.put(i, al);
		}
		for (int i = 1; i <= n; i++) {
			al1.addAll(map.get(i));
		}
		System.out.println(map);
		System.out.println(al1);
		// System.out.println(map);
		System.out.println(al1.get(49));
	}

}
