package List;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		/*
		  Stack: LIFO --> Last In First Out
		 */
		
		Stack <String> s = new Stack <String> ();
		
		// add --> .push(); 
		s.push("1st Element"); // last -->        3
		s.push("2nd Element"); // middle -->      2 
		s.push("3rd Element"); // top element --> 1 
		
		System.out.println("Stack: " +s); // [ ]  <-- list interface
		System.out.println("Size: " +s.size()); // 0 
		
		// pop(); 
		s.pop(); 
		System.out.println("\nStack: " +s); 
		
		s.pop();
		System.out.println("\nStack: " +s);
		
		s.pop();
		System.out.println("\nStack: " +s);
		
		// s.pop();  // java.util.EmptyStackException
		//System.out.println("\nStack: " +s);
		
		// data structure --> methods
		s.push("1st Element"); 
		s.push("2nd Element");
		s.push("3rd Element"); 
		System.out.println("\nStack: " +s);
		
		//s.peek();// retrieve but not remove
		System.out.println("\nPeek: " +s.peek());
		System.out.println("Stack: " +s);
		
		s.clear();
		System.out.println("Clear: " +s);
		
		s.add(0, "Zero");
		System.out.println("Stack: " +s);

	}

}
