/* Class implementing comparable interface and using compareTo to sort List*/

import java.util.*;
public class Fruit implements Comparable<Fruit>{
	
	String name;
	
	public Fruit(String name) { //Constructor
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public String toString() {
		String str = name;
		return str;
	}
	public int compareTo(Fruit fruit) {
		// TODO Auto-generated method stub
		return name.compareTo(fruit.getname());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> fruitlist = new ArrayList<Fruit>();
		Fruit f1 = new Fruit("Mango");
		Fruit f2 = new Fruit("Banana");
		Fruit f3 = new Fruit("Grapes");
		Fruit f4 = new Fruit("Apple");
		fruitlist.add(f1);
		fruitlist.add(f2);
		fruitlist.add(f3);
		fruitlist.add(f4);
		
		Collections.sort(fruitlist);
		System.out.println(fruitlist);
		
		

	}

}


	

