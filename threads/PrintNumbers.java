package com.threads;

public class PrintNumbers extends Thread {

	Object lock;

	/**
	 * @param lock
	 */
	public PrintNumbers(Object lock) {
		super();
		this.lock = lock;
	}

	  static int i = 1;

	@Override
	public void run() {
		while (i <= 10) {
			if (i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized (lock) {
					System.out.println(Thread.currentThread().getName() + "-" + i);
					i++;
					
					try {
						lock.wait();
					}
					catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			}
			if (i % 2 == 1 && Thread.currentThread().getName().equals("odd")) {
				synchronized (lock) {
					System.out.println(Thread.currentThread().getName() + "-" + i);
					i++;
					lock.notify();
				}
			}
		}
	}

	public static void main(String[] args) {
		Object object = new Object();

		// This constructor is used for identify wait and notify
		// thread commumication

		PrintNumbers odd = new PrintNumbers(object);
		PrintNumbers even = new PrintNumbers(object);
		odd.setName("odd");
		even.setName("even");
		
		odd.start();
		even.start();

	}

}
