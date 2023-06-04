package Array;

import java.util.Arrays;

public class StringArrayOfNames {

	public static void main(String[] args) {
		// store names in a Array
		
				//    			   0         1       2       3        4       5       6
				String [] name = {"John", "Ahmad", "Mike", "Zohal", "Sara", "Liya", "Bob"}; 
				
				System.out.println("Length: " +name.length);//  length -1: return index
				
				System.out.println("Display: " +Arrays.toString(name));
				System.out.println("Element at 0: " +name[0]);
				
				Arrays.sort(name);
				System.out.println("\nSorted Display: " + Arrays.toString(name));
				
				// retrieve the element as per index 
				System.out.println("Element at 0: " +name[0]);
				
				System.out.println("\n For each");
				for (String first_name: name) {
					System.out.println(first_name);
				}

	}

}
