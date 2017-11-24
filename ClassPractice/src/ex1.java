
enum Grade{
	Excellent,Good,VeryGood,Bad   //iterable
	                              //every enum constant is an object
	                              //Base class for all enum types - Enum
	                              //Enum objects cannot be made outside
	                              //It can not extend other class but can implement iterfaces
	
}



public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Grade.Bad);
		System.out.println(Grade.Bad.getClass());
		System.out.println(Grade.Bad.getClass().getName());
		//System.out.println(Grade.Bad);
		Grade[] grades = Grade.values();
		
		for(Grade g :grades) {
			System.out.println(g);
			System.out.println(g.ordinal());
		}
		
		
		
		
		

	}

}
