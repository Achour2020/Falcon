package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		// LinkedHashMap: maintains the insertion order

				LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
				
				lhm.put(1, "Value 1"); 
				lhm.put(3, "Value 3");
				lhm.put(2, "Value 2"); 
				lhm.put(0, "Value 0"); 
				
				Iterator i = lhm.entrySet().iterator();
				while (i.hasNext()) {
					Map.Entry l = (Map.Entry) i.next();
					System.out.println("Key: " +l.getKey() + "\t  " +l.getValue());
				
				}

	}

}
