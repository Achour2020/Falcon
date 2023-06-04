package basic;

public class LoopStatements {

	public static void main(String[] args) {
		/*
		  Loop statement --> update expression: increment ++ / decrement -- 
		 */
		
		// while loop 
		
		int number = 1; 
		while (number <= 5) { //until the condition is true  | if the condition become false: the cursor jump out of the loop
			System.out.println(number);
			number++; // 6
		}
		
		// Z - A 
		// A - Z
		char c = 'A'; 
		while (c <= 'Z') {
			System.out.print(c + " ");
			c++; 
		}
		
		System.out.println("\n");
		// do while 
		// Z - A
		
		char ch = 'Z'; 
		
		do { // no matter whatever happens print this code block (print once if it is true/false)
			System.out.print(ch + " ");
			ch--; 
		} while (ch >= 'A'); 
		
		System.out.println("\n");
		/*
		   for loop --> initialization, check the condition, update the expression
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count... " +i);
		}
		System.out.println("\n");
		// print the Z to A in a for loop
		for (char alphabet = 'Z'; alphabet >= 'A'; alphabet--) {
			System.out.print(alphabet + " ");
		}
		
		
		System.out.println("\n Multiplication table ");
		/*
		    Multiplication table 
		    5 * 1 = 5
		    5 * 2 = 10
		    5 * 3
		    5 * 4
		 */
		
		int n = 5; 
		for (int i =1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		
		System.out.println("\n Nested for loop");
		
		/*
		   nested for loop: a for loop inside another for loop 
		   
		 */
		
		
		// outer loop
		for (int i = 1; i <= 10; i++) { // true 
			
			// inner loop --> executed until it become false
			for (int j = 5; j <= 10; j++) {
				//System.out.println("i: " + i + "           j: " + j);
				System.out.println(i + " * " + j + " = " + i *  j);
			}
			// new line 
			System.out.println();
			
		}


	}

}
