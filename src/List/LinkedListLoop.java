package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLoop {

	public static void main(String[] args) {
		/*
		  
		 */
		
		LinkedList <Integer> num = new LinkedList<Integer>();
		num.add(null);
		num.add(0); 
		num.add(4); 
		num.add(1); 
		num.add(2);
		num.add(3);
		
		System.out.println("LinkedList: " +num); // 
		System.out.println("Size: " +num.size());
		
		// for each
		System.out.println("\nFor each loop");
		for(Integer n : num) {
			System.out.println("  " +n);
		}
		
		// for loop
		System.out.println("\nFor loop ");
	    for(int i=0; i <num.size(); i++) {
	    	System.out.println("  " +num.get(i));
	    }
	    
	    // Iterator
	    System.out.println("\nIterator");
	    Iterator i = num.iterator(); 
	    while(i.hasNext()) {
	    	System.out.println("  " +i.next());
	    }
	    
	    // iterating the descending orders
	    System.out.println("\nDescending orders" );
	    
	    Iterator it = num.descendingIterator();
	    while(it.hasNext()) {
	    	System.out.println("  " +it.next());
	    }
	    
	    //
//	    try {
//	    Collections.sort(num);
//	    } catch (NullPointerException e) {
//	    	System.out.println(e.getMessage());
//	    }
	    
	    //System.out.println("Sorted: " +num);
	    
	    // adding duplicate values
	    num.add(1); 
	    num.add(null);
	   
	    System.out.println("\nDisply: " +num);

	}

}
