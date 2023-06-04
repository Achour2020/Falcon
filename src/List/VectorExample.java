package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		/*
		  The vector class implement a grow-able array of objects
		  
		  Array: is fixed in size and used with primitive data type
		  ArrayList: is dynamic and used with generic data (wrapper class) --> collection 
		 */
		
		// Array: is fixed in size
		int number [] = new int [2];
		// add 
		number [0] = 1; 
		number [1] = 2;
		//number [2] = 3; 
		System.out.println("Array: " +Arrays.toString(number));
		System.out.println("Size: " +number.length);
		
		
		//  ArrayList: is dynamic in nature
		
		ArrayList <Integer> num = new ArrayList <Integer> ();
		// add 
		num.add(1);
		num.add(1);
		num.add(1);
		num.add(1);
		num.add(1);
		
		
		System.out.println("\nArrayList: " +num); // [ ] 
		System.out.println("Size: " +num.size());
		
		
		/*
		   The vector class implement a grow-able array of objects
		   Initial capacity for empty vector is 10  --> if you add 11 element, the capacity will be doubled
		   But if you define initial capacity --> double too
		   
		   Sort the vector --> Collections.sort
		 */
		
		Vector <Integer> v = new Vector <Integer> (); // 
		// add
		v.add(1);
		v.add(2);
		v.add(4);
		v.add(3);
		v.add(5);
		v.add(7);
		v.add(6);
		v.add(9);
		v.add(10);
		v.add(8);
		v.add(11);
		
		System.out.println("\nVector: " +v); // [ ] 
		System.out.println("Size: " +v.size()); // 0
		System.out.println("Capicity: " +v.capacity()); // initial default vector capacity is 10
		
		// for loop
		
		/*
		 Index:      0  1  2  3
		 Elements:  [1, 2, 4, 3, 5, 7, 6, 9, 10, 8, 11]
		 */
		
		// Sort the vector 
		Collections.sort(v);
		Collections.reverse(v);
		
		//Collections.sort(v, Collections.reverseOrder());
		
		System.out.println("\n For Loop Iteration");
		
		for(int i=0; i <v.size(); i++) {
			System.out.println("  " +v.get(i));
		}
		
		// get each index : location of the element in a list [ ] 
		System.out.println("\nIndex 0: " +v.get(0));
		System.out.println("Index 10: " +v.get(10)); // 
		
		// methods --> data structure
		
		System.out.println("\nIndexOf: " + v.indexOf(9));
		/*
		  index :  0    1  2  3  4  5  6  7  8  9  10
		  
		  Vector: [11, 10, 33, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		 */
		
		v.add(2, 33);
		
		v.remove(2); // Vector: [11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		
		//v.removeAll(v); 
		
		v.set(2, 55); // Vector: [11, 10, 55, 8, 7, 6, 5, 4, 3, 2, 1]
		
		// duplicates acceptable
		v.add(55); // vector: [11, 10, 55, 8, 7, 6, 5, 4, 3, 2, 1, 55]
		v.add(null); // Vector: [11, 10, 55, 8, 7, 6, 5, 4, 3, 2, 1, 55, null]
		
		System.out.println("\nVector: " +v);
		
		

	}

}
