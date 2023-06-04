package Array;

import java.util.Arrays;

public class ArrayRevision {

	public static void main(String[] args) {
		/*
		 Array: queue, cue, --: a single line or a row
		 */
		
		// declaration + initialization 
		//int [] num = new int [5]; 
		// adding/inserting value/element into array positions
//		num [0] = 1; 
//		num [4] = 5; 
		
		// in a list 
		//      0 1 2 3 4
		int [] num = {1, 3, 2, 4, 5}; // length 5: -- 
		
		System.out.println("Legnth: " +num.length);
		System.out.println("Display: " + Arrays.toString(num));
		
		// Retrieving/ fetching/ getting / selecting the element per index/position
		System.out.println("Index 1: " + num[1]);
		System.out.println("Index 4: " +num[4]);
		
		// out of the box --> ArrayIndexOutOfBoundsException  <-- avoid it 
		// System.out.println("Index 7: " + num[7]);
		
		// print in a for loop
		for(int i =0; i < num.length; i++) { // true --> execute  | false X Stop
			System.out.println(num[i]);
		}
		
		// Sum += 
		int sum = 0 ; 
		for (int i=0; i<num.length; i++) {// true --> execute  | false X Stop
			sum += num[i]; 
		}
		
		System.out.println("Sum: " +sum);
		
		
		// Sort 
		System.out.println("\nUnsorted Array: " +Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("Sorted Array: " + Arrays.toString(num));
		
		// 5. 4 , 3 , 2 , 1 --> reversed array
		for(int i = num.length -1; i>= 0; i--) {
			System.out.println("  " +num[i]);
		}

	}

}
