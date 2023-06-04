package List;

import java.util.ArrayList;

public class ArrayListExample5 {

	public static void main(String[] args) {
//
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Steve"); 
		al.add("John"); 
		al.add("Tom"); 
		
		System.out.println("Display: " +al);
		
		// Copy the above list into another a list of names
		
		ArrayList <String> names = new ArrayList<String>();
		
		names.add("Sara");
		System.out.println("\nNames: " +names);
		names.addAll(al);
		
		System.out.println("Names: " +names);
		
		// another addition
		names.addAll(al);
		System.out.println("Names: " +names);
		
		// adding with index position
		
		/*
		  Indexes:  0      1      2      3    4     5     6
		 Elements: [Sara, Steve, John, Tom, Steve, John, Tom]
		 */
		
		names.add(0, "Ahmad");
		System.out.println("\nNames: " +names);
		
		/*
		  Indexes:  0      1      2      3    4     5     6
		 Elements: [Ahmad, Sara, Steve, John, Tom, Steve, John, Tom]
		 */
		
		// add a list into index
		names.addAll(0, al);
		System.out.println("\nNames: " +names);
		
		names.addAll(4, al);
		System.out.println("\nNames: " +names);

	}

}
