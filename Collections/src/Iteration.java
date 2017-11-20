import java.util.ArrayList;
import java.util.Iterator;

class Fruit3{ //Class for making fruitlist
String name; 
String color;
	
	public Fruit3(String name,String color) { //Constructor
		this.name = name;
		this.color=color;
	}
	
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	
}
public class Iteration { //Class for implementaion of iterator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit3> fruitlist = new ArrayList<Fruit3>();
		Fruit3 f1 = new Fruit3("Mango","Green");
		Fruit3 f2 = new Fruit3("Banana","Yellow");
		Fruit3 f3 = new Fruit3("Grapes","Black");
		Fruit3 f4 = new Fruit3("Apple","Red");
		fruitlist.add(f1);
		fruitlist.add(f2);
		fruitlist.add(f3);
		fruitlist.add(f4);
		
		Iterator<Fruit3> itr = fruitlist.iterator();
		int count =0;
		
		while(itr.hasNext())
		{
			Fruit3 fruit = itr.next();
			++count;
			System.out.println("fruit "+count+":"+fruit.getname()+" is "+fruit.getcolor());
		}

	}

}
