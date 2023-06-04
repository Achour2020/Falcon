package exceptions;

public class FinallyKeyword {

	public static void main(String[] args) {
		/*
		  finally: finally is a block of the code 
		           the statement of finally block execute regardless of the result 
		 */
		
		try { // try block
			int x = 10; 
			int y = 0; 
			System.out.println("Output: " + (x/y));
		} catch (Exception e) { // catch block
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("The operations is done!");
		}

	}

}
