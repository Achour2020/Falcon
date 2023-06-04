package stringClass;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// Array --> convert to String

		char[] message = { 'H', 'e', 'l', 'l', 'o' };
		System.out.println("Message: " + Arrays.toString(message));

		String str = new String(message);
		System.out.println("Str: " + str);

		// valueOf
		String str2 = String.valueOf(message);
		System.out.println("\nStr2: " + str2);

	}

}
