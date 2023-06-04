package exceptions;

public class ExceptionHandlingMethod1 {

	public static void main(String[] args) {
		/*
		  Exception:  print your console: stack trace 
		 */
		
		int x = 10; 
		int y = 0; 
		

		try {
			System.out.println("Result: "+  (x / y) );
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
