package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDuplicates {

	public static void main(String[] args) {
		// Get the occurrence of the duplicates elements
		
				ArrayList <Integer> numbers = new ArrayList<>();
				
				/*
				   Index   :    0  1  2   3   4  5  6  7  8  9
				   Elements:   [1, 2, 3,  1,  2, 4, 3, 1, 4, 9]
				 */
				numbers.add(null); 
				numbers.add(1); 
				numbers.add(2); 
				numbers.add(3); 
				numbers.add(1); 
				numbers.add(2); 
				numbers.add(4); 
				numbers.add(3); 
				numbers.add(1);
				numbers.add(4);
				numbers.add(9);
				numbers.add(null); 
			
				
				System.out.println("Display: " +numbers);
				System.out.println("Occurence of element 1: " +numbers.lastIndexOf(1));
				System.out.println("Occurence of element 4: " +numbers.lastIndexOf(4));
				
				// if the element doesn't exist --> return -1
				System.out.println("Ocurrence of element 15: " +numbers.lastIndexOf(15));
				
				// 
				Collections.reverse(numbers);
				System.out.println("\nReversed order: " +numbers);

	}

}
