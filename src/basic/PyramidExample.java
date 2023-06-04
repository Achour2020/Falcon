package basic;

public class PyramidExample {

	public static void main(String[] args) {
		// // Pyramid: 
		 /*
	      
	      * 
	      * *
	      * * *
	      * * * *
	      * * * * * 
	      
	      
	      
	  */

	for (int i = 1; i <= 5; i++) {

		// inner loop
		for (int j = 1; j <= i; j++) {

			System.out.print(" * ");
		
		}

		// print a new line
		System.out.println();
	}

	}

}
