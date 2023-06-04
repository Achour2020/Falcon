package methodesPractice;

import java.util.Scanner;

public class SystemDefinedMethod {

	// System JDK already contains the methods --> specific task: codes 
	
		// main method 
		public static void main (String [] args) {
			
			// containers 
			//             0123456             20
			String text = "Java is easy to learn"; 
			System.out.println("Lenght: " +text.length());
			
			System.out.println("Upper Case: " +text.toUpperCase());
			
			System.out.println("Index 20: " +text.charAt(20));
			System.out.println("Index 19: " +text.charAt(19));
			System.out.println("Replaced Text: " +text.replace(text, "Java Is Easy To Learn"));
			
			// Math
			
			// 2 * 2 * 2 = 8    2^3 
			double result =  Math.pow(2, 3); 
			System.out.println("Power 2^3: " +result);
			
			// 
			System.out.println();
			Scanner obj = new Scanner(System.in);
			obj.nextLine(); 
		}
}
