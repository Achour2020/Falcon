package stringClass;

public class DoubleToString {

	public static void main(String[] args) {
		/*
		 * Convert double value to String
		 */

		double d = 9.99;
		System.out.println("d: " + (d + 5.01));

		String str = String.valueOf(d);

		System.out.println("\nConversion: " + (str + " is the interest rate"));

		// format the fraction number --> f for double
		double num = 0.99;
		System.out.println("\nNum: " + num);

		String str2 = String.format("%f", num);
		System.out.println("Conversion: " + str2);

	}

}
