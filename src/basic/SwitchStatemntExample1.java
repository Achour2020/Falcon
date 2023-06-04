package basic;

public class SwitchStatemntExample1 {

	public static void main(String[] args) {
		/*
		  switch: (condition)
		  case: (expression match with the case)
		  break: (check another condition)
		  default: (otherwise, else, not in the range)
		 */
		
		/*
	    1  : one digit
	    10 : two digits
	    100 : three digits 
	 */
		int number = 100; 
		
		switch (number) {
		
		case 1: 
			System.out.println("One digit number");
			break; 
			
		case 10: 
			System.out.println("Two digits numbers");
			break; 
			
		case 100: 
			System.out.println("Three digits numbers");
			break; 
			
			default: 
				System.out.println("Not in the range of the expression to match case");
		}

	}

}
