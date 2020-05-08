package com.nk.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class DeadLock {

	public static void main(String[] args) {

		Queue<String> queue = new Queue<>();

		Callable<String> task1 = () -> {
			queue.put("task1");
			return "task1";
		};

		Callable<String> task2 = () -> {
			return queue.get();

		};

		System.out.println(Thread.currentThread().getName());

	}

	static class Queue<T> {
		private List<T> queue = new ArrayList<T>(2);

		public synchronized void put(T t) throws InterruptedException {
			queue.add(t);
			Thread.sleep(10000);
		}

		public synchronized T get() throws InterruptedException {
			Thread.sleep(10000);
			return queue.get(0);
		}
	}

}
