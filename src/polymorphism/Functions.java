package polymorphism;

public class Functions {

	/*
	  Polymorphism: --> poly means many and morph means shape/form
	  1. Overloading method OR Compile Time 
	 */
	public static void multiply() {
		System.err.println("Result of 5 * 2: " + 5 * 2 );
	}
	
	public static int multiply (int a, int b) {
		return a * b; // 
	}
	
	// the same above signature with different parameters to another method: method overloading 
	
	public static double multiply(double a, double b) {
		return a * b; 
	}
	
	public static double multiply(double a, double b, double c) {
		return a * b * c; 
	}
	
	// main method to execute the above overloaded method
	public static void main (String [] args) {
		// directly pass the values to method
		//System.out.println("Numeric Numbers: " + Functions.multiply(2, 5));
		//System.out.println("Fraction Numbers: " + Functions.multiply(2.0, 5.0));
		
		// Creating an object of the class--> without static keyword
		Functions obj = new Functions();
		obj.multiply(); // directly call the method via object of the class
		System.out.println("\nInteger: " +obj.multiply(2, 5));
		System.out.println("Fraction: " +obj.multiply(2.0, 5.0));
		System.out.println("Result of double values: " + obj.multiply(3.0, 2.0, 5.0));
	}
}
