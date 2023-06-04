package exceptions;

public class Autoboxing {

	public static void main(String[] args) {
		/*
		  Primitive Data --> Wrapper Class 
		  
		  1. Auto-boxing: Automatic conversion of primitive data types to the object of their corresponding wrapper class
		  
		   int --> Integer 
		   byte --> Byte
		 */
		
		// call 
		method1(10);
		
		// Another example
		
		Integer x = 5; 
		System.out.println("\nX: " +x);
		
		Byte b = 78; 
		System.out.println("\nbyte: " +b );

	}
	
	// method 
	
	public static void method1 (Integer number) {
		System.out.println("Display: " +number);

	}

}
