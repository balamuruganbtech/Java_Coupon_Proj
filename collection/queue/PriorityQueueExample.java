package com.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
			PriorityQueue pq = new PriorityQueue();
			System.out.println(pq.peek());
		//	System.out.println(pq.element());
			for(int i=0;i<=10;i++){
				pq.offer(i);
			}
			for(int i=0;i<=5;i++){
				pq.poll();
			}
			System.out.println(pq);
			System.out.println(pq.peek());
			System.out.println(pq.element());
			System.out.println(pq.poll());
			System.out.println(pq.remove());
			System.out.println(pq);
	}
}
