package stringClass;

public class IntToString {

	public static void main(String[] args) {
         /*
          * Convert the int to a String valu
		 * class: blue print 
		 * object: instance of the class 
		 * state --> variable/containers <--
		 */
		int x = 111;

		int y = 4;

		String str = String.valueOf(x);

		System.out.println("Result X & Y: " + (x + y));

		System.out.println("Conversion: " + str + y);
	}
}