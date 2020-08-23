package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("f");
//		System.out.println("List Data ----> "+al);
		
		HashSet<Object> hs = new HashSet();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		hs.add("f");
		
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=1;i<5;i++){
			list.add("a"+i);
		}
		System.out.println(list);
		String temp = list.get(59);
		list.set(59, list.get(99));
		list.set(99, temp);
		System.out.println(list);
//		System.out.println("List Data ----> "+hs);
				
	}
}
