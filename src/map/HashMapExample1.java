package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		/*
	    Map --> store the objects in a key value pair, store value in duplicates but key as duplicate are not allowed
	    1. HashMap: no guarantee with iteration/ insertion does not matter
	 */
	//         key     value
	//         1        One 
	HashMap <Integer, Character> hm = new HashMap<Integer, Character>();
	
	System.out.println("HashMap: " +hm); // { } <-- stored in a map
	System.out.println("Size: " + hm.size());
	
	// adding objects
	hm.put(5, 'F'); // k 5  
	hm.put(1, 'O'); 
	hm.put(2, 'T');
	hm.put(5, 'S'); // take key 5 and add new value 
	hm.put(3, 'T');
	hm.put(7, 'E');
	hm.put(4, 'R');
	hm.put(1, 'A'); 
	
	System.out.println("\nHashMap: " +hm); //  Key = Value
	System.out.println("Size: " + hm.size());
	
	// Iteration --> Set
	Iterator i = hm.entrySet().iterator(); // chaining methods
	
	//Iterator i = s.iterator();
	
	while (i.hasNext()) {
		
		Map.Entry mentry = (Map.Entry)i.next(); 
		
		System.out.println("Key: " +mentry.getKey() + " Value: " +mentry.getValue());
	}
	
	// get object based on Key
	
//	String t = hm.get(2);
//	System.out.println("\nObject at 2: " +t);
//	
//	// some more methods 
//	
//	hm.remove(2); 
//	System.out.println("\nHashMap: " +hm);
	
	
//
	}

}
