package Array;

import java.util.Scanner;

public class ScannerSumArray {

	public static void main(String[] args) {
		// // Scanner, Array, Sum
		
		// Scanner
		Scanner scan = new Scanner(System.in);
		
		// user is entering the size of array
		System.out.println("Enter the number of elements");
		double number = scan.nextDouble(); 
		
		// declaring an array to take the user input 
		double [] array = new double [(int) number];
		
		System.out.println("Enter array elements of numbers");
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextDouble(); 
		}
		
		// initialize the total in a variable
		double sum = 0; 
		// +=
		for (int i =0; i <array.length; i++) {
			sum += array[i]; 
		}
		
		// Print the total 
		System.out.println("Sum is: " + sum);

	}

}
