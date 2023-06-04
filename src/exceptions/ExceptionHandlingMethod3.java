package exceptions;

public class ExceptionHandlingMethod3 {

	public static void main(String[] args) {
		/*
		  Print exception --> getMessage()
		 */
		
		int x = 10; 
		int y = 0; 
		
		try {
		System.out.println("Result: " + (x/y)); // / by zero
		} catch (Exception e) {
			// Print the message --> Handling the message of exception in the stack 
			System.out.println(e.getMessage());
		}
		
		System.out.println("x: " +x);

	}

}
