package Array;

public class DescArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = {'A','D','F','B','C','E'};
		System.out.println("Looping Array");
		for (int i=0; i<ch.length; i++) {
			System.out.println("Character:"+ch[i]);
		}
		
		System.out.println("\nIterating in a Descending Order");
		for(int i=ch.length-1 ; i>=0; i--) {
			System.out.println("Character :"+ch[i]);
		}

	}

}
