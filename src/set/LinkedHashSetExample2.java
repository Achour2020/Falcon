package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample2 {

	public static void main(String[] args) {
		/*
		  Set: collections of objects that duplicates does not accepted in the set
		  1. HashSet: it doesn't maintain the order of elements
		  2. LinkedHashSet: it maintains the insertion orders. 
		  3. TreeSet: red-black tree --> any object that added in set collection
		  				will be sorted in ascending 
		 */
		
		LinkedHashSet <String> lhs = new LinkedHashSet <String> ();
		
		System.out.println("LinkedHashSet: " + lhs); // [ ] <-- empty
		System.out.println("Size: "+ lhs.size()); // 0 
		
		
		// add
		
		lhs.add("John"); 
		lhs.add("Bob"); 
		lhs.add("Zara"); 
		lhs.add("Ahmad"); 
		lhs.add(null); 
		
		System.out.println("\nLinkedHashSet: " + lhs); 
		
		// iteration 
		System.out.println("\n For each ");
		for(String name: lhs) {
			System.out.println("Name: " +name);
		}
		
		System.out.println("\n Iterator");
		Iterator i = lhs.iterator(); 
		while (i.hasNext()) {
			System.out.println("Name: " +i.next());
		}
		
		// duplicates --> can not add in set ( compiler will check and pass but during runtime the system ignore it)
		lhs.add("Bob"); 
		lhs.add(null); 
		System.out.println("\nLinkedHashSet: " + lhs);
		
		//More methods --> ready data structure 
		lhs.remove("Zara"); 
		lhs.removeAll(lhs); // return empty set  
		System.out.println("\nLinkedHashSet: " + lhs);

	}

}
