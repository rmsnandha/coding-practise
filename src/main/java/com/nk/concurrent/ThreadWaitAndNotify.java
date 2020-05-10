package com.nk.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitAndNotify {

	public static void main(String[] args) {

		Resource r = new Resource();

		Runnable task1 = () -> {
			try {

				for (int i = 1; i <= 4; i++) {
					r.method1();
				}

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		};

		Runnable task2 = () -> {
			try {

				for (int i = 1; i <= 4; i++) {
					r.method2();
				}

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(task1, "thread-1");
		Thread t2 = new Thread(task2, "thread-2");
		t1.start();
		t2.start();

		// System.out.println("main thread exit");

	}

	static class Resource {

		private Lock lock = new ReentrantLock();

		public void method1() throws InterruptedException {
			lock.lock();
			lock.newCondition().wait();
			System.out.println("method1 " + Thread.currentThread().getName());
			//wait(3000);
			System.out.println("method-1  after  waiting " + Thread.currentThread().getName());
			lock.unlock();
		}

		public void method2() throws InterruptedException {
			
			lock.lock();
			lock.newCondition().signalAll();
			System.out.println("method2 " + Thread.currentThread().getName());
			//notify();
			System.out.println("method-2 after notify " + Thread.currentThread().getName());
			//wait(3000);
			lock.unlock();

		}

	}

}
