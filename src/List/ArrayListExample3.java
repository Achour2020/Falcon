package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// ArrayList --> String 
		
				ArrayList <String> fruit = new ArrayList<String> ();
				
				fruit.add("Orange");
				fruit.add("Peach");
				fruit.add("Apple");
				
				fruit.add("Pineapple");
				fruit.add("Strawberry");
				fruit.add("Banana");
				fruit.add(0, "Kiwi");
				
				System.out.println("Unsorted list of fruit: " +fruit);
				
				// sort the data 
				Collections.sort(fruit);
				System.out.println("\nSorted list of fruits: " +fruit);
				
				// descending 
				Collections.reverse(fruit);
				System.out.println("\nDescending order list of fruits: " +fruit);

	}

}
