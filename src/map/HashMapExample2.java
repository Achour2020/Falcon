package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		/*
		  HashMap: 
		 */
		
		HashMap <String, String> hm = new HashMap <String, String> ();
		
		hm.put("CA", "California"); 
		hm.put("AZ", "Arizona"); 
		hm.put("VA", "Virginia"); 
		hm.put("TX", "Texas"); 
		
		System.out.println("HashMap: " +hm);
		
		// for each 
		
		System.out.println("\nFor Each");
		
		for(Map.Entry me: hm.entrySet()) {
			System.out.println("Key: " + me.getKey() + "\t\tValue: "+ me.getValue());
		}
		
		// Iterator
		System.out.println("\n Iterator");
		Iterator i = hm.entrySet().iterator();
		
		while(i.hasNext()) {
			Map.Entry map = (Map.Entry) i.next(); 
			System.out.println("Key: " + map.getKey() + "\t\tValue: "+map.getValue());
		}
		
		System.out.println("Unsorted HashMap: " +hm);
		// Sort the objects
		
		Map <String, String> s = new TreeMap <String, String> (hm);
		
		System.out.println("\nSoreted HashMap: " +s);
		
		s.clear();
		System.out.println("Cleared: " +s);
		
		// check if Map holds object or not 
		
		System.out.println("Is Map empty: " + s.isEmpty());

	}

}
