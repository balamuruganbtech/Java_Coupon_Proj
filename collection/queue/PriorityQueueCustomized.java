package com.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomized {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(15, new Mycomparator());
		pq.offer("a");
		pq.offer("z");
		pq.offer("l");
		pq.offer("b");
		System.out.println(pq);
	}

}
class Mycomparator implements Comparator{

	public int compare(Object obj1, Object obj2) {
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
	
}