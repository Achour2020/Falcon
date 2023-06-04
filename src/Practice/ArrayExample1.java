package Practice;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		/*
		 Array: it is a single line or row with
		 
		 Primitive Data Type: int (o), double(0.0), String (null), char (ASCI code) 
		 */
		
		// create array to define the size
		int number [] = new int [3]; 
		number [1] = 15; 
		number [2] = 25;
		number [0] = 5; 
		//number [4] = 35; // not allowed
		System.out.println("Display: " +Arrays.toString(number)); // [0, 0, 0]
		
		// create array is with the list
		int num [] = {100, 6, 7, 4 , 3, 8, 19, 15, 12, 2, 3, 4, 5, 1, 100, 1, 2}; 
		System.out.println("\nNum: "+Arrays.toString(num));
		
		/*
		  index: 0  1  2  3  4
		   Num: [1, 2, 3, 4, 5]
		 */
		// total of the array 
		
		int total = 0; 
		for(int i=0; i <num.length; i++) {
			total = total + num[i]; 
		}
		//System.out.println("Index 0: " +num[0]);
		System.out.println("Total: " +total);
		
		// average of the array
		double average = total / num.length; 
		
		System.out.println("\nAverage: " +average);
		
		/*
		 Num: [10, 6, 7, 4, 3, 8, 19, 15, 12, 2, 3, 4, 5]
		 */
		// sort array 
		//Arrays.sort(num);
		System.out.println("\nSorted: " +Arrays.toString(num));
		
		// reverse / descending orders  <-- get back on this method
		// Arrays.sort(num, Collections.reverseOrder());
		
		
		// find the smallest/largest array
		
		int l = num [0];
		
		for (int i=0; i<num.length; i++) {
			// compare
			if (num[i] > l)
			l = num[i];
		}
		System.out.println("largest: " +l);
		
		/*
		 index  0  1   2  3  4            
		 num = [10, 6, 7, 4, 3, 8, 19, 15, 12, 2, 3, 4, 5, 1, 100]
		 */
		// How to print the duplicate value in array 
		for(int i=0; i<num.length; i++) {
			// inner 
			for(int j= i + 1; j<num.length; j++) {
				// compare 
				if (num[i] == num[j]) {
					System.out.println("Duplicate: " + num[j]);
				}
			}
		}
		
		// How to print the duplicate with Array String? 
		System.out.println();
		String name [] = {"Mike", "Steve", "Mike", "Sara", "Sara", "Steve"}; 
		for(int i=0; i< name.length; i++) {
			// inner 
			for(int j= i + 1; j<name.length; j++) {
				// compare 
				if (name[i].equals(name[j])) {
					System.out.println("Duplicate: " + name[j]);
				}
			}
		}

	}

}
