import java.util.*;

public class GenericsTest { // Class to show the use of Generics in arraylist

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList> matrix = new ArrayList<ArrayList>();

		for (int i = 0; i <= 10; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();

			for (int j = 0; j <= 10; j++)
				row.add(i * j);

			matrix.add(row);

		}
		for (ArrayList ar : matrix)
			System.out.println(ar);
	}

}
