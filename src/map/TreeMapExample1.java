package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		/*
		  TreeMap: a key value pair that implement the iteration objects in ascending order
		 */
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		tmap.put(1, "Value 1"); 
		tmap.put(3, "Value 3");
		tmap.put(2, "Value 2"); // two
		tmap.put(0, "Value 0"); 
		tmap.put(2, "Two");
		tmap.put(4, "Two");
		
		Iterator i = tmap.entrySet().iterator(); 
		
		while(i.hasNext()) {
			Map.Entry tree = (Map.Entry) i.next(); 
			System.out.println("Key: " +tree.getKey() + "\t\t " +tree.getValue());
			
		}
		
		System.out.println("\nSiz: " +tmap.size());

	}

}
