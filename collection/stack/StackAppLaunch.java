package com.collection.stack;

class Stack {
	private int top;
	private int maxSize;
	private long[] stackArray;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}

	public void push(long j) {
		if (isFull()) {
			System.out.println(" The stack is overflow full ");
		}
		else {
			top++;
			stackArray[top] = j;
		}
	}

	public long pop() {
		if (isEmpty()) {
			System.out.println("the stack is already empty");
			return -1;
		}
		else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}

	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

}

public class StackAppLaunch {

	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(5);
		s.push(4);
		s.push(2);
		s.push(1);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		s.pop();
	}

}
