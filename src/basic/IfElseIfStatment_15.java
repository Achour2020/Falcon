package basic;

public class IfElseIfStatment_15 {

	public static void main(String[] args) {
		// if else if statement 
		
				/*
				    1 --> 9 : one digit
				    10  --> 99: two digits
				    100 --> 999: three digits 
				 */
				
				int number = 45;
				
				if (number <= 9) {
					System.out.println(number + " is one digit number");
				} else if (number <= 99) {
					System.out.println(number + " is two digits numbers" );
				} else if (number <= 999) {
					System.out.println(number + " is three digits numbers");
				} else {
					System.out.println(number + " is not between 1 to 999 --> out of the range that we're checking conditions");
				}

	}

}
