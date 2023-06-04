package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableExample1 {

	public static void main(String[] args) {
		/*
		 * Hashtable: any non null ( no null objects) can be used as key or a value
		 */

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		System.out.println("Hashtable: " + ht); // { } <-- map interface
		System.out.println("Size: " + ht.size()); // 0

		// add --> .put();
		ht.put(5, "Five");
		ht.put(1, "One");
		ht.put(4, "Four");
		ht.put(2, "Two");
		ht.put(3, "Three");

		// null object --> not acceptable into the Hashtable
		// ht.put(null, null);
		// ht.put(null, "object"); // because "key" is null
		// ht.put(15, null); // value can not be null

		System.out.println("\nHashtable: " + ht); // K=V

		// iterate --> loop

		// get a set of the entries --> key and value

		Iterator i = ht.entrySet().iterator();

		while (i.hasNext()) {
			Map.Entry hash = (Map.Entry) i.next();
			System.out.println("Key: " + hash.getKey() + "\t\tValue: " + hash.getValue());
		}

		// methods in Hashtable
		ht.clear();
		boolean flag = ht.isEmpty(); 

		System.out.println("\nHashtable: " + ht);
		System.out.println("Hashtable is empty? " +flag);


	}

}
