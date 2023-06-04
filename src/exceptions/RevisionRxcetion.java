package exceptions;

public class RevisionRxcetion {

	public static void main(String[] args) {
		/*
		  Exception: unwanted / unexpected event which occurs during the run time or execution of a program
		  
		  Error: is happening during the compilation
		 */
		
		
		int x = 5; 
		int y = 0;
		try { 
		System.out.println("x: " + (x/y)); // ArithmeticException 
		} catch (Exception e) {
		  // invoke/ call the method of Exception
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//System.out.println("Division by zero is not acceptable");
		}

	}

}
