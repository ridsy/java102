package multithread;

import java.util.concurrent.TimeUnit;

public class Ex8 {

	public static void printMessage(String msg) {
		String name = Thread.currentThread().getName();
		System.out.println(name + "->" + msg);

	}

	private static class Counter {
//		private long c1 = 0;
//		private long c2 = 0;

		private Object boykey = new Object();
		private Object girlkey = new Object();

		public void inc1() {
			synchronized (boykey) {
				printMessage("inc..");
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				printMessage("incremented..");
			}
		}

		public void inc2() {
			synchronized (girlkey) {
				printMessage("inc..");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				printMessage("incremented..");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c = new Counter();

		Runnable r1 = () -> {

			c.inc1();
		};
		Runnable r2 = () -> {

			c.inc2();
		};
		
		Thread t1 = new Thread(r1,"boy1");
		Thread t2 = new Thread(r1,"boy2");
		

		Thread t3 = new Thread(r2,"girl1");
		Thread t4 = new Thread(r2,"girl2");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
