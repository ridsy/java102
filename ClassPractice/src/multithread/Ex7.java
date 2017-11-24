package multithread;

import java.util.concurrent.TimeUnit;

public class Ex7 {

	public static void printMessage(String msg) {
		String name = Thread.currentThread().getName();
		System.out.println(name + "->" + msg);

	}

	private static class Building {

		public synchronized void room1() {
			printMessage("in room1");

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printMessage("existing room1");
		}

		 public synchronized void room2() {
		 printMessage("in room2");
		 try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printMessage("existing room2");
		}
		 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building building1 = new Building();

		Runnable r1 = () -> {
			building1.room1();
		};

		 Runnable r2 = ()->{
		 building1.room2();
		 };

		Thread thread1 = new Thread(r1,"Ridhi");
		Thread thread2 = new Thread(r2,"Disha");
		thread1.start();
		thread2.start();

	}

}
