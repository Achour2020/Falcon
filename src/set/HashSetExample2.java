package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {
		/*
		  Set: Interface that doesn't accept duplicates
		  1. HashSet: no guarantee with insertion, can not add duplicates
		 */
		
		HashSet <Character> hs = new HashSet<Character>();
		
		System.out.println("HashSet: " +hs); // [ ] 
		System.out.println("Size: " +hs.size()); // 0
		
		// add 
		
		hs.add('B'); 
		hs.add('A');
		hs.add('D');
		hs.add('E');
		hs.add('C');
		//hs.add('A'); // JVM pass the compilation for duplicates but does not print the duplicate object 
		hs.add(null);
		//hs.add(null);
		System.out.println("\nHashSet: " +hs);
		
		// Iteration 
		System.out.println("\n Iterator ");
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println("  " +i.next());
		}
		
		// for each 
		System.out.println("\n For Each ");
		for(Character c: hs) {
			System.out.println("  " +c);
		}
		
		
		
		// clear
		hs.clear();
		System.out.println("\nCleared HashSet: " +hs);
	}

}
