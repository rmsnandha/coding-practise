package com.nk.concurrent;

public class ThreadFunctions {

	public static void main(String[] args) throws Exception {

		Runnable task1 = () -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task 1 exit");
		};

		Runnable task2 = () -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task 2 exit");
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
		
		//t1.yield();
		
		t1.join();
		t2.join();
		
		
		
		
		System.out.println("main thread exit");
		
	}

}
