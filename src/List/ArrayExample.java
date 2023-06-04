package List;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		/*
		  Arrays --> fixed size
		 */
		
		int [] numbers = new int [5]; 
		numbers [0] = 1; 
		numbers [4] = 5; 
		//numbers [5] = 6;   // can not change the size
		System.out.println("Display: " +Arrays.toString(numbers));
		
		System.out.println("\nNumber: " + numbers[0]);
		
		System.out.println("\n");
		for(int i=0; i< numbers.length; i++) {
			System.out.println("Number: " + numbers[i]);
		}
		
		System.out.println("\n for each loop");
		for (int num : numbers) {
			System.out.println("Num: "+ num );
		}
		
		// index 
		
		/*   0  1  2  3  4
		    [1, 0, 0, 0, 5]
		 */

	}

}
