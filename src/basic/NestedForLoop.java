package basic;

public class NestedForLoop {

	public static void main(String[] args) {
		/*
		 A for loop inside another for loop
		 */
		
		// outer loop
		
		for (int i=0; i<=3; i++) {
		
	    // inner loop
		
		for (int j=0; j<=3; j++) {
		
			// print i
			System.out.println("i:"+i);
			
		}
		// print a new line 
		System.out.println();
		}

	}

}
