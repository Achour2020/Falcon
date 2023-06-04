package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		/*
		  ArrayList --> dynamic in nature
		 */

		ArrayList <Integer> number = new ArrayList<Integer>();
		System.out.println("Size: " +number.size()); // 0 
		System.out.println("List of numbers: " +number); // [ ]  empty
		
		// add new elements --> objects 
		number.add(5); 
		number.add(1);
		number.add(4);
		number.add(3);
		
		System.out.println("List of numbers: " +number);
		
		/*   0  1  2  3 
		    [5, 1, 4, 3]
		 */
		
		number.add(0, 2);
		System.out.println("List of numbers: " +number);
		
		/* indexes:    0  1  2  3  4
		  elements:   [2, 5, 1, 4, 3]
		 */
		
		// duplicates
		number.add(2); 
		System.out.println("List of numbers: " +number);
		
		// remove
		number.remove(5); 
		System.out.println("List of numbers: " +number);
		
		/*
		   indexes:   0  1  2  3  4
		   elements: [2, 5, 1, 4, 3]
		 */
		
		System.out.println("Index 0: " +number.get(0));
		
		// sort the data 
		Collections.sort(number);
		System.out.println("\nSorted list of numbers: " +number);
		
		/*
		   indexes:   0  1  2  3  4
		   elements: [1, 2, 3, 4, 5]
		 */
		
		System.out.println("Index 0: " +number.get(0));
		
		// How about descending order?
		
		Collections.reverse(number);
		System.out.println("\nReversed list of numbers: " +number);
		System.out.println("Index 0: " +number.get(0));

	}

}
