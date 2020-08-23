package com.collection.stack;

public class StackChar {
	private int top;
	private int maxSize;
	private char charArray[];

	public StackChar(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.charArray = new char[maxSize];
	}

	void push(char c) {
		if (isFull()) {
			System.out.println("Stack overflow error");
		}
		else {
			top++;
			charArray[top] = c;
		}
	}

	char pop() {
		if (isEmpty()) {
			System.out.println("Already Empty stack");
			return '0';
		}
		else {
			int old_pos = top;
			top--;
			return charArray[old_pos];
		}
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return maxSize - 1 == top;
	}
}
