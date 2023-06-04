package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * Exception: unwanted/ unexpected <-- Handle during execution : recoverable
		 */

		String name = null;

		try { // try block
			System.out.println("Name: " + name.length());
		}

		catch (Exception e) { // exception handling
			//
			System.out.println("String Name should not be null");
		}

	}

}
