package set;

import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		/*
		  Set: collection of data that doesn't contain duplicates
		  1. HashSet --> It makes no guarantees as to the iteration order of the set
		  				can not add duplicate, can not accept more than one null value, can not add with index,
		  				
		 */
		
		HashSet<String> hs = new HashSet<String>(); 
		
		// add
		
		hs.add("Pineapple");
		hs.add("Mango");
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Fig"); 
		
		hs.add("Grape");
		hs.add("Apple");
		//hs.add(null);
		hs.add(null);
				
		System.out.println("HashSet: " +hs);
		
		// clear
		//hs.clear();
		//System.out.println("\nCleared HashSet: " +hs);
		
		// isEmpty(); --> check whether the HashSet is empty or not 
		boolean hsempty = hs.isEmpty();
		System.out.println("Is Empty: " +hsempty);


	}

}
