package methodesPractice;

public class EvenOdd {

	public static void main(String[] args) {
		findEvenOdd(9); 

	}
	/*
	 *  user defined method to get Even and Odd number 
	     Even: 2 4 6 
	     Odd: 1 3 5 
	 */
	
	// user defined
	
	public static void findEvenOdd(int num) {
		
		// operations
		if(num % 2 == 0) {
			System.out.println("It is an Even Number");
		} else {
			System.out.println("It is an Odd Number");   
		}

	}

}
