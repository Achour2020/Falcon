package basic;

public class NestedIfStatement_16 {

	public static void main(String[] args) {
		// Nested if statements: if inside another if
		
				int number = 1; 
				if (number == 10) {
					System.out.println("number is equal");
				} if (number > 10) {
					System.out.println("number is greater than/ equal ");
					
				} else {
					System.out.println("number is smaller");
				}
				
				
				// Nested else if statement
				// Another example 
				System.out.println("\nAnother example ");
				
				
				int num = -555; 
				// check if number is greater than 0
				if (num > 0) {
					System.out.println("The number is a positive number ");
				} 
				// checking if number is less than 0
				// else: otherwise  
				else if (num < 0) {
					System.out.println("The number is a negative number");
				}
				
				// if both condition is false
				else {
					System.out.println("The number is 0");
				}

	}

}
