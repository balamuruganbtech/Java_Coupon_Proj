package com.misc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
	/*public static  add(Queue<String> q){
		q = new LinkedList<>();
		q.add("123");
	}
*/
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("new york");
		q.add("texas");
		q.add("london");
		System.out.println(q);
		q.add(new Integer(11).toString());
		System.out.println(q);
	}

}
