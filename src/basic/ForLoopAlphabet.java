package basic;

public class ForLoopAlphabet {

	public static void main(String[] args) {
		/*
		 for loop :
		 */
		for (char c = 'A'; c <= 'Z';c ++) {
			System.out.print(" "+ c);
		}
		// enter to a next line  
		System.out.println("\n");
		
		// decrement 
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(" "+ch);
		}
 
	}

}
