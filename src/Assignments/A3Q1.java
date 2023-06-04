package Assignments;

public class A3Q1 {

	public static void main(String[] args) {
		/*   Java Assignment 3 
		 * 
		 * Create a program to convert the below String to char and print each letter
		 * based at index position.
		 * 
		 * Requirement:
		 * 
		 * String is "FEBRUARY" Use for loop for iteration Use String method for each
		 * character at position Iterate and print each character individually
		 * Result/Console:
		 * 
		 * Character at 0 Position: F
		 * 
		 * Character at 1 Position: E
		 * 
		 * Character at 2 Position: B
		 * 
		 * Character at 3 Position: R
		 * 
		 * Character at 4 Position: U
		 * 
		 * Character at 5 Position: A
		 * 
		 * Character at 6 Position: R
		 * 
		 * Character at 7 Position: Y
		 */
		
		String month = "FEBRUARY" ; 
		System.out.println("Month: " +month);
		
		// length --> index (position, location): start from 0 index 
		System.out.println("Lenght: " +month.length());
		
		// for loop
		for(int i=0; i < month.length(); i++) {
			//to read each single character of a String --> .charAt(i); 
			char c = month.charAt(i); // --> char
			System.out.println("\nCharacter at " + i + " Position: " +c);
		}
 
	}

}
