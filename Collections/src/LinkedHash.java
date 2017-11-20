import java.util.*;
import java.util.Map.Entry;

public class LinkedHash { //class to implement linkedhashmap

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer,String> emp = new LinkedHashMap<Integer,String>();
		emp.put(1,"Steve");
		emp.put(5,"Rob");
		emp.put(3,"Peter");
		emp.put(4,"Mark");
		
		for(Entry<Integer, String> entry : emp.entrySet()) {
			
			System.out.println(entry);
			
		}

	}

}
