package tookMock;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	
	    public static void main(String[] args) throws InterruptedException {
	    	
	        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(10);
	        
	        Thread producerThread = new Thread(() -> {
	            try {
	                int value = 0;
	                while (value<=10) {
	                    blockingQueue.put(value);
	                    
	                    System.out.println("Produced " + value);
	                    value++;
	                    Thread.sleep(2000);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });
	        
	        Thread consumerThread = new Thread(() -> {
	            try {
	                while (true) {
	                    int value = blockingQueue.take();
	                    System.out.println("Consumed " + value);
	                    Thread.sleep(2000);
	                    if(value == 10)
	                    	return;
	                   
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });
	        
	        
	        producerThread.start();
	        consumerThread.start();
	        
	        
	        producerThread.join();
	        consumerThread.join();
	    }
	}