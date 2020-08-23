package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
			PriorityQueue pq = new PriorityQueue();
			System.out.println("Peek Element "+pq.peek());
			//System.out.println(pq.element());
			for(int i=0;i<=10;i++){
				pq.offer(i);
			}
			System.out.println(pq);
			System.out.println("Peek Element "+pq.peek());
			System.out.println("Poll Element "+pq.poll());
			System.out.println(pq);
			System.out.println("Peek Element "+pq.peek());
			System.out.println("Element "+pq.element());
			System.out.println(pq);
			
	}

}
