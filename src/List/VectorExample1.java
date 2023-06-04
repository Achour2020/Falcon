package List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		/*
		  Vector: a grow-able array of objects
		 */
		
		Vector <String> v = new Vector<String>(2);
		// add --> .add(); 
		v.add("Steve");
		v.add("John"); 
		
		v.add("Sara"); // 3rd element --> doubled to 4
		v.add("Mike"); 
		
		v.add("Baseem"); // 5th element --> doubled to 8
		
		System.out.println("Vector: " +v); // [ ] <-- list interface 
		System.out.println("Size: " +v.size()); // 0 
		System.out.println("Capacity: " +v.capacity());
		
		// add more elements 
		v.add(2, "Liya");
		System.out.println("\nVector: " +v);
		
		v.set(0, "Yousuf"); 
		System.out.println("\nVector: " +v);
		
		// Iterate --> Enumeration 
		System.out.println("\n   Enumeration ");
		Enumeration en = v.elements();
		
		while (en.hasMoreElements()) {
			System.out.println("\t" + en.nextElement());
		}
		
		// Can i use another loop? --> Yes
		System.out.println("\n For Loop");
		
		for(int i=0; i<v.size(); i++) {
			System.out.println("   " +v.get(i));
		}
		
		v.add("Ahmad");
		
		/*
		 Index:   0         1     2    3     4     5 
		 Vector: [Yousuf, John, Liya, Sara, Mike, Baseem]
		 */
		System.out.println("\nBefore Sorting: " +v);
		System.out.println("Index 5: " +v.get(5));
		
		// methods
		Collections.sort(v);
		System.out.println("\nAfter Sorting: " +v);
		System.out.println("Index 0:" +v.get(0));
		
		
		// Search 
		int location = v.indexOf("Mike");
		System.out.println("Location: " +location);
		
		// remove
		v.remove(5); 
		System.out.println("\nRemoved: " +v);

	}

}
