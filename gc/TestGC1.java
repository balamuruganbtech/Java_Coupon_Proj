package com.gc;

public class TestGC1 {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		TestGC1 s1 = new TestGC1();
		TestGC1 s2 = new TestGC1();
		s1 = null;
		s2 = null;
		System.gc();
	}

}
