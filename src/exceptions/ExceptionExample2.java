package exceptions;

public class ExceptionExample2 {

	public static void main(String[] args) {
		String str = null;

		try {
			System.out.println("Length: " + str.length());
			System.out.println(str.toUpperCase());
			// System.out.println(10/0);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Some random exception");

		}

		// multiple catch block
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("You String initialization should not be NULL!");
			System.out.println("Message: " + e.toString());
		}

		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception");

		}

		finally { // finally block will executed at any point
			System.out.println("\nEnd of the program! ");
		}

	}

}
