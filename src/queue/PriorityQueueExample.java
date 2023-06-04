package queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		/*
		  Set the data from Highest to the Lowest
		 */
		
		Queue <Double> q = new PriorityQueue<>(Collections.reverseOrder());
		
		// offer
		q.offer(5.1); 
		q.offer(2.1);
		q.offer(3.2);
		q.offer(1.5);
		q.offer(0.1);
		
		System.out.println("Q: " +q);
		
//		q.clear();
//		System.out.println("\nQ: " +q);
//		System.out.println("isEmpty: " +q.isEmpty());
		
		System.out.println(" ");
		
		while(!q.isEmpty()) {
			System.out.println("  "+q.poll()); // retrieve and remove from the PriorityQueue 
		}
		
		System.out.println("\nQ: " +q); // empty 


	}

}
