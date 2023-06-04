package Assignments;

import java.util.Arrays;

public class A4Q1 {

	public static void main(String[] args) {
		/* Create a Java program to print the duplicate elements of an Integer Array in console. 

         *Requirements:

         *Given Integer Array is: 1, 2, 3, 4, 1, 2, 5, 6, 4, 7, 8, 5, 9, 10
         *Run a nested for loop in a way that each element of the given array is compare with all other elements of the same array
         *Print that element when there is a match found in the given array
             
         *These elements in the given array are duplicates: 

              1

              2

              4

              5
		 */
		
		// declare an array
		
		int[]num = {1,2,3,4,1,2,5,6,4,7,8,5,9,10};
		System.out.println("Length: " +num.length);
		System.out.println("Display:"+Arrays.toString(num));
		
		// Nested for loop 
		
		for (int i=0; i<num.length; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i]==num[j])
					System.out.println(num[i]);
			}
			
		}

		
	}

}
