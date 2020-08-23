package com.logics;

public class Array {

	public static void printArray(int ar[], String type) {
		int n = ar.length;
		System.out.println();
		System.out.println("=============================== " + type + " ===============================");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + (i == n - 1 ? "" : ", "));
		}
	}

	public static void ascArray(int ar[]) {
		int n = ar.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		printArray(ar, "ASC");
	}

	public static void descArray(int ar[]) {
		int n = ar.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		printArray(ar, "DESC");
	}

	public static void rearrangeArray(int ar[]) {
		ascArray(ar);
		boolean flag = true;
		int n = ar.length;
		int small = 0;
		int large = n - 1;
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (flag) {
				b[i] = ar[large];
				large--;
			}
			else {
				b[i] = ar[small];
				small++;
			}
			flag = !flag;
		}
		printArray(b, "REARRANGED ARRAY");
	}

	public static void main(String[] args) {
		int ar[] = { 5, 3, 2, 4, 6, 7, 8, 1, 9 };
		ascArray(ar);
		descArray(ar);
		rearrangeArray(ar);
	}
}
