package Array;

import java.util.Arrays;

public class ArraySortDescending {

	public static void main(String[] args) {
		/*
		 Sort in descending order
		 
		 X = {2,5,4,8,7,9,6,1,3};
		 X = {1,2,3,4,5,6,7,8,9};
		 X = {9,8,7,6,5,4,3,2,1};
		 
		 */
		
		int[]x = {2,5,4,8,7,9,6,1,3};
		System.out.println("Unsorted Array:"+ Arrays.toString(x));
		
		// sort
		Arrays.sort(x);
		System.out.println("Sorted Array:"+ Arrays.toString(x));
		
		// descending order : decrement -- from length of the array
		System.out.println("Length:"+ x.length);
		
		for(int i=x.length -1; i>=0; i--) {
			System.out.print(" "+ x[i]);
		}

	}

}
