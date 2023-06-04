package Practice;

import java.util.Arrays;

public class CopyingArrayElements {

	public static void main(String[] args) {
		// Copying Array into another Array
		
				int [] number = {9, 8, 7, 6, 5, 4, 3, 2 ,1}; 
				
				System.out.println("Display number: " +Arrays.toString(number));
				
				// 1. Copying 
				int [] num = number; // copying arrays using the assignment operator 
				System.out.println("Dispaly num: " +Arrays.toString(num));
				
				// 2. Using loop
				System.out.println("Length: " +number.length);
				
				int [] newLocation = new int [9]; 
				
				for (int i =0; i<number.length; i++) {
					// copying array into another array
					newLocation[i] = number[i]; 
				}
				System.out.println("newLoation: " +Arrays.toString(newLocation));

	}

}
