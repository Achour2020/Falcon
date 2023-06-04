package basic;

public class WhileLoopAlphabet {

	public static void main(String[] args) {
		/*
		  while --> A - Z
		  while --> Z - A
		 
		 */
		
		char c = 'A';
		while (c <= 'Z') {
			System.out.print(" "+c);
			c ++;
			
		}
		// decrement Z --> A
		System.out.println("\n");
		char ch = 'Z';
		while ( ch >= 'A') {
			System.out.print(" "+ch);
			ch--;
		}

	}

}
