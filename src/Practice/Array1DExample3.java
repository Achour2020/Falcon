package Practice;

import java.util.Arrays;

public class Array1DExample3 {

	public static void main(String[] args) {
		// print the sum with the average from Array1D
		
				int [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
				
				
				System.out.println("Length: " +number.length);
				System.out.println("Display: " +Arrays.toString(number));
				
				System.out.println("\nPrint the sum");
				
				// a temporary variable to hold the value of sum
				int sum =0; 
				
				for(int n :number) {
					// logic to print sum
					sum += n; 
				}
				System.out.println("Sum: " +sum);
				
				// average
				int average = sum / number.length; 
				System.out.println("Average: " +average);

	}

}
