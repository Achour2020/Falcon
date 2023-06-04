package List;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		/*
		  LinkedList: Extends the List Interface, an element has a pointer (each content has head and tail)
		             has more data structure over the ArrayList
		 */
		
		// Creating a LinkedList 
		
		LinkedList <String> ll = new LinkedList<String> ();
		
		System.out.println("Display: " +ll); // [ ] <-- list 
		System.out.println("Size: " +ll.size()); // 0 
		
		// add
		ll.add("John"); 
		ll.add("Mario");
		ll.add("Ahmad"); 
		ll.add("Bob");
		
		System.out.println("\nDisplay: " +ll); 
		System.out.println("Size: " +ll.size()); 
		
		// More add
		ll.add(0, "Susan");
		ll.addFirst("Sara");
		
		ll.addLast("Mike");
		
		System.out.println("\nDisplay: " +ll); 
		
		// get the index  0      1      2     3        4    5    6 
		//               [Sara, Susan, John, Mario, Ahmad, Bob, Mike]
		System.out.println("\nFirst element: " +ll.get(0));
		System.out.println("First element: " +ll.getFirst());
		
		System.out.println("Last element: " +ll.getLast());
		
		/*
		               0     1      2      3 
		   elements: [Sara, Susan, John, Mario, Ahmad, Bob, Mike]
		 */
		
		//System.out.println("Index 0: " + ll.get(0));
		
		// remove --> Mario
		ll.remove(3); 
		ll.removeFirst();
		ll.removeLast();
		System.out.println("\nDisplay: " +ll); 
		
		/* 
		               head <-  0 --> pointer   1    2    tail <-- 3--> null
		    elements:  [       Susan,         John, Ahmad,         Bob]
		 */
		// add an element to the tail
		ll.offer("Zaki"); // add specific element to the tail of the list 
		ll.add("zaki"); // appends to the end of the list
		ll.offerLast(null); // insert the element at the end of the list
		System.out.println("\nDisplay: " +ll);
		
		// head of the list
		ll.offerFirst("Steve"); 
		System.out.println("\nDisplay: " +ll);
		
		

	}

}
