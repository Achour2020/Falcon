package exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		/*
		 * Arithmetic Exception --> division by zero
		 */

		try {
			int x = 10;
			int y = 0;
			System.out.println("Output: " + (x / y));
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("You can not divide a number by zero");
		}
		

	}

}
