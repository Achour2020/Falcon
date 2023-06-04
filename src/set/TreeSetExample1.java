package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		/*
		  TreeSet: red-black tree --> any object that added in set collection
		  				will be sorted in ascending
		 */
		
		TreeSet <Character> ts = new TreeSet<Character>();
		
		System.out.println("TreeSet: " +ts); // [ ] <-- set is empty
		System.out.println("Size: " + ts.size()); // 0 
		
		ts.add('B'); 
		ts.add('C'); 
		ts.add('A');
		ts.add('D'); 
		
		System.out.println("\nTreeSet: " +ts);
		
		System.out.println("\nFor Each");
		for(Character c: ts) {
			System.out.println("  " +c);
		}
		
		// descending set
		System.out.println("\n DescendingSet");
		Iterator di = ts.descendingIterator(); 
		
		while(di.hasNext()) {
			System.out.println("  " +di.next());
		}
		
		// methods --> ready data structure 
		
		ts.remove('D'); 
		ts.clear(); // clear all the values and return empty set 
		
		System.out.println("\nTreeSet: " +ts);
		
		// another example 
		TreeSet <Integer> tsn = new TreeSet<Integer>();
		
			tsn.add(3); 
			tsn.add(1); 
			tsn.add(4); 
			tsn.add(2); 
		
		System.out.println("\nTreeSet Numbers: " +tsn);
		
		// 
		
		
		


	}

}
