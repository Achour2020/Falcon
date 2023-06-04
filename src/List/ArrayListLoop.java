package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoop {

	public static void main(String[] args) {
		/*
		   Iterating throw the ArrayList
		   
		   1. for loop
		   2. for each loop
		   3. while loop 
		   
		   4. Iterator
		 */
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Display in a list: " +numbers);
		System.out.println("Size: "+ numbers.size());
		System.out.println("Index 4: " +numbers.get(4));
		 
		//  1. for loop
		
		System.out.println("\n For Loop ");
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("Number: " + numbers.get(i));
		}
		
		// 2. for each loop
		System.out.println("\n For Each Loop OR Advanced Loop");
		
		for (Integer number: numbers) {
			System.out.println("Number: " +number);
		}
		
		
		//  3. while loop 
		System.out.println("\n While Loop ");
		/*
		  Index:       0  1  2  3  4
		  Elements:   [1, 2, 3, 4, 5] 
		 */
		// create a temporary variable and initialize it to the zero
		int count = 0 ; 
		while (numbers.size() > count) {
			System.out.println("Number: " + numbers.get(count));
			// increment
			count++; 
		}
		
		// 4. Iterator
		System.out.println("\n Iterator ");
		
		// get the method of the object as iterator and then save it to the class Iterator 
		Iterator i = numbers.iterator();
		
		// while --- > hasNext();   next(); 
		while(i.hasNext()) {
			System.out.println("Number: " +i.next());
		}

	}

}
