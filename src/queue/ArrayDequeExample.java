package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		/*
		  Queue --> Interface: FIFO 
		  
		  Deque --> Interface: Idea --> Contents have pointers (implementor to execute the objects) 
		  
		 			ArrayDeque: It is a class, provides a way to apply resize - able array. It is also called Array Double Ended Queue
		 			1. Insertion matters --> 
		 			2. Duplicates acceptable 
		 			3. Null Values are not acceptable
		 			4. ArrayDeque class is not thread safe 
		 			5. ArrayDeque constant time of performance for inserting data
		 			
		 			
		 			API --> Application Programming Interface
		 			
		 			     Client   <----Server----> Database (empty) 
		 			
		 			Array: is a single line or row. Array is fixed in size.
		 			 
		 */
		
		Deque <String> dq = new ArrayDeque <> (); 
		
		// Add 
		dq.add("Susan"); 
		dq.add("John");
		dq.add("Sara");
		dq.add("Ahmad");
		
		// duplicate
		dq.add("Susan");
		
		// null 
//		dq.add(null);
		
		System.out.println("Display DQ: " + dq);
		System.out.println("Size: " +dq.size());
		
		// Iterate 
		System.out.println("\n For Each ");
		
		for(String name : dq) {
			System.out.println("  " +name);
		}
		
		// Data structure implementation for Deque (resize-able array) 
		
		dq.offer("Jim");
		System.out.println("\nDisplay DQ: " + dq);
		
		//dq.poll();
		//dq.clear();
		System.out.println("\nEmpty DQ: " + dq);
		
		//dq.pollFirst();// retrieve the first data --> but if the Queue is empty: returns null 
		System.out.println("\nPoll First: " + dq.pollFirst());
		System.out.println("Poll Last: " +dq.pollLast());
		
//		System.out.println("\nDisplay DQ: " + dq);
//		
//		while(!dq.isEmpty()) {
//			System.out.println(" " +dq.poll());
//		}
		
		// display
		
		// Methods 
//		dq.remove("Sara");
//		dq.removeFirst();
//		dq.removeLast();
		
		dq.push("Mike"); // pushes an element to the stack of queue
		dq.add("Blaine"); // add will add at specified queue --> end of queue 
		
		System.out.println("\nDisplay DQ: " + dq);
		
		/*
		 Index:       0      1      2    3       4      5
		 Display DQ: [Mike, John, Sara, Ahmad, Susan, Blaine]
		 */
		//dq.clear();
		System.out.println("Size: " +dq.size());
		System.out.println("isEmpty: " +dq.isEmpty()); // true 
		
		System.out.println("\nDisplay DQ: " +dq.toArray()[0]);
		
		System.out.println("Pop Mike: " +dq.pop());
		System.out.println("\nDisplay DQ: " + dq);

	}

}
