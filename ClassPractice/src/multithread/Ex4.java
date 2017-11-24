package multithread;

import java.util.concurrent.TimeUnit;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Runnable doProgram = ()->{
	  
	  
	  System.out.println("working on progarm..");
	  System.out.println("got doubt..");
	  
	  Thread tnrThread = new Thread(()->{
		  System.out.println("finding solution");
		  try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("this is solution to your doubt"); 
	  });
	  
	  tnrThread.start();
	  
	  try {
		tnrThread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  };
	}
	
	//Thread t = new Thread(doProgram);
	

}
