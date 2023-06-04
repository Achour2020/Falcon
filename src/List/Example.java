package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		/*
		  List, Set, Map, Queue : ---> Interface: the idea needs an implementor to perform the data structure 
		                               Not possible to instantiate the interface
		  
		  List: 1. ArrayList, 2. LinkedList, 3.Vector, 4.Stack --> class
		 */
		
		List <Integer> number = new ArrayList <Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		
		Collections.reverse(number);
		
		System.out.println("List: " +number); // [ ] <-- List
		
		//Set--> HashSet, LinkedHashSet, TreeSet
		Set <Integer> num = new HashSet <Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println("\nSet: " +num); // [ ] <-- Set 

	}

}
