package com.logics;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a=100;
		int b=500;
		System.out.println("Before Swapping ("+a+","+b+")");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping ("+a+","+b+")");
		
	}
}
