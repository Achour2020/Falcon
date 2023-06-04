package map;

import java.util.HashMap;

public class HashMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				HashMap <Integer, String> hm = new HashMap <Integer, String> ();
				
				hm.put(15, "Ahmad");
				hm.put(1, "Sara"); 
				hm.put(7, "Mike"); 
				hm.put(15, "A");
				hm.put(2, "Sara");
				hm.put(3, null); 
				hm.put(3, "Three");
				hm.put(null, "value"); 
				hm.put(null, "newValue");
				
				
				
				System.out.println("HashMap: " +hm);
				
				// existing the object of the Key
				boolean flag = hm.containsKey(2); // boolean flag --> true OR false
				System.out.println("Key 2 exist in HashMap: " +flag);
				
				System.out.println("\nKey 7 exists? : " +hm.containsKey(7));
				
				// Value
				System.out.println("\nSara is attended: " +hm.containsValue("Sara"));
				
				
				
				// Copy all the HashMap into another HashMap
				System.out.println("\nHashMap: " +hm);
				
				HashMap<Integer, String> map2 = new HashMap<Integer, String> ();
				
				System.out.println("Map2: " +map2);
				map2.putAll(hm);
				
				System.out.println("\nMap2: " +map2);
				
				// get 
				System.out.println("\nGet Key 7: " + map2.get(7));

	}

}
