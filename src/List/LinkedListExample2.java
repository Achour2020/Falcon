package List;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		/*
		  LinkedList: Extends the List Interface, an element has a pointer (each content has head and tail)
		             has more data structure over the ArrayList
		 */
		
		LinkedList <Integer> num = new LinkedList<Integer>();
		num.add(1); 
		num.add(2); 
		num.add(3); 
		num.add(4);
		num.add(5);
		System.out.println("LinkedList: " +num);
		/*
		  addFirst(); --> appends the element
		  addLast(); --> last element
		  offer(); --> add to to tail of LinkedList
		  
		  remove(); --> remove the head of the LinkedList
		  remove(0); --> remove the location
		  clear(); -->  remove all the elements from the LinkedList
		  
		  get(0); specific element at position
		  getFirst(); --> the first element
		  getLast(); --> return the last element 
		  
		  peak(); --> retrieve the element but doesn't remove --> head 
		  peakFirst();
		  peakLast(); 
		  
		  poll(); --> retrieve the element and remove the head
		  pollFirst(); get and remove the first element
		  pollLast(); get and remove the last element
		  
		  pop(); --> remove and return the first element
		  
		  push(); --> insert the element at the front of the list
		  
		  set(); --> set/override the element at the specific location 
		  
		  
		 */
		// num.remove();
		// num.remove(0);
		//num.clear();
		
		//System.out.println("\n LinkedList: " +num.poll()); // 1
		
		//num.push(0);
		
		num.set(0, 5);

		
		//System.out.println("\n Pop: "+ num.pop());
		

		System.out.println("\nLinkedList: " +num);

	}

}
