package methodesPractice;


public class MethodOverLoading {

	/*
	  User defined method 
	  
	  Method Overloading: Same method's name plus the different parameter
	 */
	
	static int square(int x) {
		return x;
	}
	
	static int square(int x, int y) {
		return x * y; // 5   10   = 50 
	}
	
	static int square(int x, int y, int z) {
		return x * y * z; // 5 * 10 * 2 = 100 
	}
	
	// method overload with same name but different data types
	static double square(double x, double y) {
		return x * y; //2.5 * 3.5 = 8.75
	}
	
	 static double square (double x, int y) {
		return x * y; // 2.5 * 2 = 5.0
	}
	 
	 // non static 
	 double square (double x, int y, int z) {
			return x * y * z; // 2.5 * 2 * 2 = 10.0
		}
	
	// main method 
	public static void main(String [] args) {
		// calling/ invoking the method
		System.out.println("Square: " + square(5));
		System.out.println("Square: " + +square(5, 10));
		System.out.println("Square: " + +square(5, 10, 2));
		
		// double 
		System.out.println("\nSquare in double: " + square (2.5, 3.5));
		
		// double and integer
		System.out.println("\nSquare in double: " + square (2.5, 2));
		
		// creating an object of the class
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println("\nNon static square:"+ obj.square(2.5,2,2)); 
		
		
	}


}
