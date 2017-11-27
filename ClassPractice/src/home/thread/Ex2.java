package home.thread;

import java.util.concurrent.TimeUnit;

public class Ex2 {


	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + message);
	}
	
	private static int count = -1;
	private static int BUFFER_SIZE = 10;
	private static final int[] BUFFER = new int[BUFFER_SIZE];
	private static final Object LOCK = new Object();
	
	public static boolean isFull() {
		return count==(BUFFER_SIZE - 1);
	}
	
	public static boolean isEmpty() {
		return count == -1;
	}
	
	private static class Producer{
		public void produce() throws InterruptedException {
			
			synchronized (LOCK) {
				
				while(true) {
					if(isFull()) {
						printMessage("buffer full..,going to wait");
						
						try {
							LOCK.wait();
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					TimeUnit.SECONDS.sleep(2);
					++count;
					BUFFER[count]= (int)(Math.random()*100);
					//count++;
					
					printMessage("produced new item & notify other");
					LOCK.notifyAll();
				}
			}
			
		}
	}
	
	
	private static class Consumer{
		public void consume() throws InterruptedException {
			
			synchronized (LOCK) {
				
				while(true) {
					if(isEmpty()) {
						
						printMessage("buffer empty..,going to wait");
						
						try {
							LOCK.wait();
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					TimeUnit.SECONDS.sleep(2);
					printMessage("consumed item & notify other");
					BUFFER[count]= 0;
					count--;
					LOCK.notifyAll();
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		Runnable p = ()->{
			try {
				producer.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable c = ()->{
			try {
				consumer.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		
		Thread pThread = new Thread(p,"Producer");
		Thread cThread = new Thread(c,"Consumer");
		
		pThread.start();
		cThread.start();
	}

}
