package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Color {
	static HashMap<String, Integer> colorMap;

	String name;

	/**
	 * @param name
	 */
	public Color(String name) {
		super();
		this.name = name;
		colorMap = new HashMap();
		colorMap.put("red", 1);
		colorMap.put("green", 2);
		colorMap.put("blue", 3);
		colorMap.put("orange", 4);
		colorMap.put("yellow", 5);
	}

	public String toString() {
		return "HashCode(" + this.name + " - " + this.hashCode() + "- " + System.identityHashCode(this) + ")";
	}

	/*
	 * public int hashCode() {
	 * final int prime = 31;
	 * int result = 1;
	 * result = prime * result + ((name == null) ? 0 : name.hashCode());
	 * return colorMap.get(this.name);
	 * }
	 */

	/*
	 * @Override
	 * public boolean equals(Object obj) {
	 * if (this == obj)
	 * return true;
	 * if (obj == null)
	 * return false;
	 * if (getClass() != obj.getClass())
	 * return false;
	 * Color other = (Color) obj;
	 * if (name == null) {
	 * if (other.name != null)
	 * return false;
	 * } else if (!name.equals(other.name))
	 * return false;
	 * return true;
	 * }
	 */

}

public class CustomObject {

	public static void main(String[] args) {

		Color c1 = new Color("red");
		Color c2 = new Color("green");
		Color c3 = new Color("blue");
		Color c4 = new Color("yellow");
		Color c5 = new Color("orange");
		Color c6 = new Color("red");

		ArrayList<Color> al = new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c6);

		HashSet<Color> hs = new HashSet();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		hs.add(c6);

		System.out.println("================== Before ==================");
		System.out.println("ArrayList Size = --- >" + al.size());
		System.out.println("HashSet Size = --- >" + hs.size());

		// System.out.println("ArrayList"+al);
		System.out.println("HashSet" + hs);

		System.out.println("Diff == ----->" + (c1 == c6));
		System.out.println("Diff .equals() ----->" + c1.equals(c6));
	}
}
