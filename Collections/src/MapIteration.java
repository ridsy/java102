import java.util.*;
import java.util.Map.Entry;

public class MapIteration { // Class to show various iterations of map


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> emp = new HashMap<Integer,String>();
		emp.put(001,"Steve");
		emp.put(002,"Rob");
		emp.put(003,"Peter");
		emp.put(004,"Mark");
		emp.put(005,"John");
		emp.put(006,"Tom");
		
		//Iteration based on keys
		for(Integer Key: emp.keySet())
		{
			System.out.print(Key+" ");
		}
		System.out.println();
		//Iteration based on values
		for(String values: emp.values())
		{
			System.out.print(values +" ");
		}
		System.out.println();
		//Iteration based on entryset
		for(Entry<Integer, String> entry: emp.entrySet())
		{
			System.out.print(entry+" ");
		}
		
	}
}