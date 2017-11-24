package multithread;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Ex5 {

	public static void printthreadMessage(String message) {

		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}

	private static class ProgramLoop implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
				try {
					for (int i = 0; i < 15; i++) {
					TimeUnit.SECONDS.sleep(2);
					printthreadMessage(String.valueOf(i));
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					printthreadMessage("i wasn't done");
				}

			}

		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		printthreadMessage("starting ProgramLoop thread");
		Thread thread = new Thread(new ProgramLoop(), "student");
		thread.start();

		printthreadMessage("Waiting for ProgramLoop Thread to finish");
		while (thread.isAlive()) {
			printthreadMessage("Still waiting");
			thread.join(15 * 1000); //thread.join(0);//not interrupting after 15 sec
			if (thread.isAlive()) {
				printthreadMessage("interrupting..");
				thread.interrupt();
				//break;
			}
		}
		printthreadMessage("Finally..we r moving to next topic");

	}

}
