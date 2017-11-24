
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ABCDEFGH";
		int l = str.length();
		int l2=l;
		char [] ch = str.toCharArray();
		for(int row=0;row <l;row++) {
			
			for(int col=0;col<l2-1;col++) {
				
				System.out.print(ch[col]+" ");
				
			}
			for(int i=l2;i<l;i++) {
				System.out.print(" ");
			}
			for(int col=l2-1;col>=0;col--) {
				
				System.out.print(ch[col]+" ");
				
			}
			System.out.println();
			
		}
		

	}

}
