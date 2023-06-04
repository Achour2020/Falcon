package List;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		/*
		 * Stack: implements a data structure --> LIFO : Last In First Out
		 */

		Stack<String> s = new Stack<String>();

		System.out.println("Stack: " + s); // [ ] <-- list
		System.out.println("Size: " + s.size()); // 0

		// add --> push : adding an element to the top of the stack
		s.push("Plate 1"); // 5
		s.push("Plate 2"); // 4
		s.push("Plate 3"); // 3
		s.push("Plate 4"); // 2
		s.push("Plate 5"); // 1

		System.out.println("\nStack: " + s);
		System.out.println("Size: " + s.size());

		// methods
		System.out.println("\nPop Plate 4: " + s.pop()); // remove the top element
		System.out.println("Stack: " + s);

		System.out.println("\nPeek Plate 3: " + s.peek()); // return and doesn't remove
		System.out.println("Stack: " + s);

		s.add("new plate");
		s.add(1, "small plate");
		s.push("Plate 5");
		System.out.println("\nStack: " + s);

		// search
		System.out.println("Search: " + s.search("Plate 2"));

	}

}
