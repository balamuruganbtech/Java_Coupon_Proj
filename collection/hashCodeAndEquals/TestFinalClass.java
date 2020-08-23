package com.collection.hashCodeAndEquals;

final class Test {
	private final double x;
	private final double y;

	/**
	 * @param x
	 * @param y
	 */
	public Test(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

}

public class TestFinalClass {

	public static void main(String[] args) {
		Test t = new Test(11.0, 12.0);
		System.out.println(t);
	}

}
