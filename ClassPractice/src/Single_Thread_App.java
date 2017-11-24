import java.util.Scanner;

class Task1{
	public void doTask1() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Hello"+name);
		scanner.close();
	}
}


class Task2{
	public void doTask2() {
		for(int i =0;i<100;i++) {
			System.out.println(i);
		}
	}
}


public class Single_Thread_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
