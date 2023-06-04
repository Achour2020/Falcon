package stringClass;

public class BooleanToString {

	public static void main(String[] args) {
		// Boolean <-- String

		boolean b = true;

		System.out.println("boolean b: " + b);

		String str = "false";
		Boolean bstr = Boolean.parseBoolean(str);

		System.out.println(bstr);

		// character

		char c = 'a';
		String c1 = "Some Text";
		System.out.println("Ouput: " + (c + " some text"));

		String strC = Character.toString(c);
		System.out.println("\nCoversion: " + (strC + " b "));

		System.out.println("\n Actual example");
		String message = "Hello";
		/*
		 * H e l l o
		 */

		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			System.out.println("Character at " + i + " position: " + ch);
		}

	}

}
