package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	
	public static void main(String[] args) {
		/*
			ArrayList al = new ArrayList();
			al.add(1);
			al.add(5.5F);
			al.add("test");
			al.add(true);*/
		
		
/*		Iterator itr = al.iterator();
		int i=0;
		while(itr.hasNext()){
			System.out.println(itr.next());
			if(al.get(i).equals("test")){
				al.remove(al.get(i));
//				al.add("hello");
				//al.set(i, "hello");
			}
			i++;
		}*/
	
		
		/*
		 for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
			if(al.get(i).equals("test")){
				al.add("hello");
			}
		}
		*/
	/*	for(Object l:al){
			System.out.println(l);
		}
		System.out.println(al);
		*/
		
		int i=5;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);// new Integer(1) ----> Auto boxing
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(i);
		
		int j = al.get(3); // ---> un-boxing
		for(Integer iObj:al){
			System.out.println(iObj);
		}
		
	}
}
