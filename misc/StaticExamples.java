package com.misc;

public class StaticExamples {

	static int count = 0;

	void increment() {
		++count;
	}

	public static void main(String[] args) {
		StaticExamples se1 = new StaticExamples();
		StaticExamples se2 = new StaticExamples();
		se1.increment();
		se2.increment();
		System.out.println(count);
	}

}
