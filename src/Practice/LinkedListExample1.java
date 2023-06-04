package Practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		/*
		   LinkedList: linear data structure
		 */
		// ll --> object 
		LinkedList <String> ll = new LinkedList<String>();
		System.out.println("Display: " +ll); // [ ] 
		System.out.println("Size: " +ll.size()); // 0 
		
		// add object --> LinkedList of Cars
		ll.add("Car1");
		ll.add("Car2");
		ll.add("Car3");
		ll.add("Car4");
		
		
		System.out.println("\nDisplay: " +ll);
		System.out.println("Size: " +ll.size());
		
		// iterate via the list
		System.out.println("\n Iterator ");
		Iterator i = ll.iterator(); 
		while(i.hasNext()) {
			System.out.println("  " + i.next());
		}
		
		// iterate in a reverse
		System.out.println("\n Descending Orders ");
		Iterator ireverse = ll.descendingIterator(); 
		while(ireverse.hasNext()) {
			System.out.println("  "+ ireverse.next());
		}
		
		// display 
		System.out.println("\nDisplay: " +ll);
		System.out.println("Index 0: " +ll.get(0));
		
		// save in a reverse
		Collections.reverse(ll);
		System.out.println("\nReversed: " +ll);
		
		
		/*
		  Index:       0      1   2       3
		  Objects:   [Car4, Car3, Car2, Car1]
		 */
		
		System.out.println("Index 0: " +ll.get(0));
		System.out.println("Index 3: " +ll.get(3));
		
		
		// Replace the object
		ll.set(0, "BMW");
		ll.set(3, "Honda"); 
		System.out.println("\nDisplay: " +ll);
		
		/*
		  .contains(); <-- check whether the object/element exists
		  
		             0     1     2     3
		  Display: [BMW, Car3, Car2, Honda]
		 */
		
		if(ll.contains("Honda")) {
			System.out.println("Car Name: " +ll.get(3));
		} else {
			System.out.println("The LinkedList doesn't have the requested object");
		}
		
		// push();   <-- insert the object at the front of the list
		ll.push("Chevy");
		
		// add with last element
		ll.addLast("Toyota");
		
		// add with index at any location
		ll.add(2, "Hyundai");
		
		// offer();  <-- add the object to tail of the list    
		ll.offer("Car4");
		System.out.println("\nDisplay: " +ll);
		
		
		// pop(); <-- remove the first element and return 
		ll.pop();
		
		//System.out.println("\nPop the first element: " +ll.pop());
		System.out.println("\nDisplay: " +ll);
		
		// remove 
		ll.remove(5);
		System.out.println("\nRemoved: " +ll);
		
		// peek(); <-- retrieve the object and doen't remove it 
		
		System.out.println("\nPeek: "+ ll.peekLast());
		System.out.println("Get object: " +ll.get(2));
		
		// List accept duplicates
		ll.add("Honda");
		System.out.println("Display: " +ll);
	}

}
