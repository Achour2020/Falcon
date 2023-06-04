package basic;

public class LogicalOperators_8 {

	public static void main(String[] args) {
		/*
		 Logical operators: to check whether an expression is true or false --> decision making
		 && logical and : true only if both expression 1 and expression 2 are true ( both expressions are true) --> true
		 || logical or : true if either expression 1 or expression 2 is true ( one expression is true ) --> true
		 */

		// && operator
		System.out.println(5>3); //true
		System.out.println(9>2); // true
		
		// expression 1 (5>3)          Expression (9>2)
		System.out.println((5>3) && (9>2) ); // true
		
		// && Operator : if one side is false --> return false 
		System.out.println((2>3) && (9>2) ); // false 
		
		// || Operator 
		System.out.println(  (5>3) || (9>2) ); // true
		System.out.println(  (1>3) || (0>2) ); // false
		System.out.println(  (5>3) || (0>2) ); // true
		System.out.println(  (1>3) || (9>2) ); // true
		
		// Another example
				System.out.println("\nAnother example");
				
				int x = 5; 
				// &&                            false     true
				System.out.println("&& result: " + (x < 3 && x < 10 ) ); // false
				
				// ||							false        true
				System.out.println("|| result: " + (x < 3 || x < 10 ) ); // true
		
	}

}
