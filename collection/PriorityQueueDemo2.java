package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2	 {

	public static void main(String[] args) {
		MyComparator comp = new MyComparator();
		PriorityQueue pq = new PriorityQueue(11,comp);
		System.out.println(pq);
		pq.offer("A");
		pq.offer("A");
		pq.offer("Z");
		pq.offer("L");
		pq.offer("B");
		pq.offer("B");
		System.out.println(pq);
	}

}
class MyComparator implements Comparator{

	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
	
}
