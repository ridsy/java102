/* Class implementing comparator interface and using compare to sort List*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class FruitComparator implements Comparator<Fruit2>{
	
	

	public int compare(Fruit2 f1,Fruit2 f2) {
		return f1.getcolor().compareTo(f2.getcolor());
	}
}

public class Fruit2 extends Fruit  { // SubClass of Fruit to add color field
	
	String color;
	
	public Fruit2(String name,String color) {
		super(name);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public String getcolor() {
		return color;
	}
	/*public int compareTo2(Fruit2 fruit) {
		// TODO Auto-generated method stub
		return color.compareTo(fruit.getcolor());
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit2> fruitlist = new ArrayList<Fruit2>();
		Fruit2 f1 = new Fruit2("Mango","Green");
		Fruit2 f2 = new Fruit2("Banana","Yellow");
		Fruit2 f3 = new Fruit2("Grapes","Black");
		Fruit2 f4 = new Fruit2("Apple","Red");
		fruitlist.add(f1);
		fruitlist.add(f2);
		fruitlist.add(f3);
		fruitlist.add(f4);
		
		System.out.println(fruitlist.contains(f2));
		System.out.println(fruitlist.contains(new Fruit2("Cherry","Red")));
		
		
		FruitComparator comparator = new FruitComparator();
		
		Collections.sort(fruitlist,comparator);
		Collections.reverse(fruitlist);
		System.out.println(fruitlist);

	}

}
