package com.logics;

public class FibonacciSeries {
	public static int n = 15;
	public static int fib[] = new int[n];
	
	public static void printArray() {
		System.out.print("[");
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + (i == fib.length - 1 ? " " : ", "));
		}
		System.out.print("]");
	}
	public static void printNonFibonacci(int start, int end) {
		for(int i=start;i<end;i++){
			System.out.print(i+(i==end-1?" ":", "));
		}
	}
	

	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			if (i >= 2) {
				fib[i] = fib[i - 2] + fib[i - 1];
			}
			else {
				fib[i] = i;
			}
		}

		printArray();
		int itr = fib.length-1;
		System.out.println();
		System.out.println("===================== NON-FIBONACCI SERIES =======================");
		for(int i=0;i<itr;i++){
			int len = fib[i+1] - fib[i];
			if(len>=2){
				System.out.print("("+fib[i]+","+fib[i+1]+") ----> ");
				printNonFibonacci(fib[i]+1,fib[i+1]);
				System.out.println();
			}
		}
	}

}
