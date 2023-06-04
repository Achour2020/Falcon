package Array;

public class MaxArray {

	public static void main(String[] args) {
		/*
		 * 1,2,3,4,5,6,7,8,9
		 Max = ?
		 */
		
		int[]numbers = {1,2,3,4,5,6,7,8,9};
		
		// Find the largest element :    > greater than 
		int max = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			// condition
			if(numbers[i]> max) {
				max = numbers[i];
			}
			
		}
		// printing maximum
		System.out.println("Maximum Numbers:"+max);
		

	}

}
