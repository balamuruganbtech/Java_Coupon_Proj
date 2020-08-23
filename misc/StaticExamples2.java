package com.misc;

public class StaticExamples2 {
	static int count;

	StaticExamples2() {
		System.out.println("constructor called " + (++count));
	}
	{
		System.out.println("world ");
	}
	void a() {
		System.out.println("testing");
	}

	public static void main(String[] args) {
		StaticExamples2 se1 = new StaticExamples2();
		se1.a();
		StaticExamples2 se2 = new StaticExamples2();
		StaticExamples2 se3 = new StaticExamples2();
		StaticExamples2 se4 = new StaticExamples2();
		System.out.println(count);
	}

	{
		System.out.println("hello ");
	}

}
