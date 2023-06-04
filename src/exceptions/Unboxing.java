package exceptions;

import java.util.ArrayList;

public class Unboxing {

	public static void main(String[] args) {
		/*
		  Wrapper class
		  2. unboxing:  Automatically convert Wrapper Class --> Primitive Data type  
		 */
		
		// call 
		// Integer obj = new Integer(45);
		Integer obj = 75; 
		method1(obj);
		
		// Another Example
		Byte b = 32; 
		int number = b; 
		System.out.println("\nB: " + number);
		
		// Another example 
		ArrayList <Integer> listNumber = new ArrayList <Integer>();
		listNumber.add(1);
		listNumber.add(47);
		System.out.println("\nDisplay: " +listNumber);
		int num = (int)listNumber.get(1); 
		System.out.println("Num: " +num);

	}
	
	// method 
	public static void method1 (int number ) {
		System.out.println("Number: " +number);

	}

}
