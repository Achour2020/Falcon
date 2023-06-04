package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		/*
		   Collection: a group of individual objects which are represented as a single unit
		   Framework: a framework is a set of classes and interfaces --> project
		   Class: is a blueprint to define objects
		   Object: is an instance(sample) of the class
		   		1. State
		   		2. Behavior
		   		
		   	Collection Framework --> structure of set of classes/ interfaces are ready in methods
		   	List: --> is an interface: it is like a blueprint/ design that contains set of abstract methods (abstractions in OOPs concept)
		   		      is an idea --> implement the idea 
		   		      list accept duplicate values
		   		      list accept null values
		   		      
		    ArrayList --> are dynamic in nature
		 */
		
		// create a List (interface: abstraction) --> generic data type (wrapper class: Integer, Character) 
		// Can not instantiate the object of an interface/abstraction 
		// List <Integer> object = new List <Integer> ();
		
		ArrayList <Integer> object = new ArrayList <Integer> ();
		
		// Create an ArrayList
		ArrayList <String> list = new ArrayList<String> ();
		System.out.println("Display: " +list);  // [ ] 
		System.out.println("Size: " +list.size());
		
		// add some names into the list
		list.add("Jim"); 
		list.add("Tom");
		list.add("Susan");
		list.add("Liya");
		
		System.out.println("Display: " +list);  // [ ] 
		System.out.println("Size: " +list.size());// pre ready methods that can be implement in a design 
		
		// null value 
		list.add(null);
		// duplicates null values
		list.add(null);
		list.add("Jim");
		System.out.println("Display: " +list);
		
		// indexes (location/address) --> position of the objects into the list
		//  0     1    2      3     4     5     6 
		// [Jim, Tom, Susan, Liya, null, null, Jim]
		
		list.add(0, "John");
		System.out.println("Display: " + list);
		
		list.add(4, "Steve");
		System.out.println("Display: " + list);
		
		list.add(9, "Baseem");
		System.out.println("Display: " + list);
		
		// set another value instead of the existing value
		list.set(0, "Dhruv"); 
		
		System.out.println("Dipslay: "+ list);
		
		//    0     1    2     3     4     5      6     7 
		// [Dhruv, Jim, Tom, Susan, Steve, Liya, null, null, Jim, Baseem]
		
		list.set(7, "Joseph");
		System.out.println("Dipslay: "+ list);
		
		// remove 
		list.remove(0);
		System.out.println("Dipslay: "+ list);
		
		/*  0     1    2       3      4    5     
		   [Jim, Tom, Susan, Steve, Liya, null, Joseph, Jim, Baseem]
		 */
		list.remove(5);
		System.out.println("Dipslay: "+ list);
		
		// [Jim, Tom, Susan, Steve, Liya, Joseph, Jim, Baseem]
		
		list.remove("Steve");
		System.out.println("Display: " +list);
		
		// loop --> iterate via the list of the names
		
		// for each/ for advanced loop
		System.out.println();
		for(String  name: list) {
			System.out.println("Name: " +name);
		}
		
		// index -->   .get method 
		System.out.println("\nName: " + list.get(0));
		
		// add new value 
		list.add("Ahmad");
		System.out.println("Display: " +list);

	}

}
