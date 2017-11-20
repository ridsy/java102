import java.util.ArrayList;
import java.util.Collections;

public class ListClass { // Class to show implementation of ArrayList

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Cherry");
		fruits.add("Apple");
		fruits.add("Strawberry");
		fruits.add("Banana");
		
		Collections.sort(fruits); // Sort Method to sort the arraylist
		
		System.out.println("Fruit list after sorting");
		for(String fruit : fruits)
			System.out.println(fruit);
		
	}

}
