package Practice;

import java.util.Arrays;

public class Array1DExample2 {

	public static void main(String[] args) {
		// declare a 1D array element in a list { }; 
		
				//            0   1  2
				int [] age = {12, 4, 8}; // default value is 0 
				
				System.out.println("Length: " +age.length);
				System.out.println("Display: " +Arrays.toString(age)); // [12, 4, 8]
				
				// index
				System.out.println("Element at index 0: " +age[0]); // 12 
				System.out.println("Element at index 2: " +age[2]); // 8 
				
				// loop
				System.out.println("\nFor Loop");
				for(int i=0; i<age.length; i++) {
					System.out.println("Age: " +age[i]);
				}
				
				// For Each
				System.out.println("\nFor Each");
				for(int a: age) {
					System.out.println("Age: "+a);
				}
				
				// out of the range
				//System.out.println("\nOut of the range: " +age[3]);

	}

}
