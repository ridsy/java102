package multithread;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Runnable runnable = ()->{
			
			//Running
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 500; i++) {
				
				System.out.println(name+"-->"+i);
				//Not ready to run --> ready to run
			}
			//Dead
		};
		
		Thread thread1 = new Thread(runnable,"A"); //New state
		Thread thread2 = new Thread(runnable,"B");
		Thread thread3 = new Thread(runnable,"C");
		
        thread1.start(); //ready to run
        thread2.start();
        thread3.start();
	}

}
