package Practice;

import java.util.Arrays;

public class Array1DExample1 {

	public static void main(String[] args) {
		/*
		  Array: single row or single line (queue, cue, line up) --> a collection of elements with same types
		 */
		
		// declare an array 
		String [] car = new String [3]; 
		System.out.println("Lenght: " +car.length); // 3 
		
		System.out.println("Dipslay: " +Arrays.toString(car)); // [ ] 
		
		// initialization indexes with literal value
		car[0] = "car1";
		car[1] = "car2";
		car[2] = "car3";
		
		System.out.println("Dipslay: " +Arrays.toString(car));
		
		// retrieve your index array element
		System.out.println("Element at position 0: " +car[0]);// car1
		System.out.println("Element at position 2: " +car[2]); // car3
		
		// retrieve an element which is not in the range of the length  --> ArrayIndexOutOfBoundsException
		
		//System.out.println("Out of the range: " +car[3]); // element 4 
		
		// Looping through array elements
		for(int i=0; i<3; i++) {
			System.out.println("Car: " +car[i]);
		}
		
		// .length of array to loop
		for(int i=0; i<car.length; i++) {
			System.out.println("  " +car[i]);
		}
		
		// for each/ advanced loop/ for enhanced loop
		System.out.println("\nfor each loop");
		
		for(String c: car) {
			System.out.println("Car: " + c);
		}

	}

}
