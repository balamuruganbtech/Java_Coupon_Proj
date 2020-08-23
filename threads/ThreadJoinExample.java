package com.threads;

/*
 * The join() method waits for a thread to die. 
 * In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.
 */
public class ThreadJoinExample implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + " -  " + (i + 1));
		}
	}

	public static void main(String[] args) {
		
		ThreadJoinExample tje = new ThreadJoinExample();
		
		Thread t1 = new Thread(tje);
		Thread t2 = new Thread(tje);
	
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		try {
			System.out.println("Join Started Here");
			t1.join();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
