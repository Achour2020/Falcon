package exceptions;

public class WraperExample1 {

	public static void main(String[] args) {
		/*
		  class: design
		  object: instance of the design
		        1. state --> variable (container/box) 
		        2. behavior --> method
		        
		        
		  Primitive Data type: boolean, char, byte, short, int, long, float, double
		  
		  wrapper class: objects -> attribute          box = element; 
		        --> new keyword
		        --> Converting primitive data type into objects
		        --> Full form of primitive data type starts with Caps
		        
		        Boolean, Character, Byte, Short, Integer, Long, Float, Double
		  
		 */
		
//		int obj = 100; 
//		System.out.println("obj: " +obj);
		
		// Creating a wrapper class object
		Integer obj1 = new Integer(100);
		
		//Convert a wrapper class to int 
		int number = obj1.intValue(); 
		
		System.out.println("Number: " +number);


	}

}
