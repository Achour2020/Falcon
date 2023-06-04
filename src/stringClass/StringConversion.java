package stringClass;

public class StringConversion {

	public static void main(String[] args) {
		/*
		 * String: --> Primitive data type, a reference type " " 
		               immutable: we can not change that
		 */

		String str = "120"; // number
		int x = 10;

		/*
		 * Convert the String to an integer value
		 */

		int number = Integer.parseInt(str);

		System.out.println("Str: " + (number + x));

		//
		int a = 00001;

		String str2 = "25";
		int car = 010;
		System.out.println("\nLength: " + str2.length());
		/*
		 * String conversion to integer with leading the zeroes 
		 format specifier --> %     d --> use for number
		 */

		str2 = String.format("%d", Integer.parseInt(str2) + car);
		System.out.println("str2: " + str2);

	}

}
