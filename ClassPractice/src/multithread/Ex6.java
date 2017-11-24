package multithread;

public class Ex6 {
	
     private static class Counter{
    	 private int c;
    	 
    	 public synchronized void increment() {
			c =c+1;
		}
    	 public synchronized void decrement() {
 			c =c-1;
 		}
    	 public int getValue() {
    		 return c;
    	 }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter counter = new Counter();
		
		Runnable r1 = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};
		
		Runnable r2 = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.decrement();
			}
		};
		
		Thread [] incthread= new Thread[1000];
		Thread [] decthread= new Thread[1000];
		for (int i=0;i<1000;i++) {
			incthread[i] = new Thread(r1);
			decthread[i] = new Thread(r2);
			
			incthread[i].start();
			decthread[i].start();
		}
		
		for (int i = 0; i < 1000; i++) {
			try {
				incthread[i].join();
				decthread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(counter.getValue());

	}

}
