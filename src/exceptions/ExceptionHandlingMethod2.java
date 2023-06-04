package exceptions;

public class ExceptionHandlingMethod2 {

	public static void main(String[] args) {
		/*
		  Print exception --> toString()
		 */
		
		int x = 10; 
		int y = 0; 
		
		try {
			System.out.println("Result: " + (x/y));
		} catch (ArithmeticException e) {
			// to print String method : handle exception
			System.out.println(e.toString());
		}
	}

}
