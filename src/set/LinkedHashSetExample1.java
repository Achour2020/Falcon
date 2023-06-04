package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {
		/*
		  Set: duplicate is not acceptable
		  2. LinkedHashSet: maintains the insertion order  --> get sorted in same order/sequence 
		 */
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		System.out.println("LHS: "+lhs);
		System.out.println("Size: "+lhs.size());
		
		// add
		lhs.add("Steve");
		lhs.add("John");
		lhs.add("Mario");
		lhs.add("Mike");
		System.out.println("\nLHS: "+lhs);
		
		LinkedHashSet <Integer> lhs1 = new LinkedHashSet <Integer> ();
		lhs1.add(1);
		lhs1.add(5);
		lhs1.add(2);
		lhs1.add(4);
		lhs1.add(3);
		System.out.println("\nNumbers: "+lhs1);
		
		//lhs1.clear();
		
			
		

	}

}
