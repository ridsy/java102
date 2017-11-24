package multithread;

import java.util.concurrent.TimeUnit;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String [] items  = {"veg-biryani","egg Briyani","thali"};
		for (String item : items) {
			//Thread.sleep(2000/*mili*/,1000/*nano*/);
			TimeUnit.SECONDS.sleep(2);
			System.out.println(item);
		}

	}

}
