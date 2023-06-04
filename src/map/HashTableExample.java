package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		/*
		 * Hashtable: similar with HashMap- synchronized, store into key value pair,
		  --> Any non null can not be used as key or value
		 */

		Hashtable<String, String> ht = new Hashtable<String, String>();

		System.out.println("HashTable: " + ht);
		System.out.println("Size: " + ht.size());

		// add --> put

		ht.put("Key1", "Steve"); // Jim
		ht.put("Key3", "Sara");
		ht.put("Key2", "Mike");
		ht.put("Key4", "Ahmad");

		// Hashtable: key & value can not be null --> NullPointerException
//		ht.put(null, "Bob"); 
//		ht.put("Key1", null); 

		ht.put("Key1", "Jim"); // duplicate value --> override

		System.out.println("\nHashTable: " + ht);
		System.out.println("Size: " + ht.size());

		// iteration

		Iterator t = ht.entrySet().iterator();
		while (t.hasNext()) {
			Map.Entry table = (Map.Entry) t.next();
			System.out.println("Key: " + table.getKey() + "\t\tValue: " + table.getValue());
		}

		// Enumeration --> hasMoreElement(); <-- boolean return true or false
		// nextElement
		System.out.println("\nEnumeration");
		Enumeration name = ht.keys();

		while (name.hasMoreElements()) {
			String key = (String) name.nextElement();
			//System.out.println("Key: " +key);
			//System.out.println("Value: " +ht.get(key));
			System.out.println("Key: " +key + "\t\tValue: " +ht.get(key));
		}
		
		// Hashtable methods
		// ht.clear();
		// ht.remove("Key1"); 
		boolean key = ht.containsKey("Key5"); // boolean true OR false
		
		boolean value = ht.containsValue("Ahmad"); // boolean true OR false
		
		System.out.println("\nHashTable: " + ht);
		System.out.println("HashTable contains Key5: " +key);
		System.out.println("HashTable contans Ahmad: " +value);

	}

}
