import com.annotation.container.Container;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container cont = new Container();
		try {
			//cont.process("/register", "POST");
			cont.process("/login", "GET","ridhi","password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
