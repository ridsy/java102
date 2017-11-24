

public class Singlton {

	private int objid;
	static int count =0;
	
	
	 
	public Singlton(int objid) {
		//super();
		this.objid = objid;
		count++;
	}
	
	public static int objCount() {
		return count;
	}
	
}


