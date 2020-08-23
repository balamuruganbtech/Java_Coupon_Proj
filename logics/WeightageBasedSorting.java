package com.logics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.utils.MathUtils;

public class WeightageBasedSorting {

	public static Map<Integer, Integer> getWeightMap(ArrayList<Integer> al) {
		Map<Integer, Integer> weightMap = new LinkedHashMap<Integer, Integer>();
		for (Integer i : al) {
			int weight = 0;
			if (MathUtils.isPerfectSquare(i)) {
				weight += 5;
			}
			if (MathUtils.isDivisibleByFourAndSix(i)) {
				weight += 4;
			}
			if (MathUtils.isEven(i)) {
				weight += 3;
			}
			weightMap.put(i, weight);
		}
		return weightMap;
	}

	public static void sort(String type, Map<Integer, Integer> map) {
		// weight based sort
		if ("weight".equals(type)) {
			int size = map.size();
			for (int i = 0; i < size; i++) {
				Integer val1 = (Integer) map.get(i);
				for (int j = 0; j < size; j++) {
					Integer val2 = map.get(j);
					if (val1 > val2) {
						System.out.println(map.get(i));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(36);
		al.add(54);
		al.add(89);
		al.add(12);

		Map<Integer, Integer> weight = getWeightMap(al);

		// sort by weight
		sort("weight", weight);

	}
}
