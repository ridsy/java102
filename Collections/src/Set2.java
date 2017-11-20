import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Set2 extends Fruit2 {

	public Set2(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<Fruit2> fruitlist = new HashSet<Fruit2>();
                fruitlist.add(new Fruit2("Mango","yellow"));
                fruitlist.add(new Fruit2("Apple","Red"));
                fruitlist.add(new Fruit2("Orange","Orange"));
                fruitlist.add(new Fruit2("Mango","yellow"));
                
                System.out.println("Size : "+ fruitlist.size());
                
                ArrayList<Fruit2> fl = new ArrayList<Fruit2>(fruitlist);
        		
        		Collections.sort(fl);
 
        		System.out.println(fl);
                
      
	}

}
