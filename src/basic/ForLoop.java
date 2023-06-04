package basic;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 for loop : iterative approach
		 initial expression : x = 0  | variable_name = value
		 condition: --> true : execute  | false : not executing 
		 updateExpression : increment ++ / decrement --
		 */
		
		// increment 
		for (int number = 1; number <= 5; number ++) {
		System.out.println("Number:"+number);
		}
		
		// decrement
		System.out.println("\n");
		for(int i = 5; i >= 1; i--) {
			System.out.println("Count:"+i);
		}
	}

}
