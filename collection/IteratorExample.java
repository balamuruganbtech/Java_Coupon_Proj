package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * 	DESC:
 * =========
 * java.util.ConcurrentModificationException is a very common exception when working with java collection classes. 
 * Java Collection classes are fail-fast, which means if the Collection will be changed while some thread is traversing over it
 * using iterator, the iterator.next() will throw ConcurrentModificationException. Concurrent modification exception can 
 * come in case of multithreaded as well as single threaded java programming environment.
 * 
 * From the output stack trace, its clear that the concurrent modification exception is coming when we call iterator next() function. 
 * If you are wondering how Iterator checks for the modification, its implementation is present in AbstractList class where an int variable modCount is defined. 
 * modCount provides the number of times list size has been changed. 
 * modCount value is used in every next() call to check for any modifications in a function checkForComodification().
 */
public class IteratorExample {
	public static void main(String[] args) {
		List<String> al = new CopyOnWriteArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		System.out.println(al);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			String value=itr.next();
			if(value.equals("e")){
//				al.add("f");
				al.remove(value);
//				itr.remove();
			}
		}
		System.out.println(al);
		
		/*Map<String,String> hm = new LinkedHashMap<>();
		hm.put("1", "one");
		hm.put("2", "2");
		hm.put("3", "3");
		hm.put("4", "4");
		hm.put("5", "5");
		
		 	// Getting concurrent modification exception
			Iterator<String> itr = hm.keySet().iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
				if(hm.get(itr.next()).equals("5")){
	
				}
				
			}
		
		for(String s:hm.keySet()){
			if(hm.get(s).equals("5")){
				hm.put("6","6");
			}
		}
		System.out.println(hm);*/
 	}
}
