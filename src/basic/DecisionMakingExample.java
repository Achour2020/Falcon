package basic;

public class DecisionMakingExample {

	public static void main(String[] args) {
		// if else statement --> comparison operator
		
				int number = 70; 
				
				
				if (number == 50) { // --> true block 
					System.out.println("The number is equal to 50.");
				} 
				
				
				else if (number == 60) {
					System.out.println("The number is equal to 60");
				}
				

				else if (number == 70) {
					System.out.println("The number is equal to 70");
				}
				
				else {// --> false block
					System.out.println("The number is NOT equal.");
				}
				
				
				// switch, case, break, default 
				int num = 1; // case 3 
				
				switch (num) {
				case 1: 
					System.out.println("The number is case 1.");
					break; 
					
				case 2: 
					System.out.println("The number is case 2.");
					break; 
					
				case 3: 
					System.out.println("The number is case 3.");
					break;
					
					default:
						System.out.println("This is not in the range. Enter a correct number to match the case");
						break;
				}
				

	}

}
