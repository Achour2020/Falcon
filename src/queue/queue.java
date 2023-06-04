package queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		/*
		  Queue: Interface: FIFO --> First In First Out : set it with LinkedList to see the objects in FIFO phrase
		  
		  PrioriotyQueue: It is a class, and based OR ordered according to the natural orders
		  
		  Set the object from Highest to the Lowest ones  --> Collections.reverseOrder method
		  
		  
		  PriorityQueue: 3rd OR After the 3r object --> Insertion ordered will appeared in the Queue
		 */
		
		Queue <Character> q = new PriorityQueue <>(Collections.reverseOrder()); 
		
		// Add 
		q.add('B'); // 
		q.add('A'); // 
		q.add('D');// 1st 
		q.add('C'); // 2nd 
		
		
		System.out.println("Display Q: " + q); // [ ] 
		System.out.println("Size: " + q.size());
		
		System.out.println("\nHead of the Queue: " +q.element()); // retrieve but does not remove
		System.out.println("Display Q: " + q);
		
		System.out.println("\nPoll the head of Queue: " + q.poll()); // retrieve and remove it
		System.out.println("Display Q: " + q);
		
		System.out.println("\nPoll Again: " + q.poll()); // retrieve and remove it
		System.out.println("Display Q: " + q);
		
		
		// methods in Queue 
		q.offer('E'); 
		System.out.println("\nDisplay Q: " + q);
		
		q.offer('A'); // added a duplicate --> acceptable
		
		// Null Values: --> Not acceptable in PriorityQueue 
		//q.offer(null); 
		//System.out.println("\nDisplay Q: " + q);
		
		
		// Iteration 
		
		System.out.println("\n Iterator ");
		
		Iterator i = q.iterator();
		while(i.hasNext()) {
			System.out.println(" " +i.next());
		}
		System.out.println("\nDisplay Q: " + q);
		
		System.out.println("Contians C: " + q.contains('C')); // Boolean (true OR false) 
		
		
				

	}

}
