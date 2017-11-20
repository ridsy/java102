import java.util.HashMap;

public class MapTest { // Class to implement some hashmap api methods


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> emp = new HashMap<Integer,String>();
		emp.put(001,"Steve");
		emp.put(002,"Rob");
		emp.put(003,"Peter");
		emp.put(004,"Mark");
		emp.put(005,"John");
		emp.put(006,"Tom");
		
		System.out.println(emp.keySet());//Printing all keys of Map
		
		emp.remove(4); //Removing Employee with id=4
		
		System.out.println(emp);//Printing remaining employees
		

	}

}
