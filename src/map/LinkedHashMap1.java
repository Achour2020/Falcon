package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		/*
		 * Map: key value pair --> K, V
		 * 
		 * 1. HashMap: it does not maintain the order 
		 * 2. LinkedHashMap: maintains the insertion order 
		 * 3. TreeMap: red black tree --> sort the objects/ entries in ascending order of keys
		 */

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		// add into a set of entries
		lhm.put(15, "Steve"); // Override the Steve name
		lhm.put(17, "John");
		lhm.put(2, "Mike");
		lhm.put(null, null); 

		// Key can not be duplicate
		lhm.put(15, "Susan"); // Susan overrides Steve name

		// value can be duplicates
		lhm.put(1, "John");

		System.out.println("LinkedHashMap: " + lhm); // { } <-- represent the set of entries in key value pair K=V
		System.out.println("Size: " + lhm.size());

		// Iteration --> How do you print the set of entries in a map collection ?
		// first the taking the entry set of object and then connect them with iterator
		// method to loop the data
		Iterator iteration = lhm.entrySet().iterator();

		while (iteration.hasNext()) {

			Map.Entry entry = (Map.Entry) iteration.next();

			System.out.println("Key: " + entry.getKey() + "\t\tValue: " +entry.getValue());

		}
		
		
		// For Each 
		System.out.println("\n For Each");
		for (Map.Entry m: lhm.entrySet()) {
			System.out.println("Key: " +m.getKey() +"\t\tValue: " +m.getValue());
		}

	}

}
