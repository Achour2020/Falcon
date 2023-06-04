package basic;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		/*
		 Natural Numbers : 1+2+3+4+5+6+..........+10
		 */
		
		// sum
		int sum = 0;
		int number = 10;
				
		
		// for loop    condition
		for(int i=1; i<=number; i++) {
			
			// body of the loop --> algorithm / recursion / operations
			sum += i;
		}
		// print the sum
		System.out.println("Sum:"+sum);

	}

}
