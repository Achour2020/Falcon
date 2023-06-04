package Assignments;

public class A5Q1 {

	/*
	 * Write a java user defined method to swap/exchange the values of X & Y using a
	 * 3rd Variable.
	 * 
	 * Requirements:
	 * 
	 * The method should be static void and contain two parameterized integers for X
	 * & Y. You should able to pass different numbers for X & Y Call the function of
	 * reverse method to exchange the position of numbers in variables. Output is
	 * mandatory as below screenshot
	 */
	
	public static void swap(int x, int y) {
		
		// 3rd variable t= 3rd variable    2 --> temp   temp = 2 
		
		int t = x; // 2 
		x = y;   // 3  
		y = t;   // 2 
		
		System.out.println("X: " +x  + "\nY: " + y);
		
	}
	
	// main method 
	public static void main (String [] args) {
		// Before swap/exchange 
		System.out.println("Before exchanging values of X & Y: ");
		/*
		  x = 2
		  y = 3; 
		 */
		int x = 2; 
		int y = 3; 
		
		System.out.println("X: " +x  + "\nY: " + y);
		
		// calling the method 
				System.out.println("After exchanging values of X & Y: ");
				swap(x, y);
				
	}
}
