package exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		/*
		 Exception : is an unwanted or unexpected event which occurs during execution of a program
		 control flow : execution top --> bottom, left --> right (Validation)
		 */

		// 1. Compile Time
				// This is throwing an error and you have to fix before merging to the project
//				int x = 10.9;  // java.lang.Error
//				System.out.println("x: " +x);
				
				
				// 2. Run Time
//				String name = null; 
//				System.out.println("Name: " +name.length()); // NullPointerException
//				
				//               0  1  2  3  4
//				int number [] = {1, 2, 3, 4, 5,}; 
//				System.out.println("Number: " +number[7]);  // ArrayIndexOutOfBoundsException
				
				
				// You can divided number by zero --> / by zero 
				
//				int x = 5; 
//				int y = 0; 
//				int result = x / y; // ArithmeticException
//				System.out.println("Result: " +result);
				
				// NumberFormatExaception 
//				int number = Integer.parseInt("TEKDojo"); // correct --> 50  
//				System.out.println("Number: " +number);
		
	}

}
