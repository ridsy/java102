package multithread;

class Task implements Runnable {  // Good-use this always as this task is lossly coupled

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Im running in thread");

	}

}

class TaskThread extends Thread{ //Not good logic as thread and logic is tightly coupled	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Im thread");

	}

}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task task = new Task(); //task

		// Runnable

		Thread thread1 = new Thread(task);
		thread1.start();
		
		TaskThread taskThread = new TaskThread();//task + thread
		taskThread.start();

	}

}
