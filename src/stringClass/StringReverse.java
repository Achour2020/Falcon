package stringClass;

public class StringReverse {

	public static void main(String[] args) {

		String text = "Welcome to the Wednesday Java Session";
		System.out.println("Original: " + text);
		String reversed = reverse(text);
		System.out.println("Reversed: " + reversed);
	}

	/*
	 * Creating a method to reverse a string with help of .IsEmpty()
	 * 
	 * hello 0lleh
	 * 
	 * --> chartAt(0)
	 */

	public static String reverse(String text) {
		if (text.isEmpty()) {
			return text;
		}
		return reverse(text.substring(1)) + text.charAt(0);

	}

}
