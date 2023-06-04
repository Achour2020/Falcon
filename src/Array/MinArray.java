package Array;

public class MinArray {

	public static void main(String[] args) {
		// Minimum of array double
		
        int[]numbers = {1,2,3,4,5,6,7,8,9};
		
		// Find the smallest  element :    > greater than 
		int min = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			// condition
			if(numbers[i]< min) {
				min = numbers[i];
			}
			
		}
		// printing maximum
		System.out.println("Minimum Numbers:"+min);
	
		
		
		
		
		
		 

	}

}
