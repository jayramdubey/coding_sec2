package tookMock;

/*Producer-Consumer solution using threads in Java
In computing, the producer-consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem. The problem describes two processes, the producer and the consumer, which share a common, fixed-size buffer used as a queue.

The producer�s job is to generate data, put it into the buffer, and start again.
At the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time.*/

import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {

		final PC pc = new PC();

		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// This class has a list, producer (adds items to list
	// and consumber (removes items).
	public static class PC {

		// Create a list shared by producer and consumer
		// Size of list is 2.
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		// Function called by producer thread
		public void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					// producer thread waits while list is full
					while (list.size() == capacity)
						wait();
					System.out.println("Producer produced-" + value);
					list.add(value++);
					notify();
					Thread.sleep(1000);
				}
			}
		}

		// Function called by consumer thread
		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					// consumer thread waits while list
					// is empty
					while (list.size() == 0)
						wait();
					// to retrive the first job in the list
					int val = list.removeFirst();

					System.out.println("Consumer consumed-" + val);
					// Wake up producer thread
					notify();

					Thread.sleep(1000);
				}
			}
		}
	}
}
