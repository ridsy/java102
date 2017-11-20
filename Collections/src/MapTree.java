import java.util.*;
import java.util.Map.Entry;
public class MapTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String> emp = new TreeMap<Integer,String>();
		emp.put(1,"Steve");
		emp.put(5,"Rob");
		emp.put(3,"Peter");
		emp.put(4,"Mark");
		
		for(Entry<Integer, String> entry : emp.entrySet()) {
			
			System.out.println(entry);
			
		}

	}

}
