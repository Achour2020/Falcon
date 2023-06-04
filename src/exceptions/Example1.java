package exceptions;

public class Example1 {

	public static void main(String[] args) {
		/*
		 
		 */

		// calling the method
		// age(17);
		division(10, 4);

	}

	// method
	public static void age(int a) {
		if (a < 18) {
			System.out.println("Not eligible to issue a driving license");
		} else {
			System.out.println("Eligible to issue a driving license");
		}
	}

	// method2
	public static void division(int number1, int number2) {
		int result = number1 / number2;
		try {
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
