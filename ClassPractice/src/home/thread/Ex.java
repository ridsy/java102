package home.thread;

import java.util.concurrent.TimeUnit;

public class Ex {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + message);
	}

	private static Object lock = new Object();

	public static class Sequence {

		private int terms;
		private static int buf;

		public Sequence(int terms) {
			super();
			this.terms = terms;
		}

		public void printEven() throws InterruptedException {

			synchronized (lock) {
				for (int i = 0; i < terms; i += 2) {

					    if(buf == 1)
						lock.wait();

					buf++;
					TimeUnit.SECONDS.sleep(1);
					printMessage(String.valueOf(i));
					lock.notify();

				}

			}
		}

		public void printOdd() throws InterruptedException {

			synchronized (lock) {
				for (int i = 1; i < terms; i += 2) {

					    if(buf == 0)
						lock.wait();

					buf--;
					TimeUnit.SECONDS.sleep(1);
					printMessage(String.valueOf(i));
					lock.notify();

				}

			}
		}

	}

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence(20);

		Runnable even = () -> {
			try {
				sequence.printEven();
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
		};

		Runnable odd = () -> {
			try {
				sequence.printOdd();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread tEven = new Thread(even, "Even");
		Thread tOdd = new Thread(odd, "Odd");
		tEven.start();
		tOdd.start();

	}

}
