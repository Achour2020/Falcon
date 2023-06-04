package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample6 {

	public static void main(String[] args) {
		/*
		  List: Interface --> It is a group of individuals items that 
		  					accept duplicate values, accept null values
		  ArrayList is a class, extends methods from List Interface, and dynamic in nature
		 */
		
		ArrayList<Character> l = new ArrayList<Character>();
		
		// add
		l.add('A'); 
		l.add('C'); 
		l.add('B'); 
		l.add('G');
		
		/*
		   indexes:   0  1  2 
		   elements: [F, E, C, B, G, A]
		 */
		l.add(1, 'E');
		l.add(0, 'F');
		l.add(6, 'A');
		
		// remove
		l.remove(1); 
		
		// sort                   0  1  2  3  4  5 
		Collections.sort(l);  // [A, B, C, E, F, G]
		
		
		System.out.println("Size: " +l.size());
		System.out.println("Display: " +l); // [ ] <-- list of the objects
		
		// get the index of each character 
		System.out.println("Character at postion 5: " +l.get(5));
		
		// for each loop 
		System.out.println();
		for(Character character:  l) {
			System.out.println("Character: " +character);
		}
		
		System.out.println("\n For Loop");
		for(int i=0; i<l.size(); i++) {
			System.out.println("Character: " +l.get(i));
		}
		
		// Iterator --> .hasNext();  .next(); 
		System.out.println("\n Iterator ");
		
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println("Character: " +i.next());
		}
		
		// this is an example to apply the .remove object of the method
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Steve");
//		list.add("John");
//		list.add("Mike");
//		
//		// remove the object
//		list.remove("John");
//		list.remove("Steve");
//		System.out.println("\nList: " +list);

	}

}
