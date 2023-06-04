package Practice;

public class ReverseString {

	public static void main(String[] args) {
		/*
		  TEK Dojo   --> ojoD KET
		 */
		//             012
		String name = "TEK Dojo";
		
		System.out.println("Name: " +name);
		
		// reverse 
		String reversed = reverse(name);
		System.out.println("Reversed: " +reversed);
		
		// sub string  01234
		String text = "Hello"; 
		System.out.println("\nText: " +text);
		System.out.println("SubString: " +text.charAt(0));

	}
	
	// method
	public static String reverse(String name) {
		
		if (name.isEmpty()) {
			return name; 
		}
		return reverse(name.substring(1))+ name.charAt(0);

	}

}
